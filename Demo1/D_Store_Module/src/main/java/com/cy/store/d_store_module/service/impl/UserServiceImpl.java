package com.cy.store.d_store_module.service.impl;

import com.cy.store.d_store_module.entity.User;
import com.cy.store.d_store_module.mapper.UserMapper;
import com.cy.store.d_store_module.service.IUserService;
import com.cy.store.d_store_module.service.ex.InsertException;
import com.cy.store.d_store_module.service.ex.PasswordNotMatchException;
import com.cy.store.d_store_module.service.ex.UsernameDuplicatedException;
import com.cy.store.d_store_module.service.ex.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

@Service //将当前类的对象将给Spring来管理，自动创建对象以及对象的维护
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        User result = userMapper.findByUsername(user.getUserName());
        if (result != null) {
            throw new UsernameDuplicatedException("用户名被使用");
        }

        //密码加密处理 -> 串+password+串 =>md5算法加密 （该为盐值，即随机的字符串），连续加密三次
        //获取盐值
        String salt = UUID.randomUUID().toString().toUpperCase();
        String md5Password = getMd5Password(user.getPassword(), salt);
        user.setPassword(md5Password);
        user.setSalt(salt);

        user.setIsDelete(0);
        user.setCreatedUser(user.getUserName());
        user.setModifyUser(user.getUserName());
        Date date = new Date();
        user.setCreatedTime(date);
        user.setModifyTime(date);

        Integer rows = userMapper.insert(user);
        if (rows != 1) {
            throw new InsertException("用户注册过程中产生未知的异常");
        }
    }

    /**
     * 用户登录功能
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public User login(String username, String password) {
        User result = userMapper.findByUsername(username);
        if (result == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        String oldMd5Password = result.getPassword();
        String salt = result.getSalt();
        String newGetMd5Password = getMd5Password(password, salt);
        if (newGetMd5Password.equals(oldMd5Password) == false) {
            throw new PasswordNotMatchException("用户名或密码错误");
        }
        if (result.getIsDelete() == 1) {
            throw new UsernameNotFoundException("用户不存在");
        }
        User user = new User();
        user.setUid(result.getUid());
        user.setUserName(result.getUserName());
        user.setAvatar(result.getAvatar());
        return user;
    }

    /**
     * md5算法加密函数
     */
    private String getMd5Password(String password, String salt) {
        for (int i = 0; i < 3; i++) {
            //MD5加密算法调用
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
        }
        return password;
    }
}

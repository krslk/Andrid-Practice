package org.example.spring_demo_0912.Service.Impl;

import org.example.spring_demo_0912.Dao.UserDao;
import org.example.spring_demo_0912.Dao.UserDaoImpl;
import org.example.spring_demo_0912.Entry.UserInfo;
import org.example.spring_demo_0912.Mapper.UserMapper;
import org.example.spring_demo_0912.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    private UserDao userDao = new UserDaoImpl();

    @Override
    public UserInfo findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public boolean txSaveUserInfo(UserInfo userInfo) {
        return userDao.insertUserInfo(userInfo) > 0;
    }

    @Override
    public UserInfo findUserByLogin(String username, String password) {
        return userDao.selectUserByQuery(username, password);
    }


}

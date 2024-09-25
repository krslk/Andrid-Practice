package com.wms.e_wms_module.service.impl;

import com.wms.e_wms_module.dao.impl.UserDaoImpl;
import com.wms.e_wms_module.entity.UserInfo;
import com.wms.e_wms_module.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean txSaveUser(UserInfo userInfo) {
        String salt = UUID.randomUUID().toString().toUpperCase();
        userInfo.setPassword(getMd5Password(userInfo.getPassword(), salt));
        userInfo.setSalt(salt);
        return new UserDaoImpl().addUserInfo(userInfo) > 0;
    }

    @Override
    public UserInfo findByUsername(String username) {
        return new UserDaoImpl().findByUsername(username);
    }

    public String getMd5Password(String password, String salt) {
        for (int i = 0; i < 3; i++) {
            String str = salt + password + salt;
            password = DigestUtils.md5DigestAsHex(str.getBytes()).toUpperCase();
        }
        return password;
    }
}

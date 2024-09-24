package org.example.spring_demo_0912.Service;

import org.example.spring_demo_0912.Entry.UserInfo;

public interface UserService {
    public UserInfo findById(int id);

    public boolean txSaveUserInfo(UserInfo userInfo);

    public UserInfo findUserByLogin(String username, String password);
}

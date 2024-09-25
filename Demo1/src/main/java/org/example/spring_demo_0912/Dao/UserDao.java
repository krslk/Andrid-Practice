package org.example.spring_demo_0912.Dao;

import org.example.spring_demo_0912.Entry.UserInfo;

public interface UserDao {
    public int insertUserInfo(UserInfo userInfo);

    public UserInfo selectUserByQuery(String username, String password);
}

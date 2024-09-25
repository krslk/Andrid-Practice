package com.wms.e_wms_module.dao.impl;

import com.wms.e_wms_module.dao.UserDao;
import com.wms.e_wms_module.entity.UserInfo;

import java.sql.*;


public class UserDaoImpl implements UserDao {
    Connection connection = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo user = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beienke", "root", "123456");
            PreparedStatement pS = connection.prepareStatement("select * from userinfo where username = ?");
            pS.setString(1, username);
            ResultSet res = pS.executeQuery();
            if (!res.next()) {
                pS.close();
                return null;
            }
            user = new UserInfo();
            user.setUsername(res.getString(2));
            user.setUserNickName(res.getString(3));
            user.setPassword(res.getString(4));
            user.setSalt(res.getString(5));
            user.setSex(res.getInt(6));
            user.setPhone(res.getString(7));
            pS.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return user;
    }

    @Override
    public int addUserInfo(UserInfo userInfo) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beienke", "root", "123456");
            PreparedStatement pS = connection.prepareStatement("insert into userinfo values(null,?,?,?,?,?,?,null,null)");
            pS.setString(1, userInfo.getUsername());
            pS.setString(2, userInfo.getUserNickName());
            pS.setString(3, userInfo.getPassword());
            pS.setString(4, userInfo.getSalt());
            pS.setInt(5, userInfo.getSex());
            pS.setString(6, userInfo.getPhone());
            int rows = pS.executeUpdate();
            pS.close();
            if (rows > 0) {
                return rows;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return 0;
    }
}

package org.example.spring_demo_0912.Dao;

import org.example.spring_demo_0912.Entry.UserInfo;

import java.sql.*;

public class UserDaoImpl implements UserDao {
//    static {
//        try {
//            Class.forName("jdbc:mysql://localhost:3306/BeiEnKe");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    Connection con = null;

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beienke", "root", "123456");
            PreparedStatement preparedStatement = con.prepareStatement("insert into userinfo values (null,?,?,?,?,?,null,null)");
            preparedStatement.setString(1, userInfo.getUserName());
            preparedStatement.setString(2, userInfo.getUserNickName());
            preparedStatement.setString(3, userInfo.getPassword());
            preparedStatement.setInt(4, userInfo.getSex());
            preparedStatement.setString(5, userInfo.getPhone());
            int rows = preparedStatement.executeUpdate();
            preparedStatement.close();
            return rows;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return 0;
    }

    @Override
    public UserInfo selectUserByQuery(String username, String password) {
        UserInfo userInfo = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beienke", "root", "123456");
            PreparedStatement preparedStatement = con.prepareStatement("select * from userinfo where username = ? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                userInfo = new UserInfo();
                userInfo.setId(resultSet.getInt("id"));
                userInfo.setUserName(resultSet.getString("username"));
                userInfo.setUserNickName(resultSet.getString("usernickname"));
                userInfo.setPassword(resultSet.getString("password"));
                userInfo.setSex(resultSet.getInt("sex"));
                userInfo.setPhone(resultSet.getString("phone"));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return userInfo;
    }
}

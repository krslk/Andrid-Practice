package org.lanqiao;

import java.sql.*;

public class Main {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static Connection connection;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/beienke", "root", "123456");
            PreparedStatement pS = connection.prepareStatement("select * from userInfo");

            Statement stm = connection.createStatement();
            ResultSet resultSet = pS.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("username")+"  ");
                System.out.print(resultSet.getString("usernickname")+"  ");
                System.out.print(resultSet.getString("phone")+"  \n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

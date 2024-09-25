package com.wms.e_wms_module.daotest;


import com.wms.e_wms_module.dao.UserDao;
import com.wms.e_wms_module.dao.impl.UserDaoImpl;
import com.wms.e_wms_module.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void addUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("lilili");
        userInfo.setPassword("111111");
        userInfo.setUserNickName("lilili");
        userDao.addUserInfo(userInfo);
        System.out.println("OK");
    }

    @Test
    public void findByUserTest() {
        UserInfo userInfo = userDao.findByUsername("user1");
        if (userInfo != null) {
            System.out.println(userInfo);
        }
    }
}

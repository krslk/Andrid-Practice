package com.cy.store.d_store_module.service;

import com.cy.store.d_store_module.entity.User;
import com.cy.store.d_store_module.mapper.UserMapper;
import com.cy.store.d_store_module.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//SpringBootTest注解：标注当前类为测试类，不会同项目一同打包发送
@SpringBootTest
//RunWith注解：表示启动该单元测试类，必须传递固定的SpringRunner实例类型的参数
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    /**
     * 单元测试方法独立运行
     * <p>
     * 1.必须被Tast注解修饰
     * 2.返回值必须为void
     * 3.修饰符必须是public
     * 4.参数必须列表为空
     */
    @Test
    public void reg() {
        try {
            User user = new User();
            user.setUserName("lilei");
            user.setPassword("123456");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
    }

    @Test
    public void login() {
        User user = userService.login("lilei", "123456");
        System.out.println(user);
    }
}

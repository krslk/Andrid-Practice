package com.cy.store.d_store_module.mapper;

import com.cy.store.d_store_module.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//SpringBootTest注解：标注当前类为测试类，不会同项目一同打包发送
@SpringBootTest
//RunWith注解：表示启动该单元测试类，必须传递固定的SpringRunner实例类型的参数
@RunWith(SpringRunner.class)
public class UserMapperTest {


    @Autowired
    private UserMapper userMapper;

    /**
     * 单元测试方法独立运行
     * <p>
     * 1.必须被Tast注解修饰
     * 2.返回值必须为void
     * 3.修饰符必须是public
     * 4.参数必须列表为空
     */
    @Test
    public void insert() {
        User user = new User();
        user.setUserName("1");
        user.setPassword("123");
        user.setIsDelete(0);
        User r = userMapper.findByUsername("1");
        System.out.println(r);
    }
}

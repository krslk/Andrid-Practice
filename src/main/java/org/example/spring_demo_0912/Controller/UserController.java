package org.example.spring_demo_0912.Controller;

import lombok.extern.java.Log;
import org.example.spring_demo_0912.Entry.UserInfo;
import org.example.spring_demo_0912.Mapper.UserMapper;
import org.example.spring_demo_0912.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public UserInfo findById(int id) {
        return userService.findById(id);
    }

    @RequestMapping("/test")
    public String UserINfo() {
        return "OK";
    }


}

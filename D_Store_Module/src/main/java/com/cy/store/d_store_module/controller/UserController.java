package com.cy.store.d_store_module.controller;

import com.cy.store.d_store_module.entity.User;
import com.cy.store.d_store_module.service.IUserService;
import com.cy.store.d_store_module.util.JsonResult;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.session.StandardSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        iUserService.reg(user);
        return new JsonResult<Void>(200, "用户注册成功", null);
    }

    @RequestMapping("login")
    public JsonResult<User> login(String userName, String password) {
        User data = iUserService.login(userName, password);
//        httpSession.setAttribute("uid", data.getUid());
//        httpSession.setAttribute("username", data.getUserName());

//        System.out.println(getUidFromSession(httpSession));
//        System.out.println(getUsernameFromSession(httpSession));

        return new JsonResult<User>(OK, data);
    }

}

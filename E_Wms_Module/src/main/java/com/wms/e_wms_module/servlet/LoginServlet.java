package com.wms.e_wms_module.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wms.e_wms_module.dto.utils.DtoUtil;
import com.wms.e_wms_module.entity.UserInfo;
import com.wms.e_wms_module.service.ex.UserInfoNotFoundException;
import com.wms.e_wms_module.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {

    @Autowired
    private UserServiceImpl userService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserInfo userInfo = userService.findByUsername(username);
        if (userInfo == null) {
            throw new UserInfoNotFoundException("用户不存在");
        }
        resp.setContentType("application/json;charset=utf8");
        String salt = userInfo.getSalt();
        String pw = userService.getMd5Password(password, salt);
        if (userInfo.getPassword().equals(pw)) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("用户登录成功", userInfo)));
        } else {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFailed("用户登录失败")));
        }
    }
}

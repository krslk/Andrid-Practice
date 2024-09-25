package org.example.spring_demo_0912.Servlet;

import com.alibaba.fastjson.JSONObject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.spring_demo_0912.Entry.UserInfo;
import org.example.spring_demo_0912.Entry.util.DtoUtil;
import org.example.spring_demo_0912.Service.Impl.UserServiceImpl;
import org.example.spring_demo_0912.Service.UserService;

import java.io.IOException;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        String password = req.getParameter("password");
        UserInfo userInfo = userService.findUserByLogin(username, password);
        resp.setContentType("application/json;charset=utf8");
        if (userInfo == null) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFail("用户登录失败")));
        } else {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("登录成功", userInfo)));
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserInfo userInfo = userService.findUserByLogin(username, password);
        resp.setContentType("application/json;charset=utf8");
        if (userInfo == null) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFail("用户登录失败")));
        } else {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("登录成功", userInfo)));
        }
    }
}

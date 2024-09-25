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

@WebServlet("/user/register")
public class UserServlet extends HttpServlet {

    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("userName");
        String userNick = req.getParameter("userNick");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String phone = req.getParameter("phone");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setUserNickName(userNick);
        userInfo.setPassword(password);
        userInfo.setSex("0".equals(sex) ? 0 : 1);
        userInfo.setPhone(phone);
        boolean b = userService.txSaveUserInfo(userInfo);
        resp.setContentType("application/json;charset=utf8");
        if (b) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("用户注册成功", null)));
        } else {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFail("用户注册失败")));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        String userNick = req.getParameter("userNick");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String phone = req.getParameter("phone");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setUserNickName(userNick);
        userInfo.setPassword(password);
        userInfo.setSex("0".equals(sex) ? 0 : 1);
        userInfo.setPhone(phone);
        boolean b = userService.txSaveUserInfo(userInfo);
        resp.setContentType("application/json;charset=utf8");
        if (b) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("用户注册成功", null)));
        } else {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFail("用户注册失败")));
        }
    }
}

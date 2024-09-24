package com.wms.e_wms_module.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wms.e_wms_module.dto.utils.DtoUtil;
import com.wms.e_wms_module.entity.UserInfo;
import com.wms.e_wms_module.service.UserService;
import com.wms.e_wms_module.service.ex.UserInfoInsertException;
import com.wms.e_wms_module.service.ex.UserNameDuplicateException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@WebServlet("/user/register")
public class UserServlet extends HttpServlet {

    @Autowired
    private UserService userService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        UserInfo res = userService.findByUsername(username);
        if (res != null) {
            throw new UserNameDuplicateException("用户名已存在");
        }
        String userNick = req.getParameter("userNick");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String phone = req.getParameter("phone");
        resp.setContentType("application/json;charset=utf8");
        UserInfo newUser = new UserInfo(username, userNick, password, "0".equals(sex) ? 0 : 1, phone);
        boolean rows = userService.txSaveUser(newUser);
        if (!rows) {
            resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getFailed("用户注册失败")));
            throw new UserInfoInsertException("数据插入出错");
        }
        resp.getWriter().write(JSONObject.toJSONString(new DtoUtil().getSuccess("用户注册成功", newUser)));
    }
}

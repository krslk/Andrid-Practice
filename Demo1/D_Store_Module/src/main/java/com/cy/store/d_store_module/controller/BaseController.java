package com.cy.store.d_store_module.controller;

import com.cy.store.d_store_module.service.ex.InsertException;
import com.cy.store.d_store_module.service.ex.PasswordNotMatchException;
import com.cy.store.d_store_module.service.ex.ServiceException;
import com.cy.store.d_store_module.service.ex.UsernameDuplicatedException;
import com.cy.store.d_store_module.util.JsonResult;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.attribute.UserPrincipalNotFoundException;

/**
 * 控制层类的基类
 */
public class BaseController {
    //操作成功
    public static final int OK = 200;

    @ExceptionHandler(ServiceException.class) //统一处理抛出的异常
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<>();
        if (e instanceof UsernameDuplicatedException) {
            result.setState(4000);
            result.setMessage("用户名已经被占用");
        } else if (e instanceof UserPrincipalNotFoundException) {
            result.setState(5001);
            result.setMessage("用户名不存在");
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("用户名或密码错误");
        } else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("注册时产生未知错误");
        } else {
            result.setState(404);
            result.setMessage("未知错误");
        }
        return result;
    }

    protected final Integer getUidFromSession(HttpSession httpSession) {
        return Integer.valueOf(httpSession.getAttribute("uid").toString());
    }
    protected final Integer getUsernameFromSession(HttpSession httpSession) {
        return Integer.valueOf(httpSession.getAttribute("userName").toString());
    }
}

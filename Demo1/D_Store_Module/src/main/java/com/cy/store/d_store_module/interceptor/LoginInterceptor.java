package com.cy.store.d_store_module.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 定义一个拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 检测全局session对象中是否有uid对象，如果有则放行，否则重定向到登录界面
     *
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  处理器（url+controller：映射）
     * @return 如果返回true表示放行；false表示拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object o = request.getSession().getAttribute("uid");
        if (o == null) {
            response.sendRedirect("/web/login.html");
            return false;
        }
        return true;
    }
}


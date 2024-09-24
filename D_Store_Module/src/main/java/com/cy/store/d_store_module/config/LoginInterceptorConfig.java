package com.cy.store.d_store_module.config;

import com.cy.store.d_store_module.interceptor.LoginInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理拦截器的注册
 */
public class LoginInterceptorConfig implements WebMvcConfigurer {
    /**
     * 将自定义的拦截器注册
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();
        List<String> patterns = new ArrayList<>();
        patterns.add("/bootstrap3/**");
        patterns.add("/css/**");
        patterns.add("/images/**");
        patterns.add("/js/**");
        patterns.add("/web/register.html");
        patterns.add("/web/login.html");
        patterns.add("index.html");
        patterns.add("/web/product.html");
        patterns.add("/user/reg.html");
        patterns.add("/user/login.html");
        //完成拦截器的注册  配置要拦截的白/黑名单
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")//表示要拦截的url
                .excludePathPatterns(patterns);//白名单
    }
}

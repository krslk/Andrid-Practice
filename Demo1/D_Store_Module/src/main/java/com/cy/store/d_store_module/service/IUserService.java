package com.cy.store.d_store_module.service;

import com.cy.store.d_store_module.entity.User;

public interface IUserService {
    /**
     * 用户注册方法
     *
     * @param user
     */
    void reg(User user);

    User login(String username, String password);
}

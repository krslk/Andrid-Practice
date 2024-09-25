package com.cy.store.d_store_module.mapper;

import com.cy.store.d_store_module.entity.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String name);
}

package com.wms.e_wms_module.dao;

import com.wms.e_wms_module.entity.UserInfo;

public interface UserDao {
    public UserInfo findByUsername(String username);
    public int addUserInfo(UserInfo userInfo);
}

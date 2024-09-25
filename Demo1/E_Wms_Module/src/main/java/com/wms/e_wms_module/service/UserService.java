package com.wms.e_wms_module.service;
import com.wms.e_wms_module.entity.UserInfo;


public interface UserService {
    boolean txSaveUser(UserInfo userInfo);
    UserInfo findByUsername(String username);
}

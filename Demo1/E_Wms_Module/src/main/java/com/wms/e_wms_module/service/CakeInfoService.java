package com.wms.e_wms_module.service;

import com.wms.e_wms_module.entity.CakeInfo;

import java.util.List;

public interface CakeInfoService {
    List<CakeInfo> findCakeInfo(int cakeClassId);
}

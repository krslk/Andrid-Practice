package com.wms.e_wms_module.service;

import com.wms.e_wms_module.entity.CakeClassInfo;
import com.wms.e_wms_module.mapper.CakeClassInfoMapper;

import java.util.List;

public interface CakeClassInfoService {
    List<CakeClassInfo> findCakeClass();
}

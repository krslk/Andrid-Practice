package com.wms.e_wms_module.service.impl;

import com.wms.e_wms_module.entity.CakeClassInfo;
import com.wms.e_wms_module.mapper.CakeClassInfoMapper;
import com.wms.e_wms_module.service.CakeClassInfoService;
import com.wms.e_wms_module.service.CakeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeClassInfoServiceImpl implements CakeClassInfoService {

    @Autowired
    private CakeClassInfoMapper cakeClassInfoMapper;

    @Autowired
    CakeInfoService cakeInfoService;

    public List<CakeClassInfo> findCakeClass() {
        return cakeClassInfoMapper.selectCakeClass();
    }
}

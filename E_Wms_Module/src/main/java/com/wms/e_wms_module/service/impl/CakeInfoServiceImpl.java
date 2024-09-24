package com.wms.e_wms_module.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wms.e_wms_module.entity.CakeInfo;
import com.wms.e_wms_module.mapper.CakeInfoMapper;
import com.wms.e_wms_module.service.CakeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CakeInfoServiceImpl implements CakeInfoService {
    @Autowired
    private CakeInfoMapper cakeInfoMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<CakeInfo> findCakeInfo(int cakeClassId) {
        Set<String> keys = stringRedisTemplate.keys("cake_" + cakeClassId + ":*");
        List<CakeInfo> cakeInfoList = new ArrayList<>();
        for (String s : keys) {
            String jsonStr = stringRedisTemplate.opsForValue().get(s);
            cakeInfoList.add(JSONObject.toJavaObject(JSON.parseObject(jsonStr), CakeInfo.class));
        }
        if (cakeInfoList.isEmpty()) {
            cakeInfoList = cakeInfoMapper.selectCakeInfoByCakeClassId(cakeClassId);
        }
        return cakeInfoList;
    }
}

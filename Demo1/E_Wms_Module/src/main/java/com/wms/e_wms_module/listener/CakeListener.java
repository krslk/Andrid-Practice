package com.wms.e_wms_module.listener;

import com.alibaba.fastjson.JSONObject;
import com.wms.e_wms_module.entity.CakeInfo;
import com.wms.e_wms_module.mapper.CakeInfoMapper;
import com.wms.e_wms_module.service.CakeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CakeListener implements ApplicationListener {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private CakeInfoMapper cakeInfoMapper;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        List<CakeInfo> cakeInfoList = cakeInfoMapper.selectCakeInfo();
        for (CakeInfo cakeInfo : cakeInfoList) {
            stringRedisTemplate.opsForValue().set("cake_" + cakeInfo.getCakeClassId() + ":" + cakeInfo.getId(), JSONObject.toJSONString(cakeInfo));
        }
    }
}

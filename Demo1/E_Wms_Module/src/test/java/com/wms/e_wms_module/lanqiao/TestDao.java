package com.wms.e_wms_module.lanqiao;

import com.wms.e_wms_module.entity.CakeClassInfo;
import com.wms.e_wms_module.entity.CakeInfo;
import com.wms.e_wms_module.mapper.CakeClassInfoMapper;
import com.wms.e_wms_module.mapper.CakeInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestDao {
    @Autowired
    CakeClassInfoMapper cakeClassInfoMapper;
    @Autowired
    CakeInfoMapper cakeInfoMapper;

    @Test
    public void testSelectCakeInfoList() {
        List<CakeInfo> cakeInfoList = cakeInfoMapper.selectCakeInfo();
        System.out.println(cakeInfoList.toString());
    }

    @Test
    public void testSelectCakeClassInfoList() {
        List<CakeClassInfo> cakeClassInfos = cakeClassInfoMapper.selectCakeClass();
        System.out.println(cakeClassInfos.toString());
    }
}

package com.wms.e_wms_module.lanqiao;

import com.wms.e_wms_module.entity.CakeClassInfo;
import com.wms.e_wms_module.entity.CakeInfo;
import com.wms.e_wms_module.service.CakeClassInfoService;
import com.wms.e_wms_module.service.CakeInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestService {
    @Autowired
    private CakeClassInfoService cakeClassInfoService;
    @Autowired
    private CakeInfoService cakeInfoService;

    @Test
    public void testFindCakeClassList() {
        List<CakeClassInfo> cakeClassInfos = cakeClassInfoService.findCakeClass();
        System.out.println(cakeClassInfos.toString());
    }

    @Test
    public void testFindCakeList() {
        List<CakeInfo> cakeInfoList = cakeInfoService.findCakeInfo(1);
        System.out.println(cakeInfoList.toString());
    }
}

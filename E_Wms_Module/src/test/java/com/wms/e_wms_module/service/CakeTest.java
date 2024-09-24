package com.wms.e_wms_module.service;

import com.wms.e_wms_module.service.impl.CakeClassInfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CakeTest {
    @Autowired
    CakeClassInfoServiceImpl cakeClassService;

    @Test
    public void cakeClassTest() {
        cakeClassService = new CakeClassInfoServiceImpl();
        System.out.println(cakeClassService.findCakeClass());
    }
}

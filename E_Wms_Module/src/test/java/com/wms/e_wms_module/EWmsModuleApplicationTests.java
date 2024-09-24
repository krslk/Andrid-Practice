package com.wms.e_wms_module;

import com.wms.e_wms_module.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EWmsModuleApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    OrderService orderService;

    @Test
    public void txSaveCartItemTest() {
        boolean b = orderService.txSaveCartItem(1, 800, 20, 18);
        System.out.println(b);
    }

}

package com.wms.e_wms_module.service;

import com.wms.e_wms_module.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest
public class orderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void txSaveCartItemTest() {
        boolean b = orderService.txSaveCartItem(1, 800, 20, 18);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp: " + timestamp);
    }
}

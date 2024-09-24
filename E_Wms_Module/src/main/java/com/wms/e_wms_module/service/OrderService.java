package com.wms.e_wms_module.service;

import com.wms.e_wms_module.entity.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    boolean txSaveCartItem(int cakeId, double price, int size, int uId);

    List<OrderDetail> findOrderDetailByUidAndStatus(int uid, int i);
}

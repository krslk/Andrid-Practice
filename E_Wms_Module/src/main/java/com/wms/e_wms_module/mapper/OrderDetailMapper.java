package com.wms.e_wms_module.mapper;

import com.wms.e_wms_module.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {
    int insertOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> selectOrderDetailByUid(int uid,int i);
}
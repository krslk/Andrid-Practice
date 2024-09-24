package com.wms.e_wms_module.mapper;

import com.wms.e_wms_module.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderDetailMapper {
    int insertOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> selectOrderDetailByUid(int uid,int i);
}
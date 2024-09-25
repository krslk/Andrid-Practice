package com.wms.e_wms_module.service.impl;

import com.wms.e_wms_module.entity.OrderDetail;
import com.wms.e_wms_module.entity.Orders;
import com.wms.e_wms_module.mapper.OrderDetailMapper;
import com.wms.e_wms_module.mapper.OrderMapper;
import com.wms.e_wms_module.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public boolean txSaveCartItem(int cakeId, double price, int size, int uId) {
        try {
            Orders cart = orderMapper.selectOrderByUidAndStatus(uId, 0);
            if (cart == null) {
                cart = new Orders();
                cart.setStatus(0);
                cart.setUserId(uId);
                cart.setLinkUserId(1);
                cart.setCreateTime(new Timestamp(System.currentTimeMillis()).toString());
                cart.setPayAmount(price);
                cart.setOrderNo(UUID.randomUUID().toString());
                int rows = orderMapper.insertOrder(cart);
                if (rows == 0) {
                    return false;
                }
            }
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderNo(cart.getOrderNo());
            orderDetail.setCreateTime(cart.getCreateTime());
            orderDetail.setCakeId(cakeId);
            orderDetail.setSize(size);
            orderDetail.setPrice(price);
            orderDetail.setCakeCounts(1);
            int rows = orderDetailMapper.insertOrderDetail(orderDetail);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<OrderDetail> findOrderDetailByUidAndStatus(int uid, int i) {
        return orderDetailMapper.selectOrderDetailByUid(uid,i);
    }
}

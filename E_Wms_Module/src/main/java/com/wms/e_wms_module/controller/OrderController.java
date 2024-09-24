package com.wms.e_wms_module.controller;

import com.wms.e_wms_module.dto.Dto;
import com.wms.e_wms_module.dto.utils.DtoUtil;
import com.wms.e_wms_module.entity.OrderDetail;
import com.wms.e_wms_module.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addCartItem")
    public Dto addCartItem(int cakeId, double price, int size, int uId) {
        boolean res = orderService.txSaveCartItem(cakeId, price, size, uId);
        if (res) {
            return new DtoUtil().getSuccess("添加购物车成功", null);
        } else {
            return new DtoUtil().getFailed("添加购物车失败");
        }
    }

    @GetMapping("/findCart")
    public Dto findCart(int uid) {
        List<OrderDetail> orderDetail = null;
        try {
            orderDetail = orderService.findOrderDetailByUidAndStatus(uid, 0);
            return new DtoUtil().getSuccess("查询购物⻋信息成功", orderDetail);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DtoUtil().getFailed("购物⻋查询失败，请稍后重试");
    }
}

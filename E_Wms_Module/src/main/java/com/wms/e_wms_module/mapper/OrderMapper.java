package com.wms.e_wms_module.mapper;

import com.wms.e_wms_module.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    //@Select("select  * from orders where userid = #{uId} and status = #{status}")
    Orders selectOrderByUidAndStatus(int uId, int status);

    //@Insert("insert into orders values(null,#{orderNo}, #{tradeNo}, #{status}, #{payAmount}, #{linkUserId}, #{userId}, #{createTime}, #{modifyTime})")
    int insertOrder(Orders cart);
}

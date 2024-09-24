package com.wms.e_wms_module.mapper;

import com.wms.e_wms_module.entity.CakeClassInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CakeClassInfoMapper {
    List<CakeClassInfo> selectCakeClass();
}

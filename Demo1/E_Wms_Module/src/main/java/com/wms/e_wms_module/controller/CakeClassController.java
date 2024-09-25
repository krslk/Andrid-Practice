package com.wms.e_wms_module.controller;

import com.wms.e_wms_module.dto.Dto;
import com.wms.e_wms_module.dto.utils.DtoUtil;
import com.wms.e_wms_module.entity.CakeClassInfo;
import com.wms.e_wms_module.mapper.CakeClassInfoMapper;
import com.wms.e_wms_module.service.CakeClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CakeClassController {

    @Autowired
    CakeClassInfoService cakeClassInfoService;

    @GetMapping("/goods/findCakeClassList")
    public Dto findCakeClassList() {
        try {
            List<CakeClassInfo> list = cakeClassInfoService.findCakeClass();
            if (list == null) {
                throw new Exception();
            }
            return new DtoUtil().getSuccess("查询蛋糕分类列表信息成功", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DtoUtil().getFailed("\"查询蛋糕分类列表失败，请稍后重试");
    }
}

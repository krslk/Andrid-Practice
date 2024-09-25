package com.wms.e_wms_module.controller;

import com.wms.e_wms_module.dto.Dto;
import com.wms.e_wms_module.dto.utils.DtoUtil;
import com.wms.e_wms_module.entity.CakeInfo;
import com.wms.e_wms_module.service.CakeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class CakeInfoController {
    @Autowired
    CakeInfoService cakeInfoService;

    @PostMapping("/findCakeList")
    public Dto findCakeList(int cakeClassId) {
        List<CakeInfo> cakeInfoList = null;
        try {
            cakeInfoList = cakeInfoService.findCakeInfo(cakeClassId);
            if (cakeInfoList == null) {
                throw new Exception();
            }
            return new DtoUtil().getSuccess("查询蛋糕列表信息成功", cakeInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DtoUtil().getFailed("查询蛋糕信息列表失败，请稍后重试");
    }
}

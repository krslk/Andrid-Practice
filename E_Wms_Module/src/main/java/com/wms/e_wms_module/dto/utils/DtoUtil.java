package com.wms.e_wms_module.dto.utils;

import com.alibaba.fastjson.JSONObject;
import com.wms.e_wms_module.dto.Dto;

public class DtoUtil {
    public static Dto getSuccess(String message, Object data) {
        return new Dto("0000", "true", message, data);
    }

    public static Dto getFailed(String message) {
        return new Dto("0001", "false", message, null);

    }
}

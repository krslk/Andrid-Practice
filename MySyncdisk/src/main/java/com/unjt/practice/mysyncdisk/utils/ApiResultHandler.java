package com.unjt.practice.mysyncdisk.utils;

import com.unjt.practice.mysyncdisk.entity.ApiResult;

public class ApiResultHandler {

    public static ApiResult success(Object object) {
        return new ApiResult(200, "请求成功", object);
    }

    public static ApiResult success() {
        return success(null);
    }

    public static <T> ApiResult buildApiResult(Integer code, String message, T data) {
        return new ApiResult(code, message, data);
    }
}

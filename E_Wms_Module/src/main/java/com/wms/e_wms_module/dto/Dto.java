package com.wms.e_wms_module.dto;

public class Dto {
    String code;
    String success;
    String msg;
    Object data;

    public Dto() {
    }

    public Dto(String code, String success, String msg, Object data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "code='" + code + '\'' +
                ", success='" + success + '\'' +
                ", message='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

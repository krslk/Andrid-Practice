package com.wms.e_wms_module.service.ex;

public class UserInfoNotFoundException extends ServiceException{
    public UserInfoNotFoundException() {
    }

    public UserInfoNotFoundException(String message) {
        super(message);
    }

    public UserInfoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInfoNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserInfoNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.wms.e_wms_module.service.ex;

public class UserNameDuplicateException extends ServiceException{
    public UserNameDuplicateException() {
    }

    public UserNameDuplicateException(String message) {
        super(message);
    }

    public UserNameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameDuplicateException(Throwable cause) {
        super(cause);
    }

    public UserNameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

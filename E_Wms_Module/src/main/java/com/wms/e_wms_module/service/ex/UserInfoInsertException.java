package com.wms.e_wms_module.service.ex;

public class UserInfoInsertException extends ServiceException {
    public UserInfoInsertException() {
    }

    public UserInfoInsertException(String message) {
        super(message);
    }

    public UserInfoInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInfoInsertException(Throwable cause) {
        super(cause);
    }

    public UserInfoInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

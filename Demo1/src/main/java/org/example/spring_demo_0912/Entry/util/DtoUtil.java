package org.example.spring_demo_0912.Entry.util;

import org.example.spring_demo_0912.Entry.dto.Dto;

public class DtoUtil {
    public static Dto getSuccess(String msg, Object data) {
        return new Dto("true", "0000", msg, data);
    }

    public static Dto getFail(String msg) {
        return new Dto("false", "1000", msg, null);
    }
}

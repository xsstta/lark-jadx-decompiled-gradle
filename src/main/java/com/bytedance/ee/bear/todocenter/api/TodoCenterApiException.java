package com.bytedance.ee.bear.todocenter.api;

public class TodoCenterApiException extends Exception {
    int code;
    String message;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public TodoCenterApiException(int i, String str) {
        this.code = i;
        this.message = str;
    }
}

package com.bytedance.pipeline.exception;

public class RequestInterceptException extends RuntimeException {
    private int code;

    public int getCode() {
        return this.code;
    }

    public RequestInterceptException(String str, Throwable th) {
        super(str, th);
    }

    public RequestInterceptException(int i, String str, Throwable th) {
        super(str + ":[code:" + i + "]", th);
        this.code = i;
    }
}

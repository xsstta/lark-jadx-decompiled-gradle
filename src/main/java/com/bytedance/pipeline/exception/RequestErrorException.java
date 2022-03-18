package com.bytedance.pipeline.exception;

public class RequestErrorException extends Exception {
    public int code;

    public RequestErrorException(int i, String str) {
        super(str);
        this.code = i;
    }
}

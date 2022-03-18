package com.bytedance.pipeline.exception;

public class NetWorkException extends RuntimeException {
    public NetWorkException(String str, Throwable th) {
        super(str, th);
    }
}

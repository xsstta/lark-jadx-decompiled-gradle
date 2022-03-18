package com.bytedance.pipeline.exception;

public class JsonException extends RuntimeException {
    public JsonException(String str, Throwable th) {
        super(str, th);
    }
}

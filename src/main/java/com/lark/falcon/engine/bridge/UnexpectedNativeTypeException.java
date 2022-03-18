package com.lark.falcon.engine.bridge;

public class UnexpectedNativeTypeException extends RuntimeException {
    public UnexpectedNativeTypeException(String str) {
        super(str);
    }
}

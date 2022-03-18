package com.lark.falcon.engine.bridge;

public class JSApplicationCausedNativeException extends RuntimeException {
    public JSApplicationCausedNativeException(String str) {
        super(str);
    }

    public JSApplicationCausedNativeException(String str, Throwable th) {
        super(str, th);
    }
}

package com.bytedance.ee.falcon.inspector.utils;

public class MessageHandlingException extends Exception {
    public MessageHandlingException(String str) {
        super(str);
    }

    public MessageHandlingException(Throwable th) {
        super(th);
    }
}

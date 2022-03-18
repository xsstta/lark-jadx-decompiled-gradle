package com.he.v8_inspect.utils;

public class MessageHandlingException extends Exception {
    public MessageHandlingException(String str) {
        super(str);
    }

    public MessageHandlingException(Throwable th) {
        super(th);
    }
}

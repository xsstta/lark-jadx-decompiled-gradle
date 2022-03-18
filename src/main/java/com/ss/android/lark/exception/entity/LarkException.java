package com.ss.android.lark.exception.entity;

public class LarkException extends Exception {
    public LarkException() {
    }

    public LarkException(Exception exc) {
        super(exc);
    }

    public LarkException(String str) {
        super(str);
    }

    public LarkException(String str, Exception exc) {
        super(str, exc);
    }
}

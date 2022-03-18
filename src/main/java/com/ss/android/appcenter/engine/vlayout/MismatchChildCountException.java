package com.ss.android.appcenter.engine.vlayout;

public class MismatchChildCountException extends RuntimeException {
    public MismatchChildCountException(String str) {
        super(str);
    }

    public MismatchChildCountException(String str, Throwable th) {
        super(str, th);
    }
}

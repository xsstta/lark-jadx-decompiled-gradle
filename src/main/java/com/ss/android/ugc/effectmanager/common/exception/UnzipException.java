package com.ss.android.ugc.effectmanager.common.exception;

public class UnzipException extends Exception {
    public UnzipException(Exception exc) {
        super(exc);
    }

    public UnzipException(String str) {
        super(str);
    }
}

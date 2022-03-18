package com.ss.android.lark.diskmanage.cipher;

public class CipherException extends Exception {
    protected int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    CipherException(int i) {
        this.mErrorCode = i;
    }
}

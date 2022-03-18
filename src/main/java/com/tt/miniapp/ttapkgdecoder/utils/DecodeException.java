package com.tt.miniapp.ttapkgdecoder.utils;

import java.io.IOException;

public class DecodeException extends IOException {
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public DecodeException(int i) {
        this.mErrorCode = i;
    }

    public DecodeException(Throwable th, int i) {
        super(th);
        this.mErrorCode = i;
    }
}

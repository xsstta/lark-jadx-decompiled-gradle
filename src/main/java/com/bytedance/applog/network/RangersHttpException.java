package com.bytedance.applog.network;

public class RangersHttpException extends Exception {
    private int mResponseCode;

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public RangersHttpException(int i, String str) {
        super(str);
        this.mResponseCode = i;
    }

    public RangersHttpException(int i, Throwable th) {
        super(th);
        this.mResponseCode = i;
    }
}

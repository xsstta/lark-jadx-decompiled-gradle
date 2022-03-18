package com.ss.android.lark.passport.signinsdk_api.base;

import java.io.Serializable;

public class NetworkErrorResult implements Serializable {
    private int mBizCode;
    private int mErrorCode;
    private String mErrorMessage;
    private int mErrorType;
    private Throwable mThrowable;

    public int getBizCode() {
        return this.mBizCode;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public NetworkErrorResult() {
        this.mBizCode = -1;
    }

    public String toString() {
        return "mErrorCode=" + this.mErrorCode + ", mErrorMessage='" + this.mErrorMessage + ", mErrorType= " + this.mErrorType;
    }

    public void setBizCode(int i) {
        this.mBizCode = i;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public void setErrorType(int i) {
        this.mErrorType = i;
    }

    public void setThrowable(Throwable th) {
        this.mThrowable = th;
    }

    public NetworkErrorResult(int i, String str) {
        this(i, str, -1);
    }

    public NetworkErrorResult(int i, String str, int i2) {
        this.mBizCode = -1;
        this.mErrorCode = i;
        this.mErrorMessage = str;
        if (i > 0) {
            this.mErrorType = -7;
        }
        this.mBizCode = i2;
    }
}

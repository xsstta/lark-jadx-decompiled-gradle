package com.bytedance.ee.lark.infra.network.ref.entity;

import android.text.TextUtils;

public class ECONetworkException extends Exception {
    private int mErrorCode = -1;
    private String mErrorMsg = "";
    private Exception mException = new Exception("unknown error");

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public Exception getException() {
        return this.mException;
    }

    public ECONetworkException appendPrefixMsg(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mErrorMsg = str + this.mErrorMsg;
        }
        return this;
    }

    public ECONetworkException(int i) {
        super("errorCode  = " + i);
        this.mErrorCode = i;
        this.mException = new Exception("errorCode  = " + i);
    }

    public ECONetworkException(Exception exc) {
        super(exc);
        this.mErrorMsg = exc.getLocalizedMessage();
        this.mException = exc;
    }

    public ECONetworkException(String str) {
        super(str);
        this.mErrorMsg = str;
        this.mException = new Exception(str);
    }

    public ECONetworkException(int i, String str) {
        super(str);
        this.mErrorCode = i;
        this.mErrorMsg = str;
        this.mException = new Exception(str);
    }

    public ECONetworkException(String str, Exception exc) {
        super(str, exc);
        this.mErrorMsg = str;
        this.mException = exc;
    }
}

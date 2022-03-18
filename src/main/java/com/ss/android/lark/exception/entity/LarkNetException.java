package com.ss.android.lark.exception.entity;

import com.larksuite.framework.callback.Entity.ErrorResult;

public class LarkNetException extends LarkException {

    /* renamed from: e */
    private Exception f95146e;
    private int errorCode;
    private String msg;

    public int getErrCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.msg;
    }

    public Exception getException() {
        return this.f95146e;
    }

    public ErrorResult getErrorResult() {
        return new ErrorResult(this.errorCode, this.msg, null, null, this.f95146e);
    }

    public LarkNetException(ErrorResult errorResult) {
        super(errorResult.getException());
        this.errorCode = errorResult.getErrorCode();
        this.msg = errorResult.getDisplayMsg();
        this.f95146e = errorResult.getException();
    }

    public LarkNetException(int i, String str, Exception exc) {
        super(exc);
        this.errorCode = i;
        this.msg = str;
        this.f95146e = exc;
    }
}

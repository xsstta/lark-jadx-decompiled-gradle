package com.tt.refer.common.meta.fetch;

public class MetaException extends Exception {
    private String errorCode = "";
    private String errorMsg = "";
    private boolean isServerError;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean isServerError() {
        return this.isServerError;
    }

    public MetaException(String str, String str2) {
        super(str2);
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public MetaException(String str, String str2, boolean z) {
        super(str2);
        this.errorCode = str;
        this.errorMsg = str2;
        this.isServerError = z;
    }
}

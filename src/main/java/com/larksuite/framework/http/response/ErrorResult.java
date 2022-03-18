package com.larksuite.framework.http.response;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ErrorResult implements Serializable {
    private String mErrorMessage;
    private int mErrorType;
    private int mHttpStatusCode;
    private BaseResponse mResponseModel;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorType {
    }

    public ErrorResult() {
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    public BaseResponse getResponseModel() {
        return this.mResponseModel;
    }

    public String toString() {
        return "ErrorResult{mErrorMessage='" + this.mErrorMessage + '\'' + ", mErrorType=" + this.mErrorType + ", mHttpStatusCode=" + this.mHttpStatusCode + ", mResponseModel=" + this.mResponseModel + '}';
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public void setResponseModel(BaseResponse baseResponse) {
        this.mResponseModel = baseResponse;
    }

    public ErrorResult(int i, int i2, String str) {
        this.mErrorType = i;
        this.mHttpStatusCode = i2;
        this.mErrorMessage = str;
    }
}

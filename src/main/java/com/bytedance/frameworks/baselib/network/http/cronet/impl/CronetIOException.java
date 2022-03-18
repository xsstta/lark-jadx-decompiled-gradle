package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import java.io.IOException;

public class CronetIOException extends IOException {
    private final int cronetInternalErrorCode;
    private BaseHttpRequestInfo requestInfo;
    private int statusCode;
    private String traceCode;

    public int getCronetInternalErrorCode() {
        return this.cronetInternalErrorCode;
    }

    public BaseHttpRequestInfo getRequestInfo() {
        return this.requestInfo;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getTraceCode() {
        return this.traceCode;
    }

    public String getRequestLog() {
        return this.requestInfo.requestLog;
    }

    public CronetIOException(Exception exc, BaseHttpRequestInfo baseHttpRequestInfo, String str, int i) {
        super(exc.getMessage(), exc.getCause());
        this.requestInfo = baseHttpRequestInfo;
        this.traceCode = str;
        if (exc instanceof HttpResponseException) {
            this.statusCode = ((HttpResponseException) exc).getStatusCode();
        }
        this.cronetInternalErrorCode = i;
    }
}

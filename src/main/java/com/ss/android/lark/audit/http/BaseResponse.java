package com.ss.android.lark.audit.http;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    public int code;
    public AuditResponseData data;
    public String messge;
}

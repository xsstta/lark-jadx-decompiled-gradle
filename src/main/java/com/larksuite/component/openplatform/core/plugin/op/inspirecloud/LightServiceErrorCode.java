package com.larksuite.component.openplatform.core.plugin.op.inspirecloud;

import com.huawei.hms.support.api.entity.core.CommonCode;

public enum LightServiceErrorCode {
    LIGHT_SERVICE_NO_ERROR(0, "ok"),
    LIGHT_SERVICE_UNKNOWN_ERROR(1000, "unknown error"),
    LIGHT_SERVICE_INVALID_PARAM(CommonCode.StatusCode.API_CLIENT_EXPIRED, "invalid parameter"),
    LIGHT_SERVICE_REQUEST_FAIL(1002, "cloud service request fail"),
    LIGHT_SERVICE_RESOURCE_NOT_FOUND(1003, "resource not found");
    
    private int errorCode;
    private String errorMsg;

    public int errorCode() {
        return this.errorCode;
    }

    public String errorMsg() {
        return this.errorMsg;
    }

    public String toString() {
        return "LightServiceErrorCode{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    public static LightServiceErrorCode fromValue(int i) {
        if (i == 0) {
            return LIGHT_SERVICE_NO_ERROR;
        }
        switch (i) {
            case 1000:
                return LIGHT_SERVICE_UNKNOWN_ERROR;
            case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                return LIGHT_SERVICE_INVALID_PARAM;
            case 1002:
                return LIGHT_SERVICE_REQUEST_FAIL;
            case 1003:
                return LIGHT_SERVICE_RESOURCE_NOT_FOUND;
            default:
                return null;
        }
    }

    private LightServiceErrorCode(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}

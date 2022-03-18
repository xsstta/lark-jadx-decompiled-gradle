package com.tt.miniapp.errorcode;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;

public enum ApiErrorCode {
    GET_CONFIG_FAIL(60801, "get config failed"),
    CONTEXT_ERROR(60802, "context error"),
    UNABLE_ACCESS_LOCATION(70101, "unable access location"),
    INVALID_RESULT(70102, "invalid latitude or longitude"),
    LOCATION_FAIL(70103, "location fail"),
    INVALID_TITLE(80101, "invalid title"),
    INVALID_TITLE_AND_CONTENT(80501, "invalid title and content"),
    INVALID_PARAMS(UpdateDialogStatusCode.DISMISS, "invalid parameter"),
    INTERNAL_ERROR_URL(UpdateDialogStatusCode.SHOW, "internal error URL"),
    INTERNAL_ERROR_JSON(10003, "internal error json"),
    PERMISSION_DENIED(10004, "permission denied"),
    SYSTEM_PERMISSION_DENIED(10005, "system permission denied"),
    PLATFORM_PERMISSION_DENIED(10006, "platform permission denied"),
    USER_AUTH_DENIED(10007, "user auth denied"),
    INVALID_FUNCTION(10012, "invalid function"),
    UNKNOWN_ERROR(10013, "unknown error"),
    INNER_CONTEXT_ERROR(10015, "context error");
    
    public int code;
    public String msg;

    private ApiErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}

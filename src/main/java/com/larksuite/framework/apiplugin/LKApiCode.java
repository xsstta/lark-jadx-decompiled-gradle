package com.larksuite.framework.apiplugin;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;

public enum LKApiCode {
    GENERAL_PARAM(UpdateDialogStatusCode.DISMISS, "invalid parameter"),
    GENERAL_USER_AUTH_DENIED(10006, "user auth denied"),
    GENERAL_UNKONW_ERROR(10010, "unknown error");
    
    public int code;
    public String msg;

    private LKApiCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}

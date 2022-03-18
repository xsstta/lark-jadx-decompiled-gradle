package com.ss.android.lark.security.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;

public class VerifySecurityPwdResultStep extends BaseStepInfo {
    @JSONField(name = "token")
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}

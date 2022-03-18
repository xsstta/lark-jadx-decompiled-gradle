package com.tt.miniapp.settings.configs;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

public class AppFGFilter {
    String appId;
    private String minClientVersionCode;
    private String minJsSdkVersionCode;
    private String minMiniAppVersionCode;
    private String tenantId;

    public String getAppId() {
        return this.appId;
    }

    public String getClientVersion() {
        return this.minClientVersionCode;
    }

    public String getMinJsSdkVersionCode() {
        return this.minJsSdkVersionCode;
    }

    public String getMinMiniAppVersionCode() {
        return this.minMiniAppVersionCode;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setClientVersion(String str) {
        this.minClientVersionCode = str;
    }

    public void setMinJsSdkVersionCode(String str) {
        this.minJsSdkVersionCode = str;
    }

    public void setMinMiniAppVersionCode(String str) {
        this.minMiniAppVersionCode = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public Boolean isEnable(IAppContext iAppContext) {
        boolean z;
        if (!GadgetFGUtils.verifyMinClientVersion(iAppContext, this.minClientVersionCode) || !GadgetFGUtils.verifyMinJsSdkVersion(iAppContext, this.minJsSdkVersionCode) || !GadgetFGUtils.verifyTenantId(this.tenantId) || !GadgetFGUtils.verifyAppId(iAppContext, this.appId) || !GadgetFGUtils.verifyMiniAppVersion(iAppContext, this.minMiniAppVersionCode)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

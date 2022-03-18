package com.tt.miniapp.settings.configs;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.List;

public class GadgetFGFilter {
    private List<AppFGFilter> appFGAllowList;
    private boolean applyAll;
    private String minClientVersionCode;
    private String minJsSdkVersionCode;
    private String tenantId;

    public List<AppFGFilter> getAppFGAllowList() {
        return this.appFGAllowList;
    }

    public String getMinClientVersionCode() {
        return this.minClientVersionCode;
    }

    public String getMinJsSdkVersionCode() {
        return this.minJsSdkVersionCode;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public boolean isApplyAll() {
        return this.applyAll;
    }

    public void setAppFGAllowList(List<AppFGFilter> list) {
        this.appFGAllowList = list;
    }

    public void setApplyAll(boolean z) {
        this.applyAll = z;
    }

    public void setMinClientVersionCode(String str) {
        this.minClientVersionCode = str;
    }

    public void setMinJsSdkVersionCode(String str) {
        this.minJsSdkVersionCode = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public boolean isEnable(IAppContext iAppContext, boolean z) {
        if (!this.applyAll) {
            List<AppFGFilter> list = this.appFGAllowList;
            if (list != null && list.size() > 0) {
                for (AppFGFilter appFGFilter : this.appFGAllowList) {
                    if (GadgetFGUtils.verifyAppId(iAppContext, appFGFilter.appId)) {
                        return appFGFilter.isEnable(iAppContext).booleanValue();
                    }
                }
            }
            return z;
        } else if (!GadgetFGUtils.verifyTenantId(this.tenantId) || !GadgetFGUtils.verifyMinJsSdkVersion(iAppContext, this.minJsSdkVersionCode) || !GadgetFGUtils.verifyMinClientVersion(iAppContext, this.minClientVersionCode)) {
            return false;
        } else {
            return true;
        }
    }
}

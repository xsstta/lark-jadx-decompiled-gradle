package com.bytedance.ee.webapp.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.common.C25921b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/webapp/api/InspectDebugPluginResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "appList", "", "getAppList", "()Ljava/lang/String;", "setAppList", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InspectDebugPluginResponse extends C25921b {
    @JSONField(name = "appList")
    private String appList;

    public final String getAppList() {
        return this.appList;
    }

    public final void setAppList(String str) {
        this.appList = str;
    }
}

package com.bytedance.ee.webapp.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.common.C25920a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/webapp/api/ChangeStatusBarColorPluginRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChangeStatusBarColorPluginRequest extends C25920a {
    @JSONField(name = "color")
    private String color;

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        this.color = str;
    }
}

package com.bytedance.ee.webapp.api.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/webapp/api/bean/InspectedDebugInfo;", "", "()V", "businessCode", "", "getBusinessCode", "()I", "setBusinessCode", "(I)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/webapp/api/bean/InspectedAppListInfo;", "getData", "()Lcom/bytedance/ee/webapp/api/bean/InspectedAppListInfo;", "setData", "(Lcom/bytedance/ee/webapp/api/bean/InspectedAppListInfo;)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InspectedDebugInfo {
    @JSONField(name = "code")
    private int businessCode;
    @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private InspectedAppListInfo data;
    @JSONField(name = "msg")
    private String message;

    public final int getBusinessCode() {
        return this.businessCode;
    }

    public final InspectedAppListInfo getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public String toString() {
        return "InspectedDebugInfo{code=" + this.businessCode + ", message='" + this.message + "', data=" + this.data + '}';
    }

    public final void setBusinessCode(int i) {
        this.businessCode = i;
    }

    public final void setData(InspectedAppListInfo inspectedAppListInfo) {
        this.data = inspectedAppListInfo;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}

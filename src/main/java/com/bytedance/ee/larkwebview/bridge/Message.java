package com.bytedance.ee.larkwebview.bridge;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/Message;", "Ljava/io/Serializable;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "callbackID", "getCallbackID", "setCallbackID", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "setData", "extra", "getExtra", "setExtra", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Message implements Serializable {
    private String apiName;
    private String callbackID;
    private String data;
    private String extra;

    public final String getApiName() {
        return this.apiName;
    }

    public final String getCallbackID() {
        return this.callbackID;
    }

    public final String getData() {
        return this.data;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final void setApiName(String str) {
        this.apiName = str;
    }

    public final void setCallbackID(String str) {
        this.callbackID = str;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }
}

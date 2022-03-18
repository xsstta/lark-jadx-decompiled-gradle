package com.bytedance.ee.bear.jsbridge.v2;

import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/v2/RNMessage;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "callbackID", "getCallbackID", "setCallbackID", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RNMessage implements NonProguard {
    private String apiName;
    private String callbackID;
    private Object data;

    public final String getApiName() {
        return this.apiName;
    }

    public final String getCallbackID() {
        return this.callbackID;
    }

    public final Object getData() {
        return this.data;
    }

    public final void setApiName(String str) {
        this.apiName = str;
    }

    public final void setCallbackID(String str) {
        this.callbackID = str;
    }

    public final void setData(Object obj) {
        this.data = obj;
    }
}

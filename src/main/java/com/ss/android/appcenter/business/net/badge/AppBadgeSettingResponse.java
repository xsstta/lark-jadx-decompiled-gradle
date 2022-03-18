package com.ss.android.appcenter.business.net.badge;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingResponse;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingData;", "getData", "()Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingData;", "setData", "(Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingData;)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppBadgeSettingResponse implements Serializable {
    @SerializedName("code")
    private int code;
    private AppBadgeSettingData data;
    @SerializedName("msg")
    private String msg;

    public final int getCode() {
        return this.code;
    }

    public final AppBadgeSettingData getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(AppBadgeSettingData appBadgeSettingData) {
        this.data = appBadgeSettingData;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }
}

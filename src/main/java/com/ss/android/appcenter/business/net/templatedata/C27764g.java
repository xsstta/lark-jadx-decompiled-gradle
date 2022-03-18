package com.ss.android.appcenter.business.net.templatedata;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.appcenter.business.net.templatedata.g */
public class C27764g {
    @SerializedName("code")

    /* renamed from: a */
    public int f69365a;
    @SerializedName("moduleType")

    /* renamed from: b */
    public int f69366b;
    @SerializedName("componentId")

    /* renamed from: c */
    public String f69367c;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)

    /* renamed from: d */
    public String f69368d;

    public String toString() {
        return String.format("PlatformComponentResponse{code=%d, moduleType=%d, componentId='%s'}", Integer.valueOf(this.f69365a), Integer.valueOf(this.f69366b), this.f69367c);
    }
}

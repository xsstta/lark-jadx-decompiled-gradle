package com.ss.android.lark.openplatform.common.bean;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.lark.openplatform.common.bean.b */
public class C48827b {
    @SerializedName("code")

    /* renamed from: a */
    private int f122652a;
    @SerializedName("msg")

    /* renamed from: b */
    private String f122653b;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)

    /* renamed from: c */
    private PlusMenuGadgetData f122654c;

    /* renamed from: a */
    public PlusMenuGadgetData mo170575a() {
        return this.f122654c;
    }

    /* renamed from: b */
    public int mo170576b() {
        return this.f122652a;
    }

    public String toString() {
        return "TenantAppCenterResponse{code=" + this.f122652a + ", msg='" + this.f122653b + '\'' + ", data=" + this.f122654c + '}';
    }
}

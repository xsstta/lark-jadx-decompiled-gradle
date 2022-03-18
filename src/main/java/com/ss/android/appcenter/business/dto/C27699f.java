package com.ss.android.appcenter.business.dto;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.appcenter.business.dto.f */
public class C27699f {
    @SerializedName("name")

    /* renamed from: a */
    private String f69196a;
    @SerializedName("no_permission")

    /* renamed from: b */
    private boolean f69197b;
    @SerializedName("show_check_mender")

    /* renamed from: c */
    private boolean f69198c;
    @SerializedName("check_mender")

    /* renamed from: d */
    private boolean f69199d;
    @SerializedName("bot_id")

    /* renamed from: e */
    private String f69200e;

    /* renamed from: a */
    public boolean mo98856a() {
        return this.f69197b;
    }

    /* renamed from: b */
    public boolean mo98857b() {
        return this.f69198c;
    }

    /* renamed from: c */
    public boolean mo98858c() {
        return this.f69199d;
    }

    public String toString() {
        return "WebHookBotInfo{mName='" + this.f69196a + '\'' + ", mNoPermission=" + this.f69197b + ", mShowCheckMender=" + this.f69198c + ", mCheckMender=" + this.f69199d + ", mBotId='" + this.f69200e + '\'' + '}';
    }
}

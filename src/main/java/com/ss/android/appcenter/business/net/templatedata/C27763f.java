package com.ss.android.appcenter.business.net.templatedata;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.appcenter.business.net.templatedata.f */
public class C27763f {
    @SerializedName("moduleType")

    /* renamed from: a */
    public int f69362a;
    @SerializedName("componentId")

    /* renamed from: b */
    public String f69363b;
    @SerializedName("params")

    /* renamed from: c */
    public String f69364c;

    public String toString() {
        return String.format("PlatformComponentRequest{moduleType=%d, componentId='%s', params='%s'}", Integer.valueOf(this.f69362a), this.f69363b, this.f69364c);
    }

    public C27763f(int i, String str, String str2) {
        this.f69362a = i;
        this.f69363b = str;
        this.f69364c = str2;
    }
}

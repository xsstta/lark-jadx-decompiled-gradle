package com.ss.android.appcenter.business.net.p1272c;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.appcenter.business.net.c.c */
public class C27733c implements Cloneable {
    @SerializedName("id")

    /* renamed from: a */
    public String f69303a;
    @SerializedName("md5")

    /* renamed from: b */
    public String f69304b;
    @SerializedName("name")

    /* renamed from: c */
    public String f69305c;
    @SerializedName("minClientVersion")

    /* renamed from: d */
    public String f69306d;
    @SerializedName("templateFileUrl")

    /* renamed from: e */
    public String f69307e;

    /* renamed from: a */
    public C27733c clone() {
        return new C27733c(this.f69303a, this.f69304b, this.f69306d, this.f69307e);
    }

    public String toString() {
        return String.format("TemplateInfo{id='%s', version='%s', minClientVersion='%s', url='%s'}", this.f69303a, this.f69304b, this.f69306d, this.f69307e);
    }

    private C27733c(String str, String str2, String str3, String str4) {
        this.f69303a = str;
        this.f69304b = str2;
        this.f69306d = str3;
        this.f69307e = str4;
    }
}

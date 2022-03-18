package com.ss.android.vcxp.p3185b;

/* renamed from: com.ss.android.vcxp.b.b */
public class C63797b {

    /* renamed from: a */
    public String f160985a = "";

    /* renamed from: b */
    public int f160986b;

    /* renamed from: c */
    public int f160987c;

    /* renamed from: d */
    public boolean f160988d;

    /* renamed from: a */
    public String mo220434a() {
        return this.f160985a + "|" + this.f160986b + "|" + this.f160987c + "|" + this.f160988d;
    }

    public C63797b(String str) {
        String[] split = str.split("\\|");
        this.f160985a = split[0];
        this.f160986b = Integer.parseInt(split[1]);
        this.f160987c = Integer.parseInt(split[2]);
        this.f160988d = Boolean.parseBoolean(split[3]);
    }

    public C63797b(String str, int i, int i2, boolean z) {
        this.f160985a = str;
        this.f160986b = i;
        this.f160987c = i2;
        this.f160988d = z;
    }
}

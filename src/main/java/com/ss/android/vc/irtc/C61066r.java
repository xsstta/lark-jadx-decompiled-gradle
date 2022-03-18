package com.ss.android.vc.irtc;

import android.text.TextUtils;

/* renamed from: com.ss.android.vc.irtc.r */
public class C61066r {

    /* renamed from: a */
    public boolean f152928a;

    /* renamed from: b */
    public int f152929b;

    /* renamed from: c */
    public String f152930c;

    /* renamed from: d */
    public long f152931d;

    /* renamed from: e */
    public String f152932e;

    /* renamed from: f */
    public String f152933f;

    public C61066r() {
    }

    /* renamed from: a */
    public static boolean m237489a(C61066r rVar, C61066r rVar2) {
        if (rVar == rVar2) {
            return true;
        }
        if (rVar == null || rVar2 == null || rVar.f152928a != rVar2.f152928a || rVar.f152929b != rVar2.f152929b || rVar.f152931d != rVar2.f152931d || !TextUtils.equals(rVar.f152930c, rVar2.f152930c) || !TextUtils.equals(rVar.f152932e, rVar2.f152932e) || !TextUtils.equals(rVar.f152933f, rVar2.f152933f)) {
            return false;
        }
        return true;
    }

    public C61066r(boolean z, int i, String str, long j, String str2, String str3) {
        this.f152928a = z;
        this.f152929b = i;
        this.f152930c = str;
        this.f152931d = j;
        this.f152932e = str2;
        this.f152933f = str3;
    }
}

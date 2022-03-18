package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.text.TextUtils;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.h */
public class C14002h {

    /* renamed from: e */
    public static final String f36692e = "h";

    /* renamed from: a */
    public String f36693a;

    /* renamed from: b */
    public String f36694b;

    /* renamed from: c */
    public String f36695c = "0";

    /* renamed from: d */
    public String f36696d = "0";

    public C14002h(String str, String str2, String str3, String str4) {
        this.f36693a = str;
        this.f36694b = str2;
        if (!TextUtils.isEmpty(str3)) {
            this.f36695c = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f36696d = str4;
        }
    }
}

package com.ss.android.lark.p2909v;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ss.android.lark.v.c */
public class C57896c implements AbstractC57894a {

    /* renamed from: a */
    private Context f142516a;

    /* renamed from: a */
    public String mo196234a() {
        return C57897d.m224698c(this.f142516a);
    }

    public C57896c(Context context) {
        this.f142516a = context;
    }

    /* renamed from: a */
    public String mo196235a(String str) {
        String a = mo196234a();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("shared preference name should be passed!");
        } else if (TextUtils.isEmpty(str)) {
            return a + ":unknown";
        } else if (TextUtils.isEmpty(a)) {
            return str;
        } else {
            return a + ":" + str;
        }
    }
}

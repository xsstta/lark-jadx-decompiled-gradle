package com.huawei.secure.android.common.ssl.p1028b;

import android.content.Context;

/* renamed from: com.huawei.secure.android.common.ssl.b.c */
public class C23818c {

    /* renamed from: a */
    private static Context f58998a;

    /* renamed from: a */
    public static Context m87065a() {
        return f58998a;
    }

    /* renamed from: a */
    public static void m87066a(Context context) {
        if (context != null && f58998a == null) {
            f58998a = context.getApplicationContext();
        }
    }
}

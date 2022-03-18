package com.bytedance.p234e;

import android.util.Log;

/* renamed from: com.bytedance.e.d */
class C4027d {

    /* renamed from: a */
    private static boolean f12218a;

    /* renamed from: a */
    public static void m16727a(boolean z) {
        f12218a = z;
    }

    /* renamed from: a */
    public static final void m16726a(String str, String str2) {
        if (f12218a) {
            Log.i("VodSettings", String.format("<%s> %s", str, str2));
        }
    }

    /* renamed from: b */
    public static final void m16728b(String str, String str2) {
        if (f12218a) {
            Log.e("VodSettings", String.format("<%s> %s", str, str2));
        }
    }
}

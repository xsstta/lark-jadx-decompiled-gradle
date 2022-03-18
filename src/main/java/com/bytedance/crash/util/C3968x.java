package com.bytedance.crash.util;

import android.util.Log;
import com.bytedance.crash.C3774m;

/* renamed from: com.bytedance.crash.util.x */
public final class C3968x {
    /* renamed from: a */
    public static void m16531a(String str) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    /* renamed from: a */
    public static void m16530a(Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m16535b(Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m16537b(Throwable th) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static void m16534a(Throwable th) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static void m16532a(String str, Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.e("npth", str + " " + obj);
        }
    }

    /* renamed from: b */
    public static void m16536b(String str, Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* renamed from: a */
    public static void m16533a(String str, Object obj, Throwable th) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }
}

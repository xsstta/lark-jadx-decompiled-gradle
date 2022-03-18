package com.bytedance.apm6.util;

import android.os.Build;
import android.os.Trace;

/* renamed from: com.bytedance.apm6.util.j */
public class C3360j {
    /* renamed from: a */
    public static void m13992a() {
        if (C3345a.m13916v() && Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m13993a(String str) {
        if (C3345a.m13916v() && Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}

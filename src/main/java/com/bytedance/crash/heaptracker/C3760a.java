package com.bytedance.crash.heaptracker;

import android.util.Log;
import com.bytedance.crash.C3774m;

/* renamed from: com.bytedance.crash.heaptracker.a */
public final class C3760a {
    /* renamed from: a */
    public static void m15565a(String str, Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.e("npth", str + " " + obj);
        }
    }

    /* renamed from: b */
    public static void m15566b(String str, Object obj) {
        if (C3774m.m15611l().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }
}

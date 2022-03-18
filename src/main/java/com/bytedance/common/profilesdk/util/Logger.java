package com.bytedance.common.profilesdk.util;

import android.util.Log;

public class Logger {
    static boolean sEnabled;

    public static void enable(boolean z) {
        sEnabled = z;
    }

    /* renamed from: d */
    public static void m15163d(String str) {
        if (sEnabled) {
            Log.d("Deximage", str);
        }
    }

    /* renamed from: e */
    public static void m15164e(String str) {
        if (sEnabled) {
            Log.e("Deximage", str);
        }
    }

    /* renamed from: e */
    public static void m15165e(String str, Throwable th) {
        if (sEnabled) {
            Log.e("Deximage", str, th);
        }
    }
}

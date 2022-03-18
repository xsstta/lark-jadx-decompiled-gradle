package com.bytedance.apm.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.bytedance.apm.internal.a */
public class C3009a {

    /* renamed from: a */
    private static volatile boolean f9717a = false;

    /* renamed from: b */
    private static SharedPreferences f9718b = null;

    /* renamed from: c */
    private static int f9719c = 0;

    /* renamed from: d */
    private static int f9720d = 0;

    /* renamed from: e */
    private static long f9721e = 16408;

    /* renamed from: b */
    public static long m12649b() {
        return f9721e;
    }

    /* renamed from: c */
    public static int m12650c() {
        return (f9719c & -536870912) >>> 29;
    }

    /* renamed from: a */
    public static void m12643a() {
        SharedPreferences sharedPreferences = f9718b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", f9720d).putLong("monitor_switch_config_atrace_flag", f9721e).apply();
        }
    }

    /* renamed from: a */
    public static void m12646a(long j) {
        f9721e = j;
    }

    /* renamed from: a */
    public static void m12647a(Context context) {
        if (!f9717a) {
            f9717a = true;
            if (f9718b == null) {
                f9718b = context.getSharedPreferences("monitor_switch_config", 0);
            }
            SharedPreferences sharedPreferences = f9718b;
            if (sharedPreferences != null) {
                int i = sharedPreferences.getInt("monitor_switch_config_first_flag", 0);
                f9719c = i;
                f9720d = i;
                f9721e = f9718b.getLong("monitor_switch_config_atrace_flag", 0);
            }
        }
    }

    /* renamed from: a */
    public static boolean m12648a(int i) {
        if ((i & f9719c) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m12644a(int i, int i2) {
        f9720d = (i2 & i) + ((~i) & f9720d);
    }

    /* renamed from: a */
    public static void m12645a(int i, boolean z) {
        if (z) {
            f9720d = i | f9720d;
            return;
        }
        f9720d = (~i) & f9720d;
    }
}

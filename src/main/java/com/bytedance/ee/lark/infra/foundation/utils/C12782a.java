package com.bytedance.ee.lark.infra.foundation.utils;

import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.a */
public class C12782a {
    /* renamed from: a */
    public static void m52832a(String str, int i) {
        C57744a.m224104a().putInt(str, i);
    }

    /* renamed from: a */
    public static void m52833a(String str, long j) {
        C57744a.m224104a().putLong(str, j);
    }

    /* renamed from: b */
    public static int m52836b(String str, int i) {
        return C57744a.m224104a().getInt(str, i);
    }

    /* renamed from: a */
    public static void m52834a(String str, String str2) {
        C57744a.m224104a().putString(str, str2);
    }

    /* renamed from: b */
    public static long m52837b(String str, long j) {
        return C57744a.m224104a().getLong(str, j);
    }

    /* renamed from: a */
    public static void m52835a(String str, boolean z) {
        C57744a.m224104a().putBoolean(str, z);
    }

    /* renamed from: b */
    public static String m52838b(String str, String str2) {
        return C57744a.m224104a().getString(str, str2);
    }

    /* renamed from: b */
    public static boolean m52839b(String str, boolean z) {
        return C57744a.m224104a().getBoolean(str, z);
    }
}

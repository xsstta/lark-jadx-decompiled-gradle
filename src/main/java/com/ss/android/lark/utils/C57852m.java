package com.ss.android.lark.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.ss.android.lark.utils.m */
public class C57852m {
    /* renamed from: a */
    public static boolean m224554a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            return true;
        }
        return false;
    }
}

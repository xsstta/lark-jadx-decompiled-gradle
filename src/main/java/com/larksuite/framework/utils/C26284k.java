package com.larksuite.framework.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.larksuite.framework.utils.k */
public class C26284k {
    /* renamed from: a */
    public static boolean m95185a(Context context) {
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m95186b(Context context) {
        if (context == null || !context.getPackageName().endsWith(".debug")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m95187c(Context context) {
        if (context != null) {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
        }
        return "";
    }
}

package com.ss.android.lark.platform.lifecycle;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.platform.lifecycle.c */
public final class C51836c {
    /* renamed from: a */
    public static boolean m200983a(Context context) {
        return m200984a(context, context.getPackageName().concat(":p0"));
    }

    /* renamed from: b */
    private static List<ActivityManager.RunningAppProcessInfo> m200987b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getRunningAppProcesses();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m200984a(Context context, String str) {
        return m200985a(m200987b(context), str);
    }

    /* renamed from: b */
    private static ActivityManager.RunningAppProcessInfo m200986b(List<ActivityManager.RunningAppProcessInfo> list, String str) {
        if (list == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (TextUtils.equals(runningAppProcessInfo.processName, str)) {
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m200985a(List<ActivityManager.RunningAppProcessInfo> list, String str) {
        if (m200986b(list, str) != null) {
            return true;
        }
        return false;
    }
}

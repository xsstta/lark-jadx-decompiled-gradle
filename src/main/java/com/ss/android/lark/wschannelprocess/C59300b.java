package com.ss.android.lark.wschannelprocess;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.wschannelprocess.b */
public class C59300b {
    /* renamed from: a */
    public static boolean m230259a(Context context) {
        return m230260a(context, context.getPackageName());
    }

    /* renamed from: b */
    private static List<ActivityManager.RunningAppProcessInfo> m230263b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getRunningAppProcesses();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m230260a(Context context, String str) {
        return m230261a(m230263b(context), str);
    }

    /* renamed from: b */
    private static ActivityManager.RunningAppProcessInfo m230262b(List<ActivityManager.RunningAppProcessInfo> list, String str) {
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
    private static boolean m230261a(List<ActivityManager.RunningAppProcessInfo> list, String str) {
        if (m230262b(list, str) != null) {
            return true;
        }
        return false;
    }
}

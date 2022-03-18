package com.bytedance.ee.util.p701d;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.util.d.h */
public class C13628h {
    /* renamed from: a */
    public static boolean m55294a(Context context) {
        return m55295a(context, context.getPackageName().concat(context.getString(R.string.config_doc_process)));
    }

    /* renamed from: b */
    private static List<ActivityManager.RunningAppProcessInfo> m55298b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getRunningAppProcesses();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m55295a(Context context, String str) {
        return m55296a(m55298b(context), str);
    }

    /* renamed from: b */
    private static ActivityManager.RunningAppProcessInfo m55297b(List<ActivityManager.RunningAppProcessInfo> list, String str) {
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
    private static boolean m55296a(List<ActivityManager.RunningAppProcessInfo> list, String str) {
        if (m55297b(list, str) != null) {
            return true;
        }
        return false;
    }
}

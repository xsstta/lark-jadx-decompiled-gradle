package com.ss.android.lark.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.ac */
public class C57765ac {
    /* renamed from: a */
    public static boolean m224187a(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || (!a.endsWith(":docs") && !a.endsWith(":p0"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m224188b(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !TextUtils.equals(a, context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m224189c(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || (!a.contains(":miniapp") && !a.contains(":oryx"))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m224190d(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":sandboxed_process")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m224191e(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":widgetProvider")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m224192f(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":simple")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m224193g(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":wschannel")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m224194h(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":mailweb")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m224195i(Context context) {
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":safemode")) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static Boolean m224196j(Context context) {
        boolean z;
        String a = C26252ad.m94992a(context);
        if (TextUtils.isEmpty(a) || !a.contains(":meego")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: k */
    public static boolean m224197k(Context context) {
        if (context == null) {
            Log.m165383e("ProcessJudge", "isMainProcessExist: context is null, so return");
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            Log.m165383e("ProcessJudge", "isMainProcessExist: activityManager is null, so return");
            return false;
        }
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            Log.m165383e("ProcessJudge", "isMainProcessExist: get running process info  is null, so return");
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName)) {
                Log.m165389i("ProcessJudge", "found main process process: " + runningAppProcessInfo.processName);
                return true;
            }
        }
        return false;
    }
}

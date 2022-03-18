package com.ss.android.lark.p2909v;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.lark.v.d */
public class C57897d {

    /* renamed from: a */
    private static String f142517a;

    /* renamed from: b */
    private static boolean f142518b;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053 A[SYNTHETIC, Splitter:B:30:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005e A[SYNTHETIC, Splitter:B:36:0x005e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m224695a() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p2909v.C57897d.m224695a():java.lang.String");
    }

    /* renamed from: a */
    public static String m224696a(Context context) {
        if (!TextUtils.isEmpty(f142517a)) {
            return f142517a;
        }
        String d = m224699d(context);
        f142517a = d;
        if (!TextUtils.isEmpty(d)) {
            return f142517a;
        }
        String a = m224695a();
        f142517a = a;
        if (!TextUtils.isEmpty(a)) {
            return f142517a;
        }
        String e = m224700e(context);
        f142517a = e;
        return e;
    }

    /* renamed from: b */
    public static boolean m224697b(Context context) {
        boolean z = f142518b;
        if (z) {
            return z;
        }
        String a = m224696a(context);
        f142517a = a;
        if (!TextUtils.isEmpty(a) && f142517a.indexOf(":") == -1) {
            f142518b = true;
        }
        return f142518b;
    }

    /* renamed from: c */
    public static String m224698c(Context context) {
        int indexOf;
        if (m224697b(context)) {
            return "";
        }
        if (!TextUtils.isEmpty(f142517a) && (indexOf = f142517a.indexOf(":")) != -1) {
            return f142517a.substring(indexOf + 1);
        }
        return "unknown";
    }

    /* renamed from: e */
    private static String m224700e(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT < 21 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName.trim();
            }
        }
        return "";
    }

    /* renamed from: d */
    private static String m224699d(Context context) {
        try {
            Application application = (Application) context.getApplicationContext();
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

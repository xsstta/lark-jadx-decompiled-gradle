package com.ss.android.lark.passport.infra.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.util.w */
public class C49224w {

    /* renamed from: a */
    private static String f123550a;

    /* renamed from: b */
    private static boolean f123551b;

    /* renamed from: a */
    public static boolean m194052a() {
        return m194051a(LarkContext.getApplication()).contains(":upgrade");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC, Splitter:B:31:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m194053b() {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/cmdline"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0060
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x0060
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0046 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0046 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0046 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0046 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0046 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r2.close()     // Catch:{ Exception -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0039:
            return r0
        L_0x003a:
            r2.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0060
        L_0x003e:
            r0 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0041:
            r0 = move-exception
            r1 = r2
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            goto L_0x0055
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            r0.printStackTrace()     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0060
            r1.close()
            goto L_0x0060
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0060
        L_0x0055:
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r1 = move-exception
            r1.printStackTrace()
        L_0x005f:
            throw r0
        L_0x0060:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.util.C49224w.m194053b():java.lang.String");
    }

    /* renamed from: a */
    public static String m194051a(Context context) {
        if (!TextUtils.isEmpty(f123550a)) {
            return f123550a;
        }
        String c = m194055c(context);
        f123550a = c;
        if (!TextUtils.isEmpty(c)) {
            return f123550a;
        }
        String b = m194053b();
        f123550a = b;
        if (!TextUtils.isEmpty(b)) {
            return f123550a;
        }
        String d = m194056d(context);
        f123550a = d;
        return d;
    }

    /* renamed from: b */
    public static boolean m194054b(Context context) {
        boolean z = f123551b;
        if (z) {
            return z;
        }
        String a = m194051a(context);
        f123550a = a;
        if (!TextUtils.isEmpty(a) && f123550a.indexOf(":") == -1) {
            f123551b = true;
        }
        return f123551b;
    }

    /* renamed from: d */
    private static String m194056d(Context context) {
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

    /* renamed from: c */
    private static String m194055c(Context context) {
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

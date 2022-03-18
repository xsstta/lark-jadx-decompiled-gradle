package com.ss.android.vcxp.p3186c;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.vcxp.c.b */
public class C63803b {

    /* renamed from: a */
    private static String f161006a;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC, Splitter:B:31:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m250504a() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vcxp.p3186c.C63803b.m250504a():java.lang.String");
    }

    /* renamed from: a */
    public static String m250505a(Context context) {
        String b = m250506b(context);
        if (b == null) {
            C60700b.m235854c("ProcessUtil", "[getProcessShortName]", "failed");
            return "";
        }
        int indexOf = b.indexOf(":");
        if (indexOf > 0) {
            return b.substring(indexOf + 1);
        }
        return "";
    }

    /* renamed from: b */
    public static String m250506b(Context context) {
        String str = f161006a;
        if (str != null) {
            return str;
        }
        String c = m250507c(context);
        f161006a = c;
        if (!TextUtils.isEmpty(c)) {
            return f161006a;
        }
        String a = m250504a();
        f161006a = a;
        if (!TextUtils.isEmpty(a)) {
            return f161006a;
        }
        String d = m250508d(context);
        f161006a = d;
        return d;
    }

    /* renamed from: d */
    private static String m250508d(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT < 21 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() <= 0) {
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
    private static String m250507c(Context context) {
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

package ee.android.framework.manis.p3450a;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: ee.android.framework.manis.a.c */
public class C68182c {

    /* renamed from: a */
    private static String f171419a;

    /* renamed from: b */
    private static boolean f171420b;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC, Splitter:B:31:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m264833a() {
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
        throw new UnsupportedOperationException("Method not decompiled: ee.android.framework.manis.p3450a.C68182c.m264833a():java.lang.String");
    }

    /* renamed from: a */
    public static String m264834a(Context context) {
        if (!TextUtils.isEmpty(f171419a)) {
            return f171419a;
        }
        String d = m264837d(context);
        f171419a = d;
        if (!TextUtils.isEmpty(d)) {
            return f171419a;
        }
        String a = m264833a();
        f171419a = a;
        if (!TextUtils.isEmpty(a)) {
            return f171419a;
        }
        String e = m264838e(context);
        f171419a = e;
        return e;
    }

    /* renamed from: b */
    public static boolean m264835b(Context context) {
        boolean z = f171420b;
        if (z) {
            return z;
        }
        String a = m264834a(context);
        f171419a = a;
        if (!TextUtils.isEmpty(a) && f171419a.indexOf(":") == -1) {
            f171420b = true;
        }
        return f171420b;
    }

    /* renamed from: c */
    public static String m264836c(Context context) {
        int indexOf;
        if (m264835b(context)) {
            return "";
        }
        if (!TextUtils.isEmpty(f171419a) && (indexOf = f171419a.indexOf(":")) != -1) {
            return f171419a.substring(indexOf + 1);
        }
        return "unknown";
    }

    /* renamed from: e */
    private static String m264838e(Context context) {
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
    private static String m264837d(Context context) {
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

package com.ss.android.agilelogger;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.ss.android.agilelogger.e */
public class C27509e {
    /* renamed from: a */
    public static boolean m100436a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|10|11|(2:13|(3:15|16|17))|19|20|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r1.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r2 = r2.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1 = null;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r1 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = new java.io.BufferedReader(new java.io.FileReader("/proc/self/cmdline"));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC, Splitter:B:25:0x0058] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m100438b() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000b
            java.lang.String r0 = android.app.Application.getProcessName()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r2 = "currentProcessName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0028 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x0028 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x0028 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0028 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0028 }
            return r1
        L_0x0028:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x005c, all -> 0x0052 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x005c, all -> 0x0052 }
            java.lang.String r3 = "/proc/self/cmdline"
            r2.<init>(r3)     // Catch:{ Exception -> 0x005c, all -> 0x0052 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x005c, all -> 0x0052 }
            java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x005d, all -> 0x0050 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x005d, all -> 0x0050 }
            if (r3 != 0) goto L_0x004c
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x005d, all -> 0x0050 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x005d, all -> 0x0050 }
            if (r3 != 0) goto L_0x004c
            r1.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return r2
        L_0x004c:
            r1.close()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x0050:
            r0 = move-exception
            goto L_0x0056
        L_0x0052:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            throw r0
        L_0x005c:
            r1 = r0
        L_0x005d:
            if (r1 == 0) goto L_0x0060
            goto L_0x004c
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.C27509e.m100438b():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m100437a(Context context) {
        String b = m100438b();
        if (b == null || b.contains(":")) {
            return false;
        }
        if (!b.equals(context.getPackageName()) && !b.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }
}

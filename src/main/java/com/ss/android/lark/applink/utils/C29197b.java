package com.ss.android.lark.applink.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: com.ss.android.lark.applink.utils.b */
public final class C29197b {

    /* renamed from: a */
    private static String f73073a;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m107350a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x004b }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r4.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x004b }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x004b }
            r4.append(r5)     // Catch:{ all -> 0x004b }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x004b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004b }
            r3.<init>(r4)     // Catch:{ all -> 0x004b }
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ all -> 0x004b }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x004b }
            r1.<init>(r2)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r2.<init>()     // Catch:{ all -> 0x0049 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0049 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0049 }
            r2.append(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0049 }
            r1.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0048:
            return r0
        L_0x0049:
            goto L_0x004c
        L_0x004b:
            r1 = r0
        L_0x004c:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.applink.utils.C29197b.m107350a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m107351a(Context context) {
        return m107352a(m107353b(context));
    }

    /* renamed from: a */
    public static boolean m107352a(String str) {
        if (TextUtils.isEmpty(str) || str.contains(":")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m107353b(Context context) {
        String str = f73073a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f73073a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m107350a();
        f73073a = a;
        return a;
    }
}

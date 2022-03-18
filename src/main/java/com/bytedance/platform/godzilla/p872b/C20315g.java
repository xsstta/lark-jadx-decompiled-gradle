package com.bytedance.platform.godzilla.p872b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: com.bytedance.platform.godzilla.b.g */
public final class C20315g {

    /* renamed from: a */
    private static String f49588a;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m74086a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r4.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0046 }
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0044 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.p872b.C20315g.m74086a():java.lang.String");
    }

    /* renamed from: a */
    public static String m74087a(Context context) {
        if (!TextUtils.isEmpty(f49588a)) {
            return f49588a;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    f49588a = runningAppProcessInfo.processName;
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m74086a();
        f49588a = a;
        return a;
    }
}

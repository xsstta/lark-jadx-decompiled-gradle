package com.bytedance.apm.util;

import android.app.Application;
import android.content.Context;
import android.os.Process;

/* renamed from: com.bytedance.apm.util.a */
public class C3111a {

    /* renamed from: a */
    public static String f10012a;

    /* renamed from: b */
    private static Boolean f10013b;

    /* renamed from: a */
    public static Application m12934a(Context context) {
        if (context == null) {
            return null;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return (Application) context;
    }

    /* renamed from: b */
    public static boolean m12936b(Context context) {
        String a = m12935a(Process.myPid());
        if ((a == null || !a.contains(":")) && a != null && a.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m12937c(Context context) {
        boolean z;
        Boolean bool = f10013b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f10013b = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[SYNTHETIC, Splitter:B:23:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12935a(int r5) {
        /*
            java.lang.String r0 = com.bytedance.apm.util.C3111a.f10012a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r5 = com.bytedance.apm.util.C3111a.f10012a
            return r5
        L_0x000b:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r3.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch:{ all -> 0x0047 }
            r3.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0047 }
            r2.<init>(r5)     // Catch:{ all -> 0x0047 }
            r1.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x003a
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0045 }
        L_0x003a:
            com.bytedance.apm.util.C3111a.f10012a = r5     // Catch:{ all -> 0x0045 }
            r1.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0044:
            return r5
        L_0x0045:
            r5 = move-exception
            goto L_0x0049
        L_0x0047:
            r5 = move-exception
            r1 = r0
        L_0x0049:
            r5.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0056:
            return r0
        L_0x0057:
            r5 = move-exception
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0062:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3111a.m12935a(int):java.lang.String");
    }
}

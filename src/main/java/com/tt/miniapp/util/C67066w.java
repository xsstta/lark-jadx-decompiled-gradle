package com.tt.miniapp.util;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.tt.miniapp.util.w */
public class C67066w {

    /* renamed from: a */
    private static final CharSequence f169044a = "sony";

    /* renamed from: b */
    private static final CharSequence f169045b = "amigo";

    /* renamed from: c */
    private static final CharSequence f169046c = "funtouch";

    /* renamed from: a */
    public static boolean m261374a() {
        String str = Build.BRAND + Build.MANUFACTURER;
        if (!TextUtils.isEmpty(m261373a("ro.letv.release.version")) || (!TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains("letv"))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[SYNTHETIC, Splitter:B:14:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m261373a(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r3.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "getprop "
            r3.append(r4)     // Catch:{ all -> 0x003e }
            r3.append(r5)     // Catch:{ all -> 0x003e }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x003e }
            java.lang.Process r5 = r2.exec(r5)     // Catch:{ all -> 0x003e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x003e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x003e }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ all -> 0x003e }
            r3.<init>(r4)     // Catch:{ all -> 0x003e }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x003c }
            r5.destroy()     // Catch:{ all -> 0x003c }
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r5 = move-exception
            r5.printStackTrace()
        L_0x003b:
            return r0
        L_0x003c:
            r1 = r2
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67066w.m261373a(java.lang.String):java.lang.String");
    }
}

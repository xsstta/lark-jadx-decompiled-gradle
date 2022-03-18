package com.bytedance.apm6.p177f;

import android.os.Process;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.f.d */
public class C3315d {
    /* renamed from: a */
    static long m13798a() {
        try {
            String[] split = m13800a(String.format("/proc/%s/status", Integer.valueOf(Process.myPid()))).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m13800a(java.lang.String r2) throws java.lang.Exception {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = m13799a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r2
        L_0x0013:
            r2 = move-exception
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.p177f.C3315d.m13800a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m13799a(java.io.InputStream r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
        L_0x0010:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            r4 = 10
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001f:
            r2.close()
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0027:
            r4 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.p177f.C3315d.m13799a(java.io.InputStream):java.lang.String");
    }
}

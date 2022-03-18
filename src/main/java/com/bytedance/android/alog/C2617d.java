package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.bytedance.android.alog.d */
class C2617d {
    /* renamed from: a */
    static String m11038a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC, Splitter:B:18:0x0031] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m11039b(android.content.Context r4) {
        /*
            r4 = 0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0035, all -> 0x002b }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0035, all -> 0x002b }
            java.lang.String r2 = "/proc/self/cmdline"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x002b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0035, all -> 0x002b }
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x0036, all -> 0x0029 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0036, all -> 0x0029 }
            if (r2 != 0) goto L_0x0025
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x0036, all -> 0x0029 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0036, all -> 0x0029 }
            if (r2 != 0) goto L_0x0025
            r0.close()     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            return r1
        L_0x0025:
            r0.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0039
        L_0x0029:
            r4 = move-exception
            goto L_0x002f
        L_0x002b:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            throw r4
        L_0x0035:
            r0 = r4
        L_0x0036:
            if (r0 == 0) goto L_0x0039
            goto L_0x0025
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.C2617d.m11039b(android.content.Context):java.lang.String");
    }
}

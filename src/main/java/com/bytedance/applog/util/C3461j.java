package com.bytedance.applog.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.manager.C3435g;

/* renamed from: com.bytedance.applog.util.j */
public class C3461j {

    /* renamed from: a */
    private static volatile String f10983a;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14620a(android.content.Context r5, com.bytedance.applog.manager.C3435g r6) {
        /*
            java.lang.String r0 = com.bytedance.applog.util.C3461j.f10983a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005c
            java.lang.Class<com.bytedance.applog.util.j> r0 = com.bytedance.applog.util.C3461j.class
            monitor-enter(r0)
            java.lang.String r1 = com.bytedance.applog.util.C3461j.f10983a     // Catch:{ all -> 0x0059 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0017
            java.lang.String r5 = com.bytedance.applog.util.C3461j.f10983a     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return r5
        L_0x0017:
            r1 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.getId()     // Catch:{ all -> 0x0023 }
            goto L_0x0031
        L_0x0023:
            r2 = move-exception
            boolean r3 = r2 instanceof java.lang.ClassNotFoundException
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2 instanceof java.lang.NoClassDefFoundError
            if (r3 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r2.printStackTrace()
        L_0x0030:
            r2 = r1
        L_0x0031:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0042
            android.content.SharedPreferences r5 = r6.mo13831j()
            java.lang.String r6 = "google_aid"
            java.lang.String r2 = r5.getString(r6, r1)
            goto L_0x0055
        L_0x0042:
            android.content.SharedPreferences r3 = r6.mo13831j()
            java.lang.String r4 = "google_aid"
            java.lang.String r1 = r3.getString(r4, r1)
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0055
            m14621a(r5, r2, r6)
        L_0x0055:
            com.bytedance.applog.util.C3461j.f10983a = r2
            monitor-exit(r0)
            goto L_0x005c
        L_0x0059:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x005c:
            java.lang.String r5 = com.bytedance.applog.util.C3461j.f10983a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3461j.m14620a(android.content.Context, com.bytedance.applog.manager.g):java.lang.String");
    }

    /* renamed from: a */
    private static void m14621a(Context context, String str, C3435g gVar) {
        if (!TextUtils.isEmpty(str) && context != null) {
            gVar.mo13831j().edit().putString("google_aid", str).apply();
        }
    }
}

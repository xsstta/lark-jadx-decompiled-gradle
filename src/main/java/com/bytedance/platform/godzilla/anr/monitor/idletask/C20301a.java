package com.bytedance.platform.godzilla.anr.monitor.idletask;

import android.util.Printer;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.anr.monitor.idletask.a */
final class C20301a {

    /* renamed from: a */
    private static Field f49574a;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:2|3|4)|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Printer m74052a() {
        /*
            java.lang.reflect.Field r0 = com.bytedance.platform.godzilla.anr.monitor.idletask.C20301a.f49574a
            if (r0 != 0) goto L_0x000e
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            java.lang.String r1 = "mLogging"
            java.lang.reflect.Field r0 = com.bytedance.platform.godzilla.common.C20324d.m74109a(r0, r1)     // Catch:{ all -> 0x000e }
            com.bytedance.platform.godzilla.anr.monitor.idletask.C20301a.f49574a = r0     // Catch:{ all -> 0x000e }
        L_0x000e:
            java.lang.reflect.Field r0 = com.bytedance.platform.godzilla.anr.monitor.idletask.C20301a.f49574a     // Catch:{ all -> 0x001b }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x001b }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x001b }
            android.util.Printer r0 = (android.util.Printer) r0     // Catch:{ all -> 0x001b }
            return r0
        L_0x001b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.anr.monitor.idletask.C20301a.m74052a():android.util.Printer");
    }

    /* renamed from: a */
    static void m74053a(String str) {
        Printer a = m74052a();
        if (a != null) {
            a.println(str);
        }
    }
}

package com.tt.miniapp.process.manager;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import java.util.List;

/* renamed from: com.tt.miniapp.process.manager.c */
public class C66653c {
    /* renamed from: a */
    public static List<ActivityManager.RunningServiceInfo> m260373a() {
        ActivityManager activityManager;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null || (activityManager = (ActivityManager) applicationContext.getApplicationContext().getSystemService("activity")) == null) {
            return null;
        }
        return activityManager.getRunningServices(Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static List<ActivityManager.RunningAppProcessInfo> m260374a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            if (activityManager != null) {
                return activityManager.getRunningAppProcesses();
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("AppSandboxEnvUtils", e);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m260375b(android.content.Context r3) {
        /*
            java.util.List r3 = m260374a(r3)
            if (r3 != 0) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            java.lang.String r1 = r0.processName
            java.lang.String r2 = "miniapp0"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r0.processName
            java.lang.String r2 = "miniapp1"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r0.processName
            java.lang.String r2 = "miniapp2"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r0.processName
            java.lang.String r2 = "miniapp3"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r0 = r0.processName
            java.lang.String r1 = "miniapp4"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x000c
        L_0x004a:
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L_0x0050:
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.process.manager.C66653c.m260375b(android.content.Context):java.lang.Boolean");
    }
}

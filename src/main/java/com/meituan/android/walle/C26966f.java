package com.meituan.android.walle;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.meituan.android.walle.f */
public final class C26966f {
    /* renamed from: b */
    private static String m98001b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C26962b m98000a(Context context) {
        String b = m98001b(context);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return C26963c.m97991a(new File(b));
    }
}

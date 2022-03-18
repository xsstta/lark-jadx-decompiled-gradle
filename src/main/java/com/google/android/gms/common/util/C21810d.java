package com.google.android.gms.common.util;

import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.d */
public final class C21810d {

    /* renamed from: a */
    private static Boolean f53211a;

    /* renamed from: b */
    private static Boolean f53212b;

    /* renamed from: c */
    private static Boolean f53213c;

    /* renamed from: a */
    public static boolean m79084a(Context context) {
        if (f53211a == null) {
            f53211a = Boolean.valueOf(PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f53211a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m79085b(Context context) {
        if (!m79084a(context)) {
            return false;
        }
        if (PlatformVersion.isAtLeastN()) {
            return m79086c(context) && !PlatformVersion.isAtLeastO();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m79086c(Context context) {
        if (f53212b == null) {
            f53212b = Boolean.valueOf(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f53212b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m79087d(Context context) {
        if (f53213c == null) {
            f53213c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f53213c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m79083a() {
        return "user".equals(Build.TYPE);
    }
}

package com.tt.miniapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: com.tt.miniapp.util.c */
public class C67029c {
    /* renamed from: a */
    private static String m261244a() {
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m261245a(Activity activity) {
        if (m261246a((Context) activity)) {
            if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8);
            } else if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(7942);
                activity.getWindow().addFlags(134217728);
            }
        }
    }

    /* renamed from: a */
    public static boolean m261246a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        String a = m261244a();
        if ("1".equals(a)) {
            return false;
        }
        if ("0".equals(a)) {
            return true;
        }
        return z;
    }
}

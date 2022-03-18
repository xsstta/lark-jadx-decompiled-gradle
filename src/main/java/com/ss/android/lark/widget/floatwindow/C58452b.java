package com.ss.android.lark.widget.floatwindow;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import com.larksuite.framework.utils.RomUtils;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.widget.floatwindow.b */
public class C58452b {
    /* renamed from: a */
    public static boolean m226635a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return m226636b(context);
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m226636b(Context context) {
        Method method;
        try {
            Object systemService = context.getSystemService("appops");
            if (systemService == null || (method = systemService.getClass().getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class)) == null) {
                return false;
            }
            if (((Integer) method.invoke(systemService, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0 || RomUtils.m94954i().mo93347d() == RomUtils.RomType.UNKNOWN) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}

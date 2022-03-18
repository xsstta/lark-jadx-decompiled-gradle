package com.ss.android.floatbubble.util.p1319b;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.floatbubble.util.RomUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.floatbubble.util.b.a */
public class C28468a {
    /* renamed from: a */
    public static int m104316a(WindowManager windowManager) {
        Display defaultDisplay;
        Display.Mode mode;
        if (windowManager == null || Build.VERSION.SDK_INT < 23 || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (mode = defaultDisplay.getMode()) == null) {
            return 0;
        }
        return mode.getPhysicalHeight();
    }

    /* renamed from: b */
    public static int m104320b(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("desktop_status_bar_height", "dimen", "android"));
    }

    /* renamed from: c */
    public static int m104322c(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("desktop_navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    public static int m104321b(WindowManager windowManager) {
        Display defaultDisplay;
        Display.Mode mode;
        if (windowManager == null || Build.VERSION.SDK_INT < 23 || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (mode = defaultDisplay.getMode()) == null) {
            return 0;
        }
        return mode.getPhysicalWidth();
    }

    /* renamed from: a */
    public static void m104318a(WindowManager.LayoutParams layoutParams) {
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField("privateFlags");
            declaredField.setAccessible(true);
            declaredField.set(layoutParams, Integer.valueOf(((Integer) declaredField.get(layoutParams)).intValue() | ((Integer) m104317a(WindowManager.LayoutParams.class, "PRIVATE_FLAG_NOT_LIMIT_FLOAT_WINDOW")).intValue()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m104319a(Context context) {
        if (context != null && DesktopUtil.m144301a(context) && RomUtils.m104305e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Object m104317a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

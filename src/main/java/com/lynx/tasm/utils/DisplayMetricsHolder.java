package com.lynx.tasm.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.C26614b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DisplayMetricsHolder {

    /* renamed from: a */
    private static DisplayMetrics f66890a = null;

    /* renamed from: b */
    private static DisplayMetrics f66891b = null;

    /* renamed from: c */
    private static int f66892c = -1;

    /* renamed from: d */
    private static float f66893d = -1.0f;

    /* renamed from: e */
    private static boolean f66894e;

    static native void nativeUpdateDevice(int i, int i2, float f, String str);

    /* renamed from: a */
    public static synchronized DisplayMetrics m97898a() {
        DisplayMetrics displayMetrics;
        synchronized (DisplayMetricsHolder.class) {
            displayMetrics = f66891b;
        }
        return displayMetrics;
    }

    /* renamed from: a */
    private static void m97901a(DisplayMetrics displayMetrics) {
        if (f66890a == null) {
            f66890a = new DisplayMetrics();
        }
        f66890a.setTo(displayMetrics);
    }

    /* renamed from: b */
    private static void m97903b(DisplayMetrics displayMetrics) {
        boolean n = LynxEnv.m96123e().mo94107n();
        synchronized (DisplayMetricsHolder.class) {
            f66891b = displayMetrics;
            if (n) {
                f66894e = true;
                nativeUpdateDevice(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, String.valueOf(Build.VERSION.SDK_INT));
            }
        }
    }

    /* renamed from: a */
    public static DisplayMetrics m97899a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(f66890a);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C26614b.m96456a(windowManager, "WindowManager is null!");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e);
            }
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static void m97900a(int i, int i2) {
        DisplayMetrics displayMetrics = f66890a;
        if (displayMetrics != null) {
            displayMetrics.widthPixels = i;
            f66890a.heightPixels = i2;
        }
        DisplayMetrics displayMetrics2 = f66891b;
        if (displayMetrics2 != null) {
            displayMetrics2.widthPixels = i;
            f66891b.heightPixels = i2;
        }
    }

    /* renamed from: a */
    public static boolean m97902a(Context context, Float f) {
        boolean z;
        boolean z2;
        boolean z3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (f66891b == null || (displayMetrics.widthPixels == f66891b.widthPixels && displayMetrics.heightPixels == f66891b.heightPixels)) {
            z = false;
        } else {
            z = true;
        }
        if (f != null) {
            displayMetrics.density = f.floatValue();
        }
        m97901a(displayMetrics);
        int i = context.getResources().getConfiguration().orientation;
        if (f66892c != i) {
            z2 = true;
        } else {
            z2 = false;
        }
        f66892c = i;
        if (f66893d != displayMetrics.scaledDensity) {
            z3 = true;
        } else {
            z3 = false;
        }
        f66893d = displayMetrics.scaledDensity;
        if (m97898a() != null && !z2 && !z3 && !z && f66894e) {
            return false;
        }
        DisplayMetrics a = m97899a(context);
        if (f != null) {
            a.density = f.floatValue();
        }
        m97903b(a);
        return true;
    }
}

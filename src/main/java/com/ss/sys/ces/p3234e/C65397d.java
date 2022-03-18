package com.ss.sys.ces.p3234e;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.ss.sys.ces.e.d */
public class C65397d {

    /* renamed from: a */
    public static int f164657a;

    /* renamed from: b */
    public static int f164658b;

    /* renamed from: c */
    public static int f164659c;

    /* renamed from: a */
    private static void m256467a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f = displayMetrics.density;
                f164659c = displayMetrics.densityDpi;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m256468b(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.xdpi;
            float f2 = displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m256469c(Context context) {
        int i;
        int i2;
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
                i2 = point.x;
            } else if (Build.VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
                i2 = point.x;
            } else {
                f164657a = defaultDisplay.getWidth();
                i = defaultDisplay.getHeight();
                f164658b = i;
            }
            f164657a = i2;
            i = point.y;
            f164658b = i;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static String m256470d(Context context) {
        try {
            m256469c(context);
            m256467a(context);
            m256468b(context);
        } catch (Throwable unused) {
        }
        return "" + f164659c + "[<!>]" + f164657a + "*" + f164658b + "[<!>]";
    }
}

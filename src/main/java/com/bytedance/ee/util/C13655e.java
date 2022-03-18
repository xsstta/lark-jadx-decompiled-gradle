package com.bytedance.ee.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.e */
public class C13655e {

    /* renamed from: a */
    private static int f35850a = 0;

    /* renamed from: b */
    private static int f35851b = -1;

    /* renamed from: a */
    public static int m55409a() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m55413b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a */
    public static int m55410a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m55414b(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: c */
    public static int m55416c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static int m55411a(int i) {
        return m55410a(Float.valueOf((float) i).floatValue());
    }

    /* renamed from: b */
    public static int m55415b(Context context) {
        if (f35850a <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f35850a = displayMetrics.widthPixels;
        }
        return f35850a;
    }

    /* renamed from: a */
    public static int m55412a(Context context) {
        int i = f35851b;
        if (i != -1) {
            return i;
        }
        Resources resources = context.getResources();
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            f35851b = resources.getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            C13479a.m54770c("ScreenUtil", e);
        }
        if (f35851b <= 0) {
            C13479a.m54758a("ScreenUtil", "获取状态栏高度时得到异常值： " + f35851b);
        }
        return f35851b;
    }
}

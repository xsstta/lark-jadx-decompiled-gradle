package com.ss.android.lark.widget.ptr.p2962b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.ss.android.lark.widget.ptr.b.a */
public class C58937a {

    /* renamed from: a */
    public static int f145946a;

    /* renamed from: b */
    public static int f145947b;

    /* renamed from: c */
    public static float f145948c;

    /* renamed from: d */
    public static int f145949d;

    /* renamed from: e */
    public static int f145950e;

    /* renamed from: a */
    public static int m228778a(float f) {
        return (int) ((f * f145948c) + 0.5f);
    }

    /* renamed from: a */
    public static void m228779a(Context context) {
        if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f145946a = displayMetrics.widthPixels;
            f145947b = displayMetrics.heightPixels;
            f145948c = displayMetrics.density;
            f145949d = (int) (((float) f145946a) / displayMetrics.density);
            f145950e = (int) (((float) f145947b) / displayMetrics.density);
        }
    }
}

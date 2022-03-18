package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.d */
public class C13264d {

    /* renamed from: a */
    public static int f35127a;

    /* renamed from: b */
    public static int f35128b;

    /* renamed from: c */
    public static int f35129c;

    /* renamed from: d */
    public static int f35130d;

    /* renamed from: e */
    public static int f35131e;

    /* renamed from: f */
    public static int f35132f;

    /* renamed from: g */
    public static int f35133g;

    /* renamed from: h */
    public static int f35134h;

    /* renamed from: i */
    public static int f35135i;

    /* renamed from: j */
    public static int f35136j;

    /* renamed from: k */
    public static int f35137k;

    /* renamed from: l */
    public static int f35138l;

    /* renamed from: m */
    public static int f35139m;

    /* renamed from: n */
    public static int f35140n;

    /* renamed from: o */
    public static int f35141o;

    /* renamed from: b */
    private static void m54036b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        f35133g = i;
        f35135i = (int) (((float) i) * 0.9f);
        f35140n = (int) (((float) i) * 0.7f);
    }

    /* renamed from: a */
    public static void m54035a(Context context) {
        if (f35127a == 0) {
            f35128b = m54034a(context, 30.0f);
            f35127a = m54034a(context, 24.0f);
            f35129c = 0;
            f35130d = m54034a(context, 16.0f);
            f35131e = 0;
            f35132f = -1;
            f35141o = m54034a(context, 50.0f);
            f35134h = m54034a(context, 1.0f);
            f35136j = m54034a(context, 15.0f);
            f35137k = m54034a(context, 15.0f);
            f35138l = m54034a(context, 280.0f);
            f35139m = m54034a(context, 277.0f);
            m54036b(context);
        }
    }

    /* renamed from: a */
    public static int m54034a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}

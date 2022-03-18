package com.ss.android.ttve.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ttve.utils.a */
public class C60275a {

    /* renamed from: a */
    public static final boolean f150483a;

    /* renamed from: b */
    public static C60276a f150484b = new C60276a();

    /* renamed from: c */
    private static int f150485c = -1;

    /* renamed from: com.ss.android.ttve.utils.a$a */
    public static class C60276a {
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f150483a = z;
    }

    /* renamed from: a */
    public static final int m234186a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m234187b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static float m234185a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}

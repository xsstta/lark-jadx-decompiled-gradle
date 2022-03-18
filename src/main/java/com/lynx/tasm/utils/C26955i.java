package com.lynx.tasm.utils;

import android.util.TypedValue;

/* renamed from: com.lynx.tasm.utils.i */
public class C26955i {
    /* renamed from: a */
    public static float m97951a(double d) {
        return m97952a((float) d);
    }

    /* renamed from: c */
    public static float m97954c(float f) {
        return f / DisplayMetricsHolder.m97898a().density;
    }

    /* renamed from: a */
    public static float m97952a(float f) {
        return TypedValue.applyDimension(1, f, DisplayMetricsHolder.m97898a());
    }

    /* renamed from: b */
    public static float m97953b(float f) {
        return TypedValue.applyDimension(2, f, DisplayMetricsHolder.m97898a());
    }
}

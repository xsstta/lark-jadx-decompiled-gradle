package com.scwang.smartrefresh.layout.p1237d;

import android.content.res.Resources;

/* renamed from: com.scwang.smartrefresh.layout.d.b */
public class C27144b {

    /* renamed from: a */
    float f67465a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    public static float m98679b(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public int mo96505c(float f) {
        return (int) ((f * this.f67465a) + 0.5f);
    }

    /* renamed from: a */
    public static int m98678a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}

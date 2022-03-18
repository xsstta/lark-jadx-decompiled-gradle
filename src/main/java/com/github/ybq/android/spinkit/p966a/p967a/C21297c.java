package com.github.ybq.android.spinkit.p966a.p967a;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: com.github.ybq.android.spinkit.a.a.c */
public class C21297c {
    /* renamed from: a */
    public static Interpolator m77142a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C21298d.m77143a(f, f2, f3, f4);
        }
        return C21299e.m77144a(f, f2, f3, f4);
    }
}

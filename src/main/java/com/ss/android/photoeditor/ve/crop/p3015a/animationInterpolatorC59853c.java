package com.ss.android.photoeditor.ve.crop.p3015a;

import android.view.animation.Interpolator;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.c  reason: invalid class name */
public class animationInterpolatorC59853c implements Interpolator {

    /* renamed from: a */
    private float f148850a;

    public animationInterpolatorC59853c() {
        this.f148850a = 1.0f;
    }

    public animationInterpolatorC59853c(float f) {
        this.f148850a = f;
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.f148850a;
        return (float) ((pow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
    }
}

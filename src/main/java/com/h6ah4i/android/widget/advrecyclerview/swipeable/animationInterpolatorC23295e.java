package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.view.animation.Interpolator;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.e  reason: invalid class name */
class animationInterpolatorC23295e implements Interpolator {

    /* renamed from: a */
    private final float f57455a;

    public animationInterpolatorC23295e(float f) {
        this.f57455a = f;
    }

    public float getInterpolation(float f) {
        float f2 = 1.0f - f;
        return this.f57455a * (1.0f - (f2 * f2));
    }
}

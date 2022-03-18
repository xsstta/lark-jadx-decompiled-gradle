package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.view.animation.Interpolator;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.e  reason: invalid class name */
class animationInterpolatorC44038e implements Interpolator {

    /* renamed from: a */
    private final float f111777a;

    public animationInterpolatorC44038e(float f) {
        this.f111777a = f;
    }

    public float getInterpolation(float f) {
        float f2 = 1.0f - f;
        return this.f111777a * (1.0f - (f2 * f2));
    }
}

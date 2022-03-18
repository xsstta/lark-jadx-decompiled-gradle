package com.h6ah4i.android.widget.advrecyclerview.draggable;

import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.draggable.a  reason: invalid class name */
public class animationInterpolatorC23262a implements Interpolator {

    /* renamed from: a */
    private final float f57344a;

    /* renamed from: b */
    private final float f57345b;

    /* renamed from: c */
    private final float f57346c;

    public animationInterpolatorC23262a() {
        this(0.3f);
    }

    public float getInterpolation(float f) {
        if (Math.abs(f - 0.5f) < this.f57345b) {
            return (f - this.f57344a) * this.f57346c;
        }
        if (f < 0.5f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return 1.0f;
    }

    public animationInterpolatorC23262a(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f >= 0.5f) {
            throw new IllegalArgumentException("Invalid threshold range: " + f);
        }
        float f2 = 1.0f - (2.0f * f);
        this.f57344a = f;
        this.f57345b = 0.5f * f2;
        this.f57346c = 1.0f / f2;
    }
}

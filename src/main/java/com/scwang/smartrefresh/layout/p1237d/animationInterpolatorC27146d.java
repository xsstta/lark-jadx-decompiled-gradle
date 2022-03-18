package com.scwang.smartrefresh.layout.p1237d;

import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.scwang.smartrefresh.layout.d.d  reason: invalid class name */
public class animationInterpolatorC27146d implements Interpolator {

    /* renamed from: a */
    private static final float f67466a;

    /* renamed from: b */
    private static final float f67467b;

    static {
        float a = 1.0f / m98689a(1.0f);
        f67466a = a;
        f67467b = 1.0f - (a * m98689a(1.0f));
    }

    public float getInterpolation(float f) {
        float a = f67466a * m98689a(f);
        if (a > BitmapDescriptorFactory.HUE_RED) {
            return a + f67467b;
        }
        return a;
    }

    /* renamed from: a */
    private static float m98689a(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp((double) (-f2))));
        }
        return ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
    }
}

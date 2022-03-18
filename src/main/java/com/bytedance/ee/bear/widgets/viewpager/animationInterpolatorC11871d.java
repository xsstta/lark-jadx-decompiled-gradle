package com.bytedance.ee.bear.widgets.viewpager;

import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.widgets.viewpager.d  reason: invalid class name */
public class animationInterpolatorC11871d implements Interpolator {

    /* renamed from: a */
    private static final float f32131a;

    /* renamed from: b */
    private static final float f32132b;

    static {
        float a = 1.0f / m49319a(1.0f);
        f32131a = a;
        f32132b = 1.0f - (a * m49319a(1.0f));
    }

    public float getInterpolation(float f) {
        float a = f32131a * m49319a(f);
        if (a > BitmapDescriptorFactory.HUE_RED) {
            return a + f32132b;
        }
        return a;
    }

    /* renamed from: a */
    private static float m49319a(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp((double) (-f2))));
        }
        return ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
    }
}

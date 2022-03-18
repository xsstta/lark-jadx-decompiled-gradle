package com.lynx.tasm.behavior.ui.background;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.lynx.tasm.behavior.ui.background.e */
public class C26755e {

    /* renamed from: a */
    private final int f66343a;

    /* renamed from: b */
    private final float f66344b;

    public C26755e(double d) {
        float f = (float) d;
        this.f66344b = f;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f66343a = 0;
        } else {
            this.f66343a = (int) f;
        }
    }

    /* renamed from: a */
    public float mo95185a(float f) {
        float f2 = this.f66344b;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            int i = this.f66343a;
            if (i == -36) {
                return f * 0.5f;
            }
            if (i == -34 || i == -33) {
                return f;
            }
            return BitmapDescriptorFactory.HUE_RED;
        } else if (BitmapDescriptorFactory.HUE_RED >= f2 || f2 > 1.0f) {
            return f2;
        } else {
            return f2 * f;
        }
    }
}

package com.lynx.tasm.behavior.ui.background;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.lynx.tasm.behavior.ui.background.f */
public class C26756f {

    /* renamed from: a */
    private final int f66345a;

    /* renamed from: b */
    private final float f66346b;

    /* renamed from: a */
    public boolean mo95187a() {
        if (this.f66345a == -33) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo95188b() {
        if (this.f66345a == -34) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo95189c() {
        if (this.f66345a == -32) {
            return true;
        }
        return false;
    }

    public C26756f(double d) {
        float f = (float) d;
        this.f66346b = f;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f66345a = 0;
        } else {
            this.f66345a = (int) f;
        }
    }

    /* renamed from: a */
    public float mo95186a(float f, float f2) {
        float f3 = this.f66346b;
        if (BitmapDescriptorFactory.HUE_RED < f3 && f3 <= 1.0f) {
            return f3 * f;
        }
        if (mo95189c()) {
            return f2;
        }
        return this.f66346b;
    }
}

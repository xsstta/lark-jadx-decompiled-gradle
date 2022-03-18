package com.ss.android.videoshop.widget;

import android.graphics.Matrix;

/* renamed from: com.ss.android.videoshop.widget.c */
public class C64194c extends Matrix {

    /* renamed from: a */
    private float[] f162288a;

    /* renamed from: a */
    private boolean m252455a() {
        float[] fArr = this.f162288a;
        if (fArr == null) {
            return false;
        }
        try {
            setValues(fArr);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m252456b() {
        if (this.f162288a == null) {
            this.f162288a = new float[9];
        }
        getValues(this.f162288a);
    }

    /* renamed from: c */
    public boolean mo222584c(float f) {
        m252456b();
        this.f162288a[4] = f;
        return m252455a();
    }

    /* renamed from: d */
    public boolean mo222585d(float f) {
        m252456b();
        this.f162288a[2] = f;
        return m252455a();
    }

    /* renamed from: e */
    public boolean mo222586e(float f) {
        m252456b();
        this.f162288a[5] = f;
        return m252455a();
    }

    /* renamed from: a */
    public boolean mo222582a(float f) {
        if (!mo222583b(f) || !mo222584c(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo222583b(float f) {
        m252456b();
        this.f162288a[0] = f;
        return m252455a();
    }
}

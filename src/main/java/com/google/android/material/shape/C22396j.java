package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.j */
public final class C22396j implements AbstractC22389c {

    /* renamed from: a */
    private final float f54917a;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f54917a)});
    }

    public C22396j(float f) {
        this.f54917a = f;
    }

    @Override // com.google.android.material.shape.AbstractC22389c
    /* renamed from: a */
    public float mo77991a(RectF rectF) {
        return this.f54917a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C22396j) && this.f54917a == ((C22396j) obj).f54917a) {
            return true;
        }
        return false;
    }
}

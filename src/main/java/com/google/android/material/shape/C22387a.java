package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.a */
public final class C22387a implements AbstractC22389c {

    /* renamed from: a */
    private final float f54910a;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f54910a)});
    }

    @Override // com.google.android.material.shape.AbstractC22389c
    /* renamed from: a */
    public float mo77991a(RectF rectF) {
        return this.f54910a;
    }

    public C22387a(float f) {
        this.f54910a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C22387a) && this.f54910a == ((C22387a) obj).f54910a) {
            return true;
        }
        return false;
    }
}

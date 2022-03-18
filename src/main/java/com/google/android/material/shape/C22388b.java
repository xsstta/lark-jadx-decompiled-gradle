package com.google.android.material.shape;

import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.b */
public final class C22388b implements AbstractC22389c {

    /* renamed from: a */
    private final AbstractC22389c f54911a;

    /* renamed from: b */
    private final float f54912b;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54911a, Float.valueOf(this.f54912b)});
    }

    @Override // com.google.android.material.shape.AbstractC22389c
    /* renamed from: a */
    public float mo77991a(RectF rectF) {
        return Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f54911a.mo77991a(rectF) + this.f54912b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22388b)) {
            return false;
        }
        C22388b bVar = (C22388b) obj;
        if (!this.f54911a.equals(bVar.f54911a) || this.f54912b != bVar.f54912b) {
            return false;
        }
        return true;
    }

    public C22388b(float f, AbstractC22389c cVar) {
        while (cVar instanceof C22388b) {
            cVar = ((C22388b) cVar).f54911a;
            f += ((C22388b) cVar).f54912b;
        }
        this.f54911a = cVar;
        this.f54912b = f;
    }
}

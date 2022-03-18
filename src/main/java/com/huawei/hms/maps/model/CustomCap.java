package com.huawei.hms.maps.model;

import com.huawei.hms.common.Preconditions;

public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(BitmapDescriptor bitmapDescriptor2) {
        this(bitmapDescriptor2, 10.0f);
    }

    public CustomCap(BitmapDescriptor bitmapDescriptor2, float f) {
        super((BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor2, "BitmapDescriptor can not be null"), f);
        if (Math.abs(f) >= 1.0E-6f) {
            this.bitmapDescriptor = bitmapDescriptor2;
            this.refWidth = f;
            return;
        }
        throw new IllegalArgumentException("BitmapRefWidth must be positive");
    }

    @Override // com.huawei.hms.maps.model.Cap
    public final String toString() {
        return "CustomCap:bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + "and refWidth=" + this.refWidth;
    }
}

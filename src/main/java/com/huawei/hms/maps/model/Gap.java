package com.huawei.hms.maps.model;

public final class Gap extends PatternItem {
    public static final float MIN_LENGTH = 0.0f;
    public final float length;

    public Gap(float f) {
        super(2, Math.max(f, (float) BitmapDescriptorFactory.HUE_RED));
        this.length = Math.max(f, (float) BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.huawei.hms.maps.model.PatternItem
    public final String toString() {
        return "Type is Gap and the length is" + String.valueOf(this.length);
    }
}

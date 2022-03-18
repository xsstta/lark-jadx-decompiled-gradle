package com.huawei.hms.maps.model;

public final class Dash extends PatternItem {
    public static final float MIN_LENGTH = 0.0f;
    public float length;

    public Dash(float f) {
        super(0, Math.max(f, (float) BitmapDescriptorFactory.HUE_RED));
        this.length = Math.max(f, (float) BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.huawei.hms.maps.model.PatternItem
    public final String toString() {
        return "Type is Dash and the length is" + String.valueOf(this.length);
    }
}

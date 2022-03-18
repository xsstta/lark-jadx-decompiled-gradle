package com.huawei.hms.maps.model;

public final class Dot extends PatternItem {
    public Dot() {
        super(1, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.huawei.hms.maps.model.PatternItem
    public final String toString() {
        return "Type is Dot";
    }
}

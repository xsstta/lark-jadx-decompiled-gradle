package com.google.android.gms.maps.model;

public final class Dash extends PatternItem {

    /* renamed from: a */
    public final float f53563a;

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        float f = this.f53563a;
        StringBuilder sb = new StringBuilder(30);
        sb.append("[Dash: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}

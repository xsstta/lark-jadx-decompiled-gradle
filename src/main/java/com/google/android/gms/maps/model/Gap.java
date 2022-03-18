package com.google.android.gms.maps.model;

public final class Gap extends PatternItem {

    /* renamed from: a */
    public final float f53564a;

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        float f = this.f53564a;
        StringBuilder sb = new StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}

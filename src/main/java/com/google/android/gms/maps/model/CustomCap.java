package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {

    /* renamed from: a */
    public final C22035a f53561a;

    /* renamed from: b */
    public final float f53562b;

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        String valueOf = String.valueOf(this.f53561a);
        float f = this.f53562b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}

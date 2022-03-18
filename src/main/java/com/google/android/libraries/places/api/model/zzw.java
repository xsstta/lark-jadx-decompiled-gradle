package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzw extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public LatLng getNortheast() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public LatLng getSouthwest() {
        return this.zza;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("RectangularBounds{southwest=");
        sb.append(valueOf);
        sb.append(", northeast=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            if (!this.zza.equals(rectangularBounds.getSouthwest()) || !this.zzb.equals(rectangularBounds.getNortheast())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzw(LatLng latLng, LatLng latLng2) {
        Objects.requireNonNull(latLng, "Null southwest");
        this.zza = latLng;
        Objects.requireNonNull(latLng2, "Null northeast");
        this.zzb = latLng2;
    }
}

package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.util.Objects;

final class zzv extends RectangularBounds.zza {
    private LatLng zza;
    private LatLng zzb;

    zzv() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.RectangularBounds.zza
    public final RectangularBounds zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" southwest");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" northeast");
        }
        if (str2.isEmpty()) {
            return new zzax(this.zza, this.zzb);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.RectangularBounds.zza
    public final RectangularBounds.zza zza(LatLng latLng) {
        Objects.requireNonNull(latLng, "Null southwest");
        this.zza = latLng;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.RectangularBounds.zza
    public final RectangularBounds.zza zzb(LatLng latLng) {
        Objects.requireNonNull(latLng, "Null northeast");
        this.zzb = latLng;
        return this;
    }
}

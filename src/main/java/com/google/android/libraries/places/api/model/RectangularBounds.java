package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    public abstract LatLng getNortheast();

    public abstract LatLng getSouthwest();

    /* access modifiers changed from: package-private */
    public static abstract class zza {
        /* access modifiers changed from: package-private */
        public abstract zza zza(LatLng latLng);

        /* access modifiers changed from: package-private */
        public abstract RectangularBounds zza();

        /* access modifiers changed from: package-private */
        public abstract zza zzb(LatLng latLng);

        zza() {
        }
    }

    public static RectangularBounds newInstance(LatLngBounds latLngBounds) {
        return new zzv().zza(latLngBounds.f53579a).zzb(latLngBounds.f53580b).zza();
    }

    public static RectangularBounds newInstance(LatLng latLng, LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }
}

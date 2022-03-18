package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.LatLng;

final class zzy extends zzak {
    private final /* synthetic */ GoogleMap.AbstractC21986n zzag;

    zzy(GoogleMap googleMap, GoogleMap.AbstractC21986n nVar) {
        this.zzag = nVar;
    }

    @Override // com.google.android.gms.maps.internal.zzaj
    public final void onMapClick(LatLng latLng) {
        this.zzag.mo74438a(latLng);
    }
}

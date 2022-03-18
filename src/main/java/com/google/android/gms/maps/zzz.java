package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzao;
import com.google.android.gms.maps.model.LatLng;

final class zzz extends zzao {
    private final /* synthetic */ GoogleMap.AbstractC21988p zzah;

    zzz(GoogleMap googleMap, GoogleMap.AbstractC21988p pVar) {
        this.zzah = pVar;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void onMapLongClick(LatLng latLng) {
        this.zzah.mo74440a(latLng);
    }
}

package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzs;

final class zzv extends zzs {
    private final /* synthetic */ GoogleMap.AbstractC21978f zzad;

    zzv(GoogleMap googleMap, GoogleMap.AbstractC21978f fVar) {
        this.zzad = fVar;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void onCameraMove() {
        this.zzad.mo74429a();
    }
}

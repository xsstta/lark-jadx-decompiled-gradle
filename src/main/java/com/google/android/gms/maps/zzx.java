package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzo;

final class zzx extends zzo {
    private final /* synthetic */ GoogleMap.AbstractC21976d zzaf;

    zzx(GoogleMap googleMap, GoogleMap.AbstractC21976d dVar) {
        this.zzaf = dVar;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void onCameraIdle() {
        this.zzaf.mo74427a();
    }
}

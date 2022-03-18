package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzq;

final class zzw extends zzq {
    private final /* synthetic */ GoogleMap.AbstractC21977e zzae;

    zzw(GoogleMap googleMap, GoogleMap.AbstractC21977e eVar) {
        this.zzae = eVar;
    }

    @Override // com.google.android.gms.maps.internal.zzp
    public final void onCameraMoveCanceled() {
        this.zzae.mo74428a();
    }
}

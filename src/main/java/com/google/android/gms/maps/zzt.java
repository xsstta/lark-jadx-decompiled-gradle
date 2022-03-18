package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.model.CameraPosition;

final class zzt extends zzm {
    private final /* synthetic */ GoogleMap.AbstractC21975c zzab;

    zzt(GoogleMap googleMap, GoogleMap.AbstractC21975c cVar) {
        this.zzab = cVar;
    }

    @Override // com.google.android.gms.maps.internal.zzl
    public final void onCameraChange(CameraPosition cameraPosition) {
        this.zzab.mo74426a(cameraPosition);
    }
}

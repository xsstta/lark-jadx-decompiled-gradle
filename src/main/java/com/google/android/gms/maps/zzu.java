package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

final class zzu extends com.google.android.gms.maps.internal.zzu {
    private final /* synthetic */ GoogleMap.AbstractC21979g zzac;

    zzu(GoogleMap googleMap, GoogleMap.AbstractC21979g gVar) {
        this.zzac = gVar;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void onCameraMoveStarted(int i) {
        this.zzac.mo74430a(i);
    }
}

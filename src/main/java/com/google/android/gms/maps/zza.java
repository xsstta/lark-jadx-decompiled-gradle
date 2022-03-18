package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.C22043e;

final class zza extends zzaa {
    private final /* synthetic */ GoogleMap.AbstractC21982j zzi;

    zza(GoogleMap googleMap, GoogleMap.AbstractC21982j jVar) {
        this.zzi = jVar;
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void onIndoorBuildingFocused() {
        this.zzi.mo74433a();
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zza(zzn zzn) {
        this.zzi.mo74434a(new C22043e(zzn));
    }
}

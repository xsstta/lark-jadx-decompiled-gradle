package com.google.android.gms.maps;

import com.google.android.gms.maps.C22013g;
import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

final class zzad extends zzbk {
    private final /* synthetic */ C22013g.AbstractC22015b zzbp;

    zzad(C22013g gVar, C22013g.AbstractC22015b bVar) {
        this.zzbp = bVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zzbp.mo74530a(streetViewPanoramaLocation);
    }
}

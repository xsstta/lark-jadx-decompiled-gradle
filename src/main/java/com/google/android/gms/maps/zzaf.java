package com.google.android.gms.maps;

import com.google.android.gms.maps.C22013g;
import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

final class zzaf extends zzbm {
    private final /* synthetic */ C22013g.AbstractC22016c zzbr;

    zzaf(C22013g gVar, C22013g.AbstractC22016c cVar) {
        this.zzbr = cVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbr.mo74531a(streetViewPanoramaOrientation);
    }
}

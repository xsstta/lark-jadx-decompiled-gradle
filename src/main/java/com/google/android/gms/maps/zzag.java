package com.google.android.gms.maps;

import com.google.android.gms.maps.C22013g;
import com.google.android.gms.maps.internal.zzbo;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

final class zzag extends zzbo {
    private final /* synthetic */ C22013g.AbstractC22017d zzbs;

    zzag(C22013g gVar, C22013g.AbstractC22017d dVar) {
        this.zzbs = dVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbs.mo74532a(streetViewPanoramaOrientation);
    }
}

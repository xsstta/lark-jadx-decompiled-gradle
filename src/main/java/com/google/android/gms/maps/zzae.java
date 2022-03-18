package com.google.android.gms.maps;

import com.google.android.gms.maps.C22013g;
import com.google.android.gms.maps.internal.zzbi;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

final class zzae extends zzbi {
    private final /* synthetic */ C22013g.AbstractC22014a zzbq;

    zzae(C22013g gVar, C22013g.AbstractC22014a aVar) {
        this.zzbq = aVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public final void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zzbq.mo74529a(streetViewPanoramaCamera);
    }
}

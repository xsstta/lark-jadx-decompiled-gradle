package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzaj extends zzbq {
    private final /* synthetic */ AbstractC22012f zzbv;

    zzaj(StreetViewPanoramaView.C22004a aVar, AbstractC22012f fVar) {
        this.zzbv = fVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.zzbv.mo74528a(new C22013g(iStreetViewPanoramaDelegate));
    }
}

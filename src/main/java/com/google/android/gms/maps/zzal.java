package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.C22021i;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzal extends zzbq {
    private final /* synthetic */ AbstractC22012f zzbv;

    zzal(C22021i.C22022a aVar, AbstractC22012f fVar) {
        this.zzbv = fVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.zzbv.mo74528a(new C22013g(iStreetViewPanoramaDelegate));
    }
}

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzam;

final class zzk extends zzam {
    private final /* synthetic */ GoogleMap.AbstractC21987o zzs;

    zzk(GoogleMap googleMap, GoogleMap.AbstractC21987o oVar) {
        this.zzs = oVar;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void onMapLoaded() throws RemoteException {
        this.zzs.mo74439a();
    }
}

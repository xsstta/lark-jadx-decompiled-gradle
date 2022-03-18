package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaw;

final class zzi extends zzaw {
    private final /* synthetic */ GoogleMap.AbstractC21991s zzq;

    zzi(GoogleMap googleMap, GoogleMap.AbstractC21991s sVar) {
        this.zzq = sVar;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean onMyLocationButtonClick() throws RemoteException {
        return this.zzq.mo74445a();
    }
}

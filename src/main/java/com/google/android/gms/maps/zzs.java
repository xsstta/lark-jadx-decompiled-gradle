package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbc;
import com.google.android.gms.maps.model.PointOfInterest;

final class zzs extends zzbc {
    private final /* synthetic */ GoogleMap.AbstractC21994v zzaa;

    zzs(GoogleMap googleMap, GoogleMap.AbstractC21994v vVar) {
        this.zzaa = vVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zza(PointOfInterest pointOfInterest) throws RemoteException {
        this.zzaa.mo74448a(pointOfInterest);
    }
}

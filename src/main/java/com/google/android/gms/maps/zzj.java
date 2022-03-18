package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzba;

final class zzj extends zzba {
    private final /* synthetic */ GoogleMap.AbstractC21993u zzr;

    zzj(GoogleMap googleMap, GoogleMap.AbstractC21993u uVar) {
        this.zzr = uVar;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final void onMyLocationClick(Location location) throws RemoteException {
        this.zzr.mo74447a(location);
    }
}

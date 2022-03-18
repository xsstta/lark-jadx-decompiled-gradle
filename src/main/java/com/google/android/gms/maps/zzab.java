package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzab extends zzaq {
    private final /* synthetic */ AbstractC22011e zzbc;

    zzab(MapFragment.C21998a aVar, AbstractC22011e eVar) {
        this.zzbc = eVar;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.zzbc.mo74527a(new GoogleMap(iGoogleMapDelegate));
    }
}

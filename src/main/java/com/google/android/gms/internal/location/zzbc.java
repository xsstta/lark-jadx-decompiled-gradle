package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* access modifiers changed from: package-private */
public final class zzbc extends zzar {
    private C21655b.AbstractC21657b<LocationSettingsResult> zzdf;

    public zzbc(C21655b.AbstractC21657b<LocationSettingsResult> bVar) {
        Preconditions.checkArgument(bVar != null, "listener can't be null.");
        this.zzdf = bVar;
    }

    @Override // com.google.android.gms.internal.location.zzaq
    public final void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.zzdf.mo73385a(locationSettingsResult);
        this.zzdf = null;
    }
}

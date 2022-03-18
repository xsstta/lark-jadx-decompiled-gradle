package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzk;

/* renamed from: com.google.android.gms.maps.model.d */
public final class C22042d {

    /* renamed from: a */
    private final zzk f53661a;

    public C22042d(zzk zzk) {
        this.f53661a = (zzk) Preconditions.checkNotNull(zzk);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22042d)) {
            return false;
        }
        try {
            return this.f53661a.zzb(((C22042d) obj).f53661a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53661a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

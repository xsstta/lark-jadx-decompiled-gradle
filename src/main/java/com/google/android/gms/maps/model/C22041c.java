package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzh;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C22041c {

    /* renamed from: a */
    private final zzh f53660a;

    public C22041c(zzh zzh) {
        this.f53660a = (zzh) Preconditions.checkNotNull(zzh);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22041c)) {
            return false;
        }
        try {
            return this.f53660a.zzb(((C22041c) obj).f53660a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53660a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

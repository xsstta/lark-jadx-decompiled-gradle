package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzz;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C22047h {

    /* renamed from: a */
    private final zzz f53667a;

    public C22047h(zzz zzz) {
        this.f53667a = (zzz) Preconditions.checkNotNull(zzz);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22047h)) {
            return false;
        }
        try {
            return this.f53667a.zzb(((C22047h) obj).f53667a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53667a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

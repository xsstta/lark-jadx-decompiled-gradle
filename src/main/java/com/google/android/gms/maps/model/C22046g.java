package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzw;

/* renamed from: com.google.android.gms.maps.model.g */
public final class C22046g {

    /* renamed from: a */
    private final zzw f53666a;

    public C22046g(zzw zzw) {
        this.f53666a = (zzw) Preconditions.checkNotNull(zzw);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22046g)) {
            return false;
        }
        try {
            return this.f53666a.zzb(((C22046g) obj).f53666a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53666a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

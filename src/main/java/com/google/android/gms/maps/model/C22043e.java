package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzn;

/* renamed from: com.google.android.gms.maps.model.e */
public final class C22043e {

    /* renamed from: a */
    private final zzn f53662a;

    /* renamed from: b */
    private final C22044a f53663b;

    /* renamed from: com.google.android.gms.maps.model.e$a */
    static class C22044a {

        /* renamed from: a */
        public static final C22044a f53664a = new C22044a();

        private C22044a() {
        }
    }

    public C22043e(zzn zzn) {
        this(zzn, C22044a.f53664a);
    }

    private C22043e(zzn zzn, C22044a aVar) {
        this.f53662a = (zzn) Preconditions.checkNotNull(zzn, "delegate");
        this.f53663b = (C22044a) Preconditions.checkNotNull(aVar, "shim");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22043e)) {
            return false;
        }
        try {
            return this.f53662a.zzb(((C22043e) obj).f53662a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53662a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

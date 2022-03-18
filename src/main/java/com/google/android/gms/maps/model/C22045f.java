package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzt;

/* renamed from: com.google.android.gms.maps.model.f */
public final class C22045f {

    /* renamed from: a */
    private final zzt f53665a;

    public C22045f(zzt zzt) {
        this.f53665a = (zzt) Preconditions.checkNotNull(zzt);
    }

    /* renamed from: a */
    public final void mo74917a() {
        try {
            this.f53665a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo74918a(boolean z) {
        try {
            this.f53665a.setVisible(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final boolean mo74919b() {
        try {
            return this.f53665a.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22045f)) {
            return false;
        }
        try {
            return this.f53665a.zzj(((C22045f) obj).f53665a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f53665a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

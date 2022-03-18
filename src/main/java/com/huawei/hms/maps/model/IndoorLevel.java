package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.maps.mce;

public final class IndoorLevel {

    /* renamed from: a */
    private mce f58746a;

    public IndoorLevel(mce mce) {
        this.f58746a = mce;
    }

    public final void activate() {
        try {
            this.f58746a.mo84175a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.f58746a.mo84176a(((IndoorLevel) obj).f58746a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getName() {
        try {
            return this.f58746a.mo84177b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getShortName() {
        try {
            return this.f58746a.mo84178c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f58746a.mo84179d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.maps.mci;

public final class TileOverlay {

    /* renamed from: a */
    private final mci f58799a;

    public TileOverlay(mci mci) {
        this.f58799a = mci;
    }

    public final void clearTileCache() {
        try {
            this.f58799a.mo84253a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.f58799a.mo84256a(((TileOverlay) obj).f58799a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean getFadeIn() {
        try {
            return this.f58799a.mo84259b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            return this.f58799a.mo84260c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getTransparency() {
        try {
            return this.f58799a.mo84261d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.f58799a.mo84262e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f58799a.mo84265h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58799a.mo84263f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.f58799a.mo84264g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setFadeIn(boolean z) {
        try {
            this.f58799a.mo84255a(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTransparency(float f) {
        try {
            this.f58799a.mo84254a(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58799a.mo84258b(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58799a.mo84257b(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

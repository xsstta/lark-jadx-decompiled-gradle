package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcc;
import com.huawei.hms.maps.mcq;

public final class GroundOverlay {

    /* renamed from: a */
    private final mcc f58732a;

    public GroundOverlay(mcc mcc) {
        this.f58732a = mcc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f58732a.mo84149a(((GroundOverlay) obj).f58732a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getBearing() {
        try {
            return this.f58732a.mo84142a();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getBearing RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final LatLngBounds getBounds() {
        try {
            return this.f58732a.mo84150b();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getBounds RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getHeight() {
        try {
            return this.f58732a.mo84154c();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getHeight RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final String getId() {
        try {
            return this.f58732a.mo84156d();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public final LatLng getPosition() {
        try {
            return this.f58732a.mo84158e();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getPosition RemoteException: " + e.toString());
            return null;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f58732a.mo84159f());
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getTag RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getTransparency() {
        try {
            return this.f58732a.mo84160g();
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "getTransparency RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final float getWidth() {
        try {
            return this.f58732a.mo84161h();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "getWidth RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final float getZIndex() {
        try {
            return this.f58732a.mo84162i();
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.f58732a.mo84163j();
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "hashCode RemoteException: " + e.toString());
            return 0;
        }
    }

    public final boolean isClickable() {
        try {
            return this.f58732a.mo84164k();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "isClickable RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58732a.mo84165l();
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            mcc mcc = this.f58732a;
            if (mcc != null) {
                mcc.mo84166m();
            }
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "remove RemoteException: " + e.toString());
        }
    }

    public final void setBearing(float f) {
        try {
            this.f58732a.mo84143a(f);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setBearing RemoteException: " + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.f58732a.mo84148a(z);
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "setClickable RemoteException: " + e.toString());
        }
    }

    public final void setDimensions(float f) {
        try {
            this.f58732a.mo84157d(f);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setDimensions RemoteException: " + e.toString());
        }
    }

    public final void setDimensions(float f, float f2) {
        try {
            this.f58732a.mo84144a(f, f2);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setDimensions RemoteException: " + e.toString());
        }
    }

    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "you should check image , it can not be null.");
        try {
            this.f58732a.mo84152b(bitmapDescriptor.getObject());
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setImage RemoteException: " + e.toString());
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            this.f58732a.mo84146a(latLng);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setPosition RemoteException: " + e.toString());
        }
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.f58732a.mo84147a(latLngBounds);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setPositionFromBounds RemoteException: " + e.toString());
        }
    }

    public final void setTag(Object obj) {
        try {
            this.f58732a.mo84145a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setTag RemoteException: " + e.toString());
        }
    }

    public final void setTransparency(float f) {
        try {
            this.f58732a.mo84151b(f);
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "setTransparency RemoteException: " + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58732a.mo84153b(z);
        } catch (RemoteException e) {
            mcq.m86886b("GroundOverlay", "setVisible RemoteException: " + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58732a.mo84155c(f);
        } catch (RemoteException e) {
            mcq.m86889e("GroundOverlay", "setZIndex RemoteException: " + e.toString());
        }
    }
}

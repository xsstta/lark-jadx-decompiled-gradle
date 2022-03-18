package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mch;
import com.huawei.hms.maps.mcq;
import java.util.List;

public final class Polyline {

    /* renamed from: a */
    private mch f58785a;

    public Polyline(mch mch) {
        this.f58785a = mch;
    }

    public final boolean equals(Object obj) {
        try {
            if (obj instanceof Polyline) {
                return this.f58785a.mo84238a(((Polyline) obj).f58785a);
            }
            return false;
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "equals RemoteException: " + e.toString());
            return false;
        }
    }

    public final int getColor() {
        try {
            return this.f58785a.mo84244h();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "getId RemoteException: " + e.toString());
            return 0;
        }
    }

    public final Cap getEndCap() {
        try {
            return this.f58785a.mo84245i();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "getEndCap RemoteException: " + e.toString());
            return null;
        }
    }

    public final String getId() {
        try {
            return this.f58785a.mo84114a();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public final int getJointType() {
        try {
            return this.f58785a.mo84246j();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "getJointType RemoteException: " + e.toString());
            return -1;
        }
    }

    public final List<PatternItem> getPattern() {
        try {
            return this.f58785a.mo84247k();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "getPattern RemoteException: " + e.toString());
            return null;
        }
    }

    public final List<LatLng> getPoints() {
        try {
            return this.f58785a.mo84248l();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "getPoints RemoteException: " + e.toString());
            return null;
        }
    }

    public final Cap getStartCap() {
        try {
            return this.f58785a.mo84249m();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "getStartCap RemoteException: " + e.toString());
            return null;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f58785a.mo84118b());
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "getTag RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getWidth() {
        try {
            return this.f58785a.mo84250n();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "getId RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final float getZIndex() {
        try {
            return this.f58785a.mo84120c();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.f58785a.mo84121d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.f58785a.mo84122e();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "isClickable RemoteException: " + e.toString());
            return true;
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.f58785a.mo84251o();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "isGeodesic RemoteException: " + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58785a.mo84123f();
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.f58785a.mo84124g();
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "remove RemoteException: " + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.f58785a.mo84117a(z);
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "setClickable RemoteException: " + e.toString());
        }
    }

    public final void setColor(int i) {
        try {
            this.f58785a.mo84235a(i);
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "setColor RemoteException: " + e.toString());
        }
    }

    public final void setEndCap(Cap cap) {
        try {
            this.f58785a.mo84236a(cap);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setEndCap RemoteException: " + e.toString());
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.f58785a.mo84243c(z);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setGeodesic RemoteException: " + e.toString());
        }
    }

    public final void setJointType(int i) {
        try {
            this.f58785a.mo84240b(i);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setJointType RemoteException: " + e.toString());
        }
    }

    public final void setPattern(List<PatternItem> list) {
        try {
            this.f58785a.mo84237a(list);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setPattern RemoteException: " + e.toString());
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            this.f58785a.mo84242b(list);
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "setPoints RemoteException: " + e.toString());
        }
    }

    public final void setStartCap(Cap cap) {
        try {
            this.f58785a.mo84241b(cap);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setStartCap RemoteException: " + e.toString());
        }
    }

    public final void setTag(Object obj) {
        Preconditions.checkNotNull(obj, "you should check tag,it can not be null.");
        try {
            this.f58785a.mo84116a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mcq.m86886b("Polyline", "setTag RemoteException: " + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58785a.mo84119b(z);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setVisible RemoteException: " + e.toString());
        }
    }

    public final void setWidth(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            try {
                this.f58785a.mo84239b(f);
            } catch (RemoteException e) {
                mcq.m86886b("Polyline", "setWidth RemoteException: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("Polyline width value is illegal ,this value must be non-negative");
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58785a.mo84115a(f);
        } catch (RemoteException e) {
            mcq.m86889e("Polyline", "setZIndex RemoteException: " + e.toString());
        }
    }
}

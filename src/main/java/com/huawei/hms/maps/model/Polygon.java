package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcg;
import com.huawei.hms.maps.mcq;
import java.util.List;

public final class Polygon {

    /* renamed from: a */
    private mcg f58773a;

    public Polygon(mcg mcg) {
        mcq.m86886b("Polygon", "Polygon: ");
        this.f58773a = mcg;
    }

    public final boolean equals(Object obj) {
        try {
            if (obj instanceof Polygon) {
                return this.f58773a.mo84219a(((Polygon) obj).f58773a);
            }
            return false;
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "equals RemoteException: " + e.toString());
            return false;
        }
    }

    public final int getFillColor() {
        try {
            return this.f58773a.mo84226h();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getFillColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public final List<List<LatLng>> getHoles() {
        try {
            return this.f58773a.mo84227i();
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "getHoles RemoteException: " + e.toString());
            return null;
        }
    }

    public final String getId() {
        try {
            return this.f58773a.mo84114a();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public final List<LatLng> getPoints() {
        try {
            return this.f58773a.mo84228j();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getPoints RemoteException: " + e.toString());
            return null;
        }
    }

    public final int getStrokeColor() {
        try {
            return this.f58773a.mo84229k();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getStrokeColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public final int getStrokeJointType() {
        try {
            return this.f58773a.mo84230l();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getStrokeJointType RemoteException: " + e.toString());
            return 0;
        }
    }

    public final List<PatternItem> getStrokePattern() {
        try {
            return this.f58773a.mo84231m();
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "getStrokePattern RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.f58773a.mo84232n();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getStrokeWidth RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f58773a.mo84118b());
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "getTag RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getZIndex() {
        try {
            return this.f58773a.mo84120c();
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.f58773a.mo84121d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.f58773a.mo84122e();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "isClickable RemoteException: " + e.toString());
            return true;
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.f58773a.mo84233o();
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "isGeodesic RemoteException: " + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58773a.mo84123f();
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.f58773a.mo84124g();
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "remove RemoteException: " + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.f58773a.mo84117a(z);
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setClickable RemoteException: " + e.toString());
        }
    }

    public final void setFillColor(int i) {
        try {
            this.f58773a.mo84217a(i);
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setFillColor RemoteException: " + e.toString());
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.f58773a.mo84225c(z);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setGeodesic RemoteException: " + e.toString());
        }
    }

    public final void setHoles(List<? extends List<LatLng>> list) {
        try {
            this.f58773a.mo84218a(list);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setHoles RemoteException: " + e.toString());
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            this.f58773a.mo84222b(list);
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setPoints RemoteException: " + e.toString());
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.f58773a.mo84221b(i);
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setStrokeColor RemoteException: " + e.toString());
        }
    }

    public final void setStrokeJointType(int i) {
        try {
            this.f58773a.mo84223c(i);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setStrokeJointType RemoteException: " + e.toString());
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        try {
            this.f58773a.mo84224c(list);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setStrokePattern RemoteException: " + e.toString());
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            this.f58773a.mo84220b(f);
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setStrokeWidth RemoteException: " + e.toString());
        }
    }

    public final void setTag(Object obj) {
        try {
            this.f58773a.mo84116a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mcq.m86886b("Polygon", "setTag RemoteException: " + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58773a.mo84119b(z);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setVisible RemoteException: " + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58773a.mo84115a(f);
        } catch (RemoteException e) {
            mcq.m86889e("Polygon", "setZIndex RemoteException: " + e.toString());
        }
    }
}

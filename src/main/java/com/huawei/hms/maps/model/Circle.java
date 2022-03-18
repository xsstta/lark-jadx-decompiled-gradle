package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcb;
import com.huawei.hms.maps.mcq;
import java.util.List;
import java.util.Objects;

public final class Circle {

    /* renamed from: a */
    private mcb f58722a;

    public Circle(mcb mcb) {
        this.f58722a = mcb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.f58722a.mo84132a(((Circle) obj).f58722a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng getCenter() {
        try {
            return this.f58722a.mo84135h();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getCenter RemoteException: " + e.toString());
            return null;
        }
    }

    public final int getFillColor() {
        try {
            return this.f58722a.mo84136i();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getFillColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public final String getId() {
        try {
            return this.f58722a.mo84114a();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public final double getRadius() {
        try {
            return this.f58722a.mo84137j();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getRadius RemoteException: " + e.toString());
            return 0.0d;
        }
    }

    public final int getStrokeColor() {
        try {
            return this.f58722a.mo84138k();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getStrokeColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public final List<PatternItem> getStrokePattern() {
        try {
            return this.f58722a.mo84139l();
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "getStrokePattern RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.f58722a.mo84140m();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "getStrokeWidth RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f58722a.mo84118b());
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "RemoteException: " + e.toString());
            return null;
        }
    }

    public final float getZIndex() {
        try {
            return this.f58722a.mo84120c();
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.f58722a.mo84121d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.f58722a.mo84122e();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "RemoteException: " + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58722a.mo84123f();
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.f58722a.mo84124g();
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "remove RemoteException: " + e.toString());
        }
    }

    public final void setCenter(LatLng latLng) {
        Objects.requireNonNull(latLng, "Circle center cannot be null");
        try {
            this.f58722a.mo84130a(latLng);
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "setCenter RemoteException: " + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.f58722a.mo84117a(z);
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "setClickable RemoteException: " + e.toString());
        }
    }

    public final void setFillColor(int i) {
        try {
            this.f58722a.mo84129a(i);
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "setFillColor RemoteException: " + e.toString());
        }
    }

    public final void setRadius(double d) {
        try {
            this.f58722a.mo84128a(d);
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "setRadius RemoteException: " + e.toString());
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.f58722a.mo84134b(i);
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "setStrokeColor RemoteException: " + e.toString());
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        try {
            this.f58722a.mo84131a(list);
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "setStrokePattern RemoteException: " + e.toString());
        }
    }

    public final void setStrokeWidth(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            try {
                this.f58722a.mo84133b(f);
            } catch (RemoteException e) {
                mcq.m86886b("Circle", "setStrokeWidth RemoteException: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("Circle strokeWidth value is illegal ,this value must be non-negative");
        }
    }

    public final <T> void setTag(T t) {
        try {
            this.f58722a.mo84116a(ObjectWrapper.wrap(t));
        } catch (RemoteException e) {
            mcq.m86886b("Circle", "RemoteException: " + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58722a.mo84119b(z);
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "setVisible RemoteException: " + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58722a.mo84115a(f);
        } catch (RemoteException e) {
            mcq.m86889e("Circle", "setZIndex RemoteException: " + e.toString());
        }
    }
}

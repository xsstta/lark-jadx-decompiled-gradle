package com.huawei.hms.maps;

import android.os.RemoteException;

public final class UiSettings {

    /* renamed from: a */
    private final mbt f58632a;

    public UiSettings(mbt mbt) {
        mcq.m86886b("UISettings", "UISettings: ");
        this.f58632a = mbt;
    }

    public final boolean isCompassEnabled() {
        try {
            return this.f58632a.mo84088a();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isCompassEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isIndoorLevelPickerEnabled() {
        try {
            return this.f58632a.mo84090b();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isIndoorLevelPickerEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isMapToolbarEnabled() {
        try {
            return this.f58632a.mo84092c();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isMapToolbarEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.f58632a.mo84094d();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isMyLocationButtonEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isRotateGesturesEnabled() {
        try {
            return this.f58632a.mo84096e();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isRotateGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.f58632a.mo84098f();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isScrollGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.f58632a.mo84100g();
        } catch (RemoteException e) {
            mcq.m86889e("UISettings", "isScrollGesturesEnabledDuringRotateOrZoom RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isTiltGesturesEnabled() {
        try {
            return this.f58632a.mo84102h();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isTiltGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.f58632a.mo84104i();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isZoomControlsEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.f58632a.mo84106j();
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "isZoomGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.f58632a.mo84107k(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setAllGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.f58632a.mo84087a(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setCompassEnabled RemoteException: " + e.toString());
        }
    }

    public final void setGestureScaleByMapCenter(boolean z) {
        try {
            this.f58632a.mo84108l(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setGestureScaleByMapCenter RemoteException: " + e.toString());
        }
    }

    public final void setIndoorLevelPickerEnabled(boolean z) {
        try {
            this.f58632a.mo84089b(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setIndoorLevelPickerEnabled RemoteException: " + e.toString());
        }
    }

    public final void setMapToolbarEnabled(boolean z) {
        try {
            this.f58632a.mo84091c(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setMyLocationButtonEnabled RemoteException: " + e.toString());
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.f58632a.mo84093d(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setMyLocationButtonEnabled RemoteException: " + e.toString());
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        try {
            this.f58632a.mo84095e(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setRotateGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.f58632a.mo84097f(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setScrollGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        try {
            this.f58632a.mo84099g(z);
        } catch (RemoteException e) {
            mcq.m86889e("UISettings", "setScrollGesturesEnabledDuringRotateOrZoom RemoteException: " + e.toString());
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        try {
            this.f58632a.mo84101h(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setTiltGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.f58632a.mo84103i(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setZoomControlsEnabled RemoteException: " + e.toString());
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.f58632a.mo84105j(z);
        } catch (RemoteException e) {
            mcq.m86886b("UISettings", "setZoomGesturesEnabled RemoteException: " + e.toString());
        }
    }
}

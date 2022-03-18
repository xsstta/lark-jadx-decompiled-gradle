package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mbk;
import com.huawei.hms.maps.mbl;
import com.huawei.hms.maps.mbm;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewPanoramaLocation;
import com.huawei.hms.maps.model.StreetViewPanoramaOrientation;
import com.huawei.hms.maps.model.StreetViewSource;

public class StreetViewPanorama {

    /* renamed from: a */
    private mbq f58558a;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    StreetViewPanorama(mbq mbq) {
        this.f58558a = mbq;
    }

    public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
    }

    public StreetViewPanoramaLocation getLocation() {
        mcq.m86886b("StreetViewPanorama", "getLocation in StreetViewPanorama start");
        try {
            return this.f58558a.mo84062h();
        } catch (RemoteException unused) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: ");
            return null;
        }
    }

    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.f58558a.mo84055a();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return null;
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.f58558a.mo84056b();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.f58558a.mo84057c();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.f58558a.mo84058d();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.f58558a.mo84059e();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return false;
        }
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            return (Point) ObjectWrapper.unwrap(this.f58558a.mo84060f());
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return null;
        }
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point) {
        try {
            mbq mbq = this.f58558a;
            ObjectWrapper.wrap(point);
            return mbq.mo84061g();
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
            return null;
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(final OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        mcq.m86887c("StreetViewPanorama", "setOnStreetViewPanoramaCameraChangeListener: ");
        try {
            new mbk.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.BinderC236901 */

                public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                    onStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
                }
            };
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
    }

    public final void setOnStreetViewPanoramaClickListener(final OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        try {
            new mbl.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.BinderC236912 */

                public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                    onStreetViewPanoramaClickListener.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
                }
            };
        } catch (RemoteException e) {
            mcq.m86886b("StreetViewPanorama", "RemoteException: " + e.toString());
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(final OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        try {
            new mbm.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.BinderC236923 */

                public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                    onStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
                }
            };
        } catch (RemoteException e) {
            mcq.m86889e("StreetViewPanorama", "RemoteException: " + e.toString());
        }
    }

    public void setPanningGesturesEnabled(boolean z) {
    }

    public void setPosition(LatLng latLng) {
    }

    public void setPosition(LatLng latLng, int i) {
    }

    public void setPosition(LatLng latLng, int i, StreetViewSource streetViewSource) {
    }

    public void setPosition(LatLng latLng, StreetViewSource streetViewSource) {
    }

    public void setPosition(String str) {
    }

    public void setStreetNamesEnabled(boolean z) {
    }

    public void setUserNavigationEnabled(boolean z) {
    }

    public void setZoomGesturesEnabled(boolean z) {
    }
}

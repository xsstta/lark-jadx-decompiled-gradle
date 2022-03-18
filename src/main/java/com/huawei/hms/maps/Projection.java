package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.VisibleRegion;

public final class Projection {

    /* renamed from: a */
    private final mbo f58557a;

    public Projection(mbo mbo) {
        this.f58557a = mbo;
    }

    public final LatLng fromScreenLocation(Point point) {
        try {
            return this.f58557a.mo84050a(point);
        } catch (RemoteException e) {
            mcq.m86889e("Projection", "fromScreenLocation: " + e.getMessage());
            return null;
        }
    }

    public final VisibleRegion getVisibleRegion() {
        try {
            return this.f58557a.mo84051a();
        } catch (RemoteException e) {
            mcq.m86889e("Projection", "getVisibleRegion: " + e.getMessage());
            return null;
        }
    }

    public final Point toScreenLocation(LatLng latLng) {
        try {
            return this.f58557a.mo84049a(latLng);
        } catch (RemoteException e) {
            mcq.m86889e("Projection", "toScreenLocation: " + e.getMessage());
            return null;
        }
    }
}

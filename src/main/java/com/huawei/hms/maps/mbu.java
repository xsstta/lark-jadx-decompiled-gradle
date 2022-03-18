package com.huawei.hms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.huawei.hms.maps.LocationSource;
import com.huawei.hms.maps.mak;

public final class mbu extends mak.maa {

    /* renamed from: a */
    private LocationSource f58650a;

    public static class maa implements LocationSource.OnLocationChangedListener {

        /* renamed from: a */
        may f58651a;

        public maa(may may) {
            this.f58651a = may;
        }

        @Override // com.huawei.hms.maps.LocationSource.OnLocationChangedListener
        public final void onLocationChanged(Location location) {
            try {
                this.f58651a.mo84021a(location);
            } catch (RemoteException unused) {
                mcq.m86889e("LocationSourceDelegate", "onLocationChanged RemoteException ");
            }
        }
    }

    public mbu(LocationSource locationSource) {
        this.f58650a = locationSource;
    }

    @Override // com.huawei.hms.maps.mak
    /* renamed from: a */
    public final void mo83969a() {
        mcq.m86886b("LocationSourceDelegate", "deactivate");
        this.f58650a.deactivate();
    }

    @Override // com.huawei.hms.maps.mak
    /* renamed from: a */
    public final void mo83970a(may may) {
        mcq.m86886b("LocationSourceDelegate", "active");
        this.f58650a.activate(new maa(may));
    }
}

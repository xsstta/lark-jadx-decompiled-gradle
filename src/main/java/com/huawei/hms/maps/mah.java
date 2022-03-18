package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.model.LatLng;

public interface mah extends IInterface {

    public static abstract class maa extends Binder implements mah {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mah$maa$maa  reason: collision with other inner class name */
        public static class C70262maa implements mah {

            /* renamed from: a */
            private IBinder f58640a;

            C70262maa(IBinder iBinder) {
                this.f58640a = iBinder;
            }

            @Override // com.huawei.hms.maps.mah
            /* renamed from: a */
            public final double mo83898a(LatLng latLng, LatLng latLng2) {
                return mbz.m86540a(this.f58640a, "com.huawei.hms.maps.internal.IDistanceCalculatorDelegate", 1, 2, latLng, latLng2).doubleValue();
            }

            public final IBinder asBinder() {
                return this.f58640a;
            }
        }

        /* renamed from: a */
        public static mah m86214a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IDistanceCalculatorDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mah)) ? new C70262maa(iBinder) : (mah) queryLocalInterface;
        }
    }

    /* renamed from: a */
    double mo83898a(LatLng latLng, LatLng latLng2);
}

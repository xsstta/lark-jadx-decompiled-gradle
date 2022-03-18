package com.huawei.hms.maps;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface may extends IInterface {

    public static abstract class maa extends Binder implements may {

        /* renamed from: com.huawei.hms.maps.may$maa$maa  reason: collision with other inner class name */
        static class C70267maa implements may {

            /* renamed from: a */
            private IBinder f58645a;

            C70267maa(IBinder iBinder) {
                this.f58645a = iBinder;
            }

            @Override // com.huawei.hms.maps.may
            /* renamed from: a */
            public final void mo84021a(Location location) {
                mbz.m86543a(this.f58645a, "com.huawei.hms.maps.internal.IOnLocationChangeListener", 1, location);
            }

            public final IBinder asBinder() {
                return this.f58645a;
            }
        }
    }

    /* renamed from: a */
    void mo84021a(Location location);
}

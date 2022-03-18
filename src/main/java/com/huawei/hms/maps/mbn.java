package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mbn extends IInterface {

    public static abstract class maa extends Binder implements mbn {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

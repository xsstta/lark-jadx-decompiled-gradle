package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mbk extends IInterface {

    public static abstract class maa extends Binder implements mbk {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

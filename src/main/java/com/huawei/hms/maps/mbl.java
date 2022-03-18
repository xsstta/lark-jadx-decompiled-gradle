package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mbl extends IInterface {

    public static abstract class maa extends Binder implements mbl {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnStreetViewPanoramaClickListener");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

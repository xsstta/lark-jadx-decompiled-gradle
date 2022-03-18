package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface mbm extends IInterface {

    public static abstract class maa extends Binder implements mbm {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnStreetViewPanoramaLongClickListener");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

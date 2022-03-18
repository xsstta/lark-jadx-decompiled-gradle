package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.huawei.hms.maps.map */
public interface AbstractC23699map extends IInterface {

    /* renamed from: com.huawei.hms.maps.map$maa */
    public static abstract class maa extends Binder implements AbstractC23699map {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnCameraMoveCanceledListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnCameraMoveCanceledListener");
                onCameraMoveCanceled();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnCameraMoveCanceledListener");
                return true;
            }
        }
    }

    void onCameraMoveCanceled();
}

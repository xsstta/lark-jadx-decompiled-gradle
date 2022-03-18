package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface maq extends IInterface {

    public static abstract class maa extends Binder implements maq {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnCameraMoveListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnCameraMoveListener");
                onCameraMove();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnCameraMoveListener");
                return true;
            }
        }
    }

    void onCameraMove();
}

package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface mbf extends IInterface {

    public static abstract class maa extends Binder implements mbf {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnMyLocationButtonClickListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMyLocationButtonClickListener");
                boolean onMyLocationButtonClick = onMyLocationButtonClick();
                parcel2.writeNoException();
                parcel2.writeInt(onMyLocationButtonClick ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnMyLocationButtonClickListener");
                return true;
            }
        }
    }

    boolean onMyLocationButtonClick();
}

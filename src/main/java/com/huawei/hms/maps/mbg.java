package com.huawei.hms.maps;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface mbg extends IInterface {

    public static abstract class maa extends Binder implements mbg {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnMyLocationClickListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMyLocationClickListener");
                onMyLocationClick(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnMyLocationClickListener");
                return true;
            }
        }
    }

    void onMyLocationClick(Location location);
}

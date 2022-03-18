package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mcd;

public interface mau extends IInterface {

    public static abstract class maa extends Binder implements mau {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnIndoorStateChangeListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnIndoorStateChangeListener");
                onIndoorBuildingFocused();
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnIndoorStateChangeListener");
                onIndoorLevelActivated(mcd.maa.m86661a(parcel.readStrongBinder()));
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnIndoorStateChangeListener");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(mcd mcd);
}

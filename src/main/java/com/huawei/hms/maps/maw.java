package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mcf;

public interface maw extends IInterface {

    public static abstract class maa extends Binder implements maw {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnInfoWindowCloseListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnInfoWindowCloseListener");
                onInfoWindowClose(mcf.maa.m86714a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnInfoWindowCloseListener");
                return true;
            }
        }
    }

    void onInfoWindowClose(mcf mcf);
}

package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mcf;

public interface mbe extends IInterface {

    public static abstract class maa extends Binder implements mbe {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnMarkerDragListener");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMarkerDragListener");
                onMarkerDragStart(mcf.maa.m86714a(parcel.readStrongBinder()));
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMarkerDragListener");
                onMarkerDrag(mcf.maa.m86714a(parcel.readStrongBinder()));
            } else if (i == 3) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMarkerDragListener");
                onMarkerDragEnd(mcf.maa.m86714a(parcel.readStrongBinder()));
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnMarkerDragListener");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onMarkerDrag(mcf mcf);

    void onMarkerDragEnd(mcf mcf);

    void onMarkerDragStart(mcf mcf);
}

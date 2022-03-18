package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mcf;

public interface maj extends IInterface {

    public static abstract class maa extends Binder implements maj {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IInfoWindowAdapter");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IInfoWindowAdapter");
                IObjectWrapper infoWindow = getInfoWindow(mcf.maa.m86714a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (infoWindow != null) {
                    iBinder = infoWindow.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IInfoWindowAdapter");
                IObjectWrapper infoContents = getInfoContents(mcf.maa.m86714a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (infoContents != null) {
                    iBinder = infoContents.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IInfoWindowAdapter");
                return true;
            }
        }
    }

    IObjectWrapper getInfoContents(mcf mcf);

    IObjectWrapper getInfoWindow(mcf mcf);
}

package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mai;

public interface mbc extends IInterface {

    public static abstract class maa extends Binder implements mbc {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnMapReadyCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            mai mai;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IOnMapReadyCallback");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    mai = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    mai = (queryLocalInterface == null || !(queryLocalInterface instanceof mai)) ? new mai.maa.C70263maa(readStrongBinder) : (mai) queryLocalInterface;
                }
                mo83734a(mai);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IOnMapReadyCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo83734a(mai mai);
}

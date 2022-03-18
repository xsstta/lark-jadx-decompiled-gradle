package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.may;

public interface mak extends IInterface {

    public static abstract class maa extends Binder implements mak {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.ILocationSourceDelegate");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            may may;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.ILocationSourceDelegate");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    may = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.huawei.hms.maps.internal.IOnLocationChangeListener");
                    may = (queryLocalInterface == null || !(queryLocalInterface instanceof may)) ? new may.maa.C70267maa(readStrongBinder) : (may) queryLocalInterface;
                }
                mo83970a(may);
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.ILocationSourceDelegate");
                mo83969a();
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.ILocationSourceDelegate");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo83969a();

    /* renamed from: a */
    void mo83970a(may may);
}

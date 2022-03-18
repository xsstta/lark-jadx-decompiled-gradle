package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface mae extends IInterface {

    public static abstract class maa extends Binder implements mae {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.IAnimationListener");
        }

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IAnimationListener");
                mo83882a();
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.IAnimationListener");
                mo83883b();
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.IAnimationListener");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo83882a();

    /* renamed from: b */
    void mo83883b();
}

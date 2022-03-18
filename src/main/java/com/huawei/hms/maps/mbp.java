package com.huawei.hms.maps;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public interface mbp extends IInterface {

    public static abstract class maa extends Binder implements mbp {
        public maa() {
            attachInterface(this, "com.huawei.hms.maps.internal.ISnapshotReadyCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.ISnapshotReadyCallback");
                onSnapshotReady(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.maps.internal.ISnapshotReadyCallback");
                onSnapshotReadyWrapper(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.maps.internal.ISnapshotReadyCallback");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onSnapshotReady(Bitmap bitmap);

    void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper);
}

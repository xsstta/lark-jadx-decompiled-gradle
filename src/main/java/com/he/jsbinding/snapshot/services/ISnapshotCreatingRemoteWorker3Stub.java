package com.he.jsbinding.snapshot.services;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.he.jsbinding.snapshot.SnapshotCreatorData;

public final class ISnapshotCreatingRemoteWorker3Stub extends Binder implements IInterface, ISnapshotCreatingRemoteWorker3 {
    public final SnapshotCreatingRemoteWorker3 base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker
    public void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr) {
        this.base.startCreatingSnapshots(snapshotCreatorDataArr);
    }

    public ISnapshotCreatingRemoteWorker3Stub(Context context) {
        this.base = new SnapshotCreatingRemoteWorker3(context);
        attachInterface(this, "com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3");
    }

    public static ISnapshotCreatingRemoteWorker3Proxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISnapshotCreatingRemoteWorker3Proxy)) {
            return new ISnapshotCreatingRemoteWorker3Proxy(context, iBinder);
        }
        return (ISnapshotCreatingRemoteWorker3Proxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3");
            startCreatingSnapshots((SnapshotCreatorData[]) parcel.createTypedArray(SnapshotCreatorData.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker3");
            return true;
        }
    }
}

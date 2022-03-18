package com.he.jsbinding.snapshot.services;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.he.jsbinding.snapshot.SnapshotCreatorData;

public final class ISnapshotCreatingRemoteWorker0Stub extends Binder implements IInterface, ISnapshotCreatingRemoteWorker0 {
    public final SnapshotCreatingRemoteWorker0 base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker
    public void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr) {
        this.base.startCreatingSnapshots(snapshotCreatorDataArr);
    }

    public ISnapshotCreatingRemoteWorker0Stub(Context context) {
        this.base = new SnapshotCreatingRemoteWorker0(context);
        attachInterface(this, "com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0");
    }

    public static ISnapshotCreatingRemoteWorker0Proxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISnapshotCreatingRemoteWorker0Proxy)) {
            return new ISnapshotCreatingRemoteWorker0Proxy(context, iBinder);
        }
        return (ISnapshotCreatingRemoteWorker0Proxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0");
            startCreatingSnapshots((SnapshotCreatorData[]) parcel.createTypedArray(SnapshotCreatorData.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker0");
            return true;
        }
    }
}

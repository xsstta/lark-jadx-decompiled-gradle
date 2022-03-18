package com.he.jsbinding.snapshot.services;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.he.jsbinding.snapshot.SnapshotCreatorData;

public final class ISnapshotCreatingRemoteWorker2Stub extends Binder implements IInterface, ISnapshotCreatingRemoteWorker2 {
    public final SnapshotCreatingRemoteWorker2 base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker
    public void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr) {
        this.base.startCreatingSnapshots(snapshotCreatorDataArr);
    }

    public ISnapshotCreatingRemoteWorker2Stub(Context context) {
        this.base = new SnapshotCreatingRemoteWorker2(context);
        attachInterface(this, "com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2");
    }

    public static ISnapshotCreatingRemoteWorker2Proxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISnapshotCreatingRemoteWorker2Proxy)) {
            return new ISnapshotCreatingRemoteWorker2Proxy(context, iBinder);
        }
        return (ISnapshotCreatingRemoteWorker2Proxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2");
            startCreatingSnapshots((SnapshotCreatorData[]) parcel.createTypedArray(SnapshotCreatorData.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker2");
            return true;
        }
    }
}

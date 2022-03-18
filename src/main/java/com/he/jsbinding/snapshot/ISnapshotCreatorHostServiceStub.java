package com.he.jsbinding.snapshot;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class ISnapshotCreatorHostServiceStub extends Binder implements IInterface, ISnapshotCreatorHostService {
    public final SnapshotCreatorHostServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotCreatorHostService
    public void startCreatingSnapshot(SnapshotCreatorData snapshotCreatorData) {
        this.base.startCreatingSnapshot(snapshotCreatorData);
    }

    public ISnapshotCreatorHostServiceStub(Context context) {
        this.base = new SnapshotCreatorHostServiceImpl(context);
        attachInterface(this, "com.he.jsbinding.snapshot.ISnapshotCreatorHostService");
    }

    public static ISnapshotCreatorHostServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.he.jsbinding.snapshot.ISnapshotCreatorHostService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISnapshotCreatorHostServiceProxy)) {
            return new ISnapshotCreatorHostServiceProxy(context, iBinder);
        }
        return (ISnapshotCreatorHostServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        SnapshotCreatorData snapshotCreatorData;
        if (i == 1) {
            parcel.enforceInterface("com.he.jsbinding.snapshot.ISnapshotCreatorHostService");
            if (parcel.readInt() != 0) {
                snapshotCreatorData = SnapshotCreatorData.CREATOR.createFromParcel(parcel);
            } else {
                snapshotCreatorData = null;
            }
            startCreatingSnapshot(snapshotCreatorData);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.he.jsbinding.snapshot.ISnapshotCreatorHostService");
            return true;
        }
    }
}

package com.he.jsbinding.snapshot;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class ISnapshotCreatorHostServiceProxy implements IInterface, ISnapshotCreatorHostService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.he.jsbinding.snapshot.ISnapshotCreatorHostService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotCreatorHostService
    public void startCreatingSnapshot(SnapshotCreatorData snapshotCreatorData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.he.jsbinding.snapshot.ISnapshotCreatorHostService");
            if (snapshotCreatorData != null) {
                obtain.writeInt(1);
                snapshotCreatorData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ISnapshotCreatorHostServiceProxy", "call method startCreatingSnapshot throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public ISnapshotCreatorHostServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

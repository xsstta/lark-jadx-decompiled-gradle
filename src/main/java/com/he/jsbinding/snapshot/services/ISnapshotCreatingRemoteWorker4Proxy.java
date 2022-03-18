package com.he.jsbinding.snapshot.services;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.he.jsbinding.snapshot.SnapshotCreatorData;
import com.ss.android.lark.log.Log;

public final class ISnapshotCreatingRemoteWorker4Proxy implements IInterface, ISnapshotCreatingRemoteWorker4 {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker4";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker
    public void startCreatingSnapshots(SnapshotCreatorData[] snapshotCreatorDataArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.he.jsbinding.snapshot.services.ISnapshotCreatingRemoteWorker4");
            obtain.writeTypedArray(snapshotCreatorDataArr, 0);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ISnapshotCreatingRemoteWorker4Proxy", "call method startCreatingSnapshots throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public ISnapshotCreatingRemoteWorker4Proxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

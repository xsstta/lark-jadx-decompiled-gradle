package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.platform.batterymonitor.dozeipc.MainProcDozeModuleIPCServer;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import java.util.List;

public final class IMainProcIPCServerStub extends Binder implements IInterface, IMainProcIPCServer {
    public final MainProcDozeModuleIPCServer base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public boolean getMainProcDozeState() {
        return this.base.getMainProcDozeState();
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void removeMainProcDozeStateForWhile() {
        this.base.removeMainProcDozeStateForWhile();
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadAppLogRecord(List<AppLogEntity> list) {
        this.base.uploadAppLogRecord(list);
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadTeaRecord(List<TeaLogEntity> list) {
        this.base.uploadTeaRecord(list);
    }

    public IMainProcIPCServerStub(Context context) {
        this.base = new MainProcDozeModuleIPCServer(context);
        attachInterface(this, "com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
    }

    public static IMainProcIPCServerProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMainProcIPCServerProxy)) {
            return new IMainProcIPCServerProxy(context, iBinder);
        }
        return (IMainProcIPCServerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            boolean mainProcDozeState = getMainProcDozeState();
            parcel2.writeNoException();
            parcel2.writeInt(mainProcDozeState ? 1 : 0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            removeMainProcDozeStateForWhile();
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            uploadAppLogRecord(parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            uploadTeaRecord(parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            return true;
        }
    }
}

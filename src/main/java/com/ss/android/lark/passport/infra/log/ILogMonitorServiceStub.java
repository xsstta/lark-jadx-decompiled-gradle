package com.ss.android.lark.passport.infra.log;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class ILogMonitorServiceStub extends Binder implements IInterface, ILogMonitorService {
    public final LogMonitorServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public Integer getMsgId() {
        return this.base.getMsgId();
    }

    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public String getTraceId() {
        return this.base.getTraceId();
    }

    public ILogMonitorServiceStub(Context context) {
        this.base = new LogMonitorServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.passport.infra.log.ILogMonitorService");
    }

    public static ILogMonitorServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.passport.infra.log.ILogMonitorService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ILogMonitorServiceProxy)) {
            return new ILogMonitorServiceProxy(context, iBinder);
        }
        return (ILogMonitorServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.log.ILogMonitorService");
            String traceId = getTraceId();
            parcel2.writeNoException();
            parcel2.writeString(traceId);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.log.ILogMonitorService");
            Integer msgId = getMsgId();
            parcel2.writeNoException();
            parcel2.writeInt(msgId.intValue());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.passport.infra.log.ILogMonitorService");
            return true;
        }
    }
}

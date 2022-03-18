package com.ss.android.lark.passport.infra.log;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class ILogMonitorServiceProxy implements IInterface, ILogMonitorService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.passport.infra.log.ILogMonitorService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public String getTraceId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.infra.log.ILogMonitorService");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ILogMonitorServiceProxy", "call method getTraceId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public Integer getMsgId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.passport.infra.log.ILogMonitorService");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Integer valueOf = Integer.valueOf(obtain2.readInt());
            obtain2.recycle();
            obtain.recycle();
            return valueOf;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("ILogMonitorServiceProxy", "call method getMsgId throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public ILogMonitorServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

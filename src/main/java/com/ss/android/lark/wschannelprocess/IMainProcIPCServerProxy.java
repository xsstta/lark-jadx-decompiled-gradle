package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import java.util.List;

public final class IMainProcIPCServerProxy implements IInterface, IMainProcIPCServer {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.wschannelprocess.IMainProcIPCServer";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void removeMainProcDozeStateForWhile() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMainProcIPCServerProxy", "call method removeMainProcDozeStateForWhile throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public boolean getMainProcDozeState() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMainProcIPCServerProxy", "call method getMainProcDozeState throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadAppLogRecord(List<AppLogEntity> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            obtain.writeList(list);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMainProcIPCServerProxy", "call method uploadAppLogRecord throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadTeaRecord(List<TeaLogEntity> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.wschannelprocess.IMainProcIPCServer");
            obtain.writeList(list);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMainProcIPCServerProxy", "call method uploadTeaRecord throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IMainProcIPCServerProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

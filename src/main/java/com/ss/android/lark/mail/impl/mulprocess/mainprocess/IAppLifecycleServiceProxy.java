package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IAppLifecycleServiceProxy implements IInterface, IAppLifecycleService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void entranceCompose() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppLifecycleServiceProxy", "call method entranceCompose throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void exitCompose() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppLifecycleServiceProxy", "call method exitCompose throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public boolean isComposeRunning() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IAppLifecycleServiceProxy", "call method isComposeRunning throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IAppLifecycleServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

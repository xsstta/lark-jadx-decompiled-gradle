package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IWebProcessLifecycleProxy implements IInterface, IWebProcessLifecycle {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle
    public void onProcessCreated() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IWebProcessLifecycleProxy", "call method onProcessCreated throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IWebProcessLifecycleProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

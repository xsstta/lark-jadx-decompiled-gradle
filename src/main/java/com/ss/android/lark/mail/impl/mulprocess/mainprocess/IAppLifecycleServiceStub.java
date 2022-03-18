package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.AppLifecyclyServiceImp;

public final class IAppLifecycleServiceStub extends Binder implements IInterface, IAppLifecycleService {
    public final AppLifecyclyServiceImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void entranceCompose() {
        this.base.entranceCompose();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void exitCompose() {
        this.base.exitCompose();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public boolean isComposeRunning() {
        return this.base.isComposeRunning();
    }

    public IAppLifecycleServiceStub(Context context) {
        this.base = new AppLifecyclyServiceImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
    }

    public static IAppLifecycleServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppLifecycleServiceProxy)) {
            return new IAppLifecycleServiceProxy(context, iBinder);
        }
        return (IAppLifecycleServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            entranceCompose();
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            exitCompose();
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            boolean isComposeRunning = isComposeRunning();
            parcel2.writeNoException();
            parcel2.writeInt(isComposeRunning ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService");
            return true;
        }
    }
}

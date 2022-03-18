package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.WebProcessLifecycleImp;

public final class IWebProcessLifecycleStub extends Binder implements IInterface, IWebProcessLifecycle {
    public final WebProcessLifecycleImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle
    public void onProcessCreated() {
        this.base.onProcessCreated();
    }

    public IWebProcessLifecycleStub(Context context) {
        this.base = new WebProcessLifecycleImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle");
    }

    public static IWebProcessLifecycleProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebProcessLifecycleProxy)) {
            return new IWebProcessLifecycleProxy(context, iBinder);
        }
        return (IWebProcessLifecycleProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle");
            onProcessCreated();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle");
            return true;
        }
    }
}

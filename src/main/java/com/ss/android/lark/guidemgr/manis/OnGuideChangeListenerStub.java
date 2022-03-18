package com.ss.android.lark.guidemgr.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;

public final class OnGuideChangeListenerStub extends Binder implements IInterface, IGuideMgrProxy.OnGuideChangeListener {
    public final IGuideMgrProxy.OnGuideChangeListener base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener
    public void onGuideChanged(String str) {
        this.base.onGuideChanged(str);
    }

    public OnGuideChangeListenerStub(IGuideMgrProxy.OnGuideChangeListener aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener");
    }

    public static OnGuideChangeListenerProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof OnGuideChangeListenerProxy)) {
            return new OnGuideChangeListenerProxy(iBinder);
        }
        return (OnGuideChangeListenerProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener");
            onGuideChanged(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener");
            return true;
        }
    }
}

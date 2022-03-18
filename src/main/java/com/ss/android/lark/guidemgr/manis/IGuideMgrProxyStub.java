package com.ss.android.lark.guidemgr.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;

public final class IGuideMgrProxyStub extends Binder implements IInterface, IGuideMgrProxy {
    public final GuideMgrProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void fetchFromMainProcess() {
        this.base.fetchFromMainProcess();
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void onGuideChanged(String str) {
        this.base.onGuideChanged(str);
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void registerOnGuideChangeListener(IGuideMgrProxy.OnGuideChangeListener aVar) {
        this.base.registerOnGuideChangeListener(aVar);
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public boolean report(String str) {
        return this.base.report(str);
    }

    public IGuideMgrProxyStub(Context context) {
        this.base = new GuideMgrProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
    }

    public static IGuideMgrProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IGuideMgrProxyProxy)) {
            return new IGuideMgrProxyProxy(context, iBinder);
        }
        return (IGuideMgrProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            boolean report = report(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(report ? 1 : 0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            fetchFromMainProcess();
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            registerOnGuideChangeListener(OnGuideChangeListenerStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            onGuideChanged(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.guidemgr.manis.IGuideMgrProxy");
            return true;
        }
    }
}

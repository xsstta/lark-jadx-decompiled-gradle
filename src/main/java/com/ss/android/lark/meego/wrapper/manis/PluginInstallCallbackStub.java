package com.ss.android.lark.meego.wrapper.manis;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class PluginInstallCallbackStub extends Binder implements IInterface, AbstractC44874a {
    public final AbstractC44874a base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
    public void onInstallStart() {
        this.base.onInstallStart();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
    public void onInstallSuccess() {
        this.base.onInstallSuccess();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
    public void onInstallFailed(String str) {
        this.base.onInstallFailed(str);
    }

    public PluginInstallCallbackStub(AbstractC44874a aVar) {
        this.base = aVar;
        attachInterface(this, "com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
    }

    public static PluginInstallCallbackProxy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof PluginInstallCallbackProxy)) {
            return new PluginInstallCallbackProxy(iBinder);
        }
        return (PluginInstallCallbackProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
            onInstallStart();
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
            onInstallSuccess();
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
            onInstallFailed(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.meego.wrapper.manis.PluginInstallCallback");
            return true;
        }
    }
}

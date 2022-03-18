package com.ss.android.lark.meego.wrapper.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IMeegoProxyStub extends Binder implements IInterface, IMeegoProxy {
    public final MeegoProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getMeegoSignature() {
        return this.base.getMeegoSignature();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getRpcPersistDyecpFd() {
        return this.base.getRpcPersistDyecpFd();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getTtFeatureEnv() {
        return this.base.getTtFeatureEnv();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void installPlugin(AbstractC44874a aVar) {
        this.base.installPlugin(aVar);
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void openWebUrl(String str) {
        this.base.openWebUrl(str);
    }

    public IMeegoProxyStub(Context context) {
        this.base = new MeegoProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
    }

    public static IMeegoProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMeegoProxyProxy)) {
            return new IMeegoProxyProxy(context, iBinder);
        }
        return (IMeegoProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            installPlugin(PluginInstallCallbackStub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            String meegoSignature = getMeegoSignature();
            parcel2.writeNoException();
            parcel2.writeString(meegoSignature);
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            String ttFeatureEnv = getTtFeatureEnv();
            parcel2.writeNoException();
            parcel2.writeString(ttFeatureEnv);
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            String rpcPersistDyecpFd = getRpcPersistDyecpFd();
            parcel2.writeNoException();
            parcel2.writeString(rpcPersistDyecpFd);
            return true;
        } else if (i == 5) {
            parcel.enforceInterface("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            openWebUrl(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            return true;
        }
    }
}

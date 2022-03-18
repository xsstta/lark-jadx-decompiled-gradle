package com.ss.android.lark.passport.infra.util.storage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IPassportStorageServiceStub extends Binder implements IInterface, IPassportStorageService {
    public final IPCPassportStorageServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String getData(String str) {
        return this.base.getData(str);
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public String remove(String str) {
        return this.base.remove(str);
    }

    public IPassportStorageServiceStub(Context context) {
        this.base = new IPCPassportStorageServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
    }

    @Override // com.ss.android.lark.passport.infra.util.storage.IPassportStorageService
    public void setData(String str, String str2) {
        this.base.setData(str, str2);
    }

    public static IPassportStorageServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IPassportStorageServiceProxy)) {
            return new IPassportStorageServiceProxy(context, iBinder);
        }
        return (IPassportStorageServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
            String data = getData(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(data);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
            setData(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
            String remove = remove(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(remove);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.passport.infra.util.storage.IPassportStorageService");
            return true;
        }
    }
}

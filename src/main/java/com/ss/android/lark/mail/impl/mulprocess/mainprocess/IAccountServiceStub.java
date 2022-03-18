package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.AccountServiceImp;

public final class IAccountServiceStub extends Binder implements IInterface, IAccountService {
    public final AccountServiceImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public EmailAliasList getAliasList() {
        return this.base.getAliasList();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public MailAddress getCurrentAddress() {
        return this.base.getCurrentAddress();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean hasMultiAccount() {
        return this.base.hasMultiAccount();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isExchangeClient() {
        return this.base.isExchangeClient();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isLarkServer() {
        return this.base.isLarkServer();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isPrimaryAccount() {
        return this.base.isPrimaryAccount();
    }

    public IAccountServiceStub(Context context) {
        this.base = new AccountServiceImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
    }

    public static IAccountServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IAccountServiceProxy)) {
            return new IAccountServiceProxy(context, iBinder);
        }
        return (IAccountServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    MailAddress currentAddress = getCurrentAddress();
                    parcel2.writeNoException();
                    if (currentAddress != null) {
                        parcel2.writeInt(1);
                        currentAddress.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    boolean isPrimaryAccount = isPrimaryAccount();
                    parcel2.writeNoException();
                    parcel2.writeInt(isPrimaryAccount ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    boolean hasMultiAccount = hasMultiAccount();
                    parcel2.writeNoException();
                    parcel2.writeInt(hasMultiAccount ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    EmailAliasList aliasList = getAliasList();
                    parcel2.writeNoException();
                    if (aliasList != null) {
                        parcel2.writeInt(1);
                        aliasList.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    boolean isLarkServer = isLarkServer();
                    parcel2.writeNoException();
                    parcel2.writeInt(isLarkServer ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
                    boolean isExchangeClient = isExchangeClient();
                    parcel2.writeNoException();
                    parcel2.writeInt(isExchangeClient ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService");
            return true;
        }
    }
}

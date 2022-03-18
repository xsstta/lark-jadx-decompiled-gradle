package com.ss.android.lark.helpdesk.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class HelpdeskIpcStub extends Binder implements IInterface, HelpdeskIpc {
    public final HelpdeskIpcImpl base;

    public IBinder asBinder() {
        return this;
    }

    public HelpdeskIpcStub(Context context) {
        this.base = new HelpdeskIpcImpl(context);
        attachInterface(this, "com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
    }

    public static HelpdeskIpcProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof HelpdeskIpcProxy)) {
            return new HelpdeskIpcProxy(context, iBinder);
        }
        return (HelpdeskIpcProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3) {
        this.base.openOncallChatId(str, str2, str3);
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3, String str4) {
        this.base.openOncallChatId(str, str2, str3, str4);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
            openOncallChatId(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
            openOncallChatId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
            return true;
        }
    }
}

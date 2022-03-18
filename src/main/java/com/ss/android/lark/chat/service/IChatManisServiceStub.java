package com.ss.android.lark.chat.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.chat.service.impl.ChatManisServiceImpl;

public final class IChatManisServiceStub extends Binder implements IInterface, IChatManisService {
    public final ChatManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.chat.service.IChatManisService
    public void openChatByChatId(String str) {
        this.base.openChatByChatId(str);
    }

    @Override // com.ss.android.lark.chat.service.IChatManisService
    public void openChatByChatterId(String str) {
        this.base.openChatByChatterId(str);
    }

    public IChatManisServiceStub(Context context) {
        this.base = new ChatManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.chat.service.IChatManisService");
    }

    public static IChatManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.chat.service.IChatManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IChatManisServiceProxy)) {
            return new IChatManisServiceProxy(context, iBinder);
        }
        return (IChatManisServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.chat.service.IChatManisService");
            openChatByChatId(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.chat.service.IChatManisService");
            openChatByChatterId(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.chat.service.IChatManisService");
            return true;
        }
    }
}

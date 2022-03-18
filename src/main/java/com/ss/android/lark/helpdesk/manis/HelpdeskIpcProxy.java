package com.ss.android.lark.helpdesk.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class HelpdeskIpcProxy implements IInterface, HelpdeskIpc {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.helpdesk.manis.HelpdeskIpc";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public HelpdeskIpcProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("HelpdeskIpcProxy", "call method openOncallChatId throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.helpdesk.manis.HelpdeskIpc");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("HelpdeskIpcProxy", "call method openOncallChatId throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}

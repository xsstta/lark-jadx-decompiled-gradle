package com.larksuite.component.blockit.sub_process;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IP0SubProcessProxy implements IInterface, IP0SubProcess {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.blockit.sub_process.IP0SubProcess";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.larksuite.component.blockit.sub_process.IP0SubProcess
    public void triggerRefresh(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.blockit.sub_process.IP0SubProcess");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IP0SubProcessProxy", "call method triggerRefresh throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IP0SubProcessProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

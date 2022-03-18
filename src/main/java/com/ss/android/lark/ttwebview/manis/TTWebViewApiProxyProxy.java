package com.ss.android.lark.ttwebview.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class TTWebViewApiProxyProxy implements IInterface, TTWebViewApiProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLoadSoVersion() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TTWebViewApiProxyProxy", "call method getLoadSoVersion throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLocalSoVersion() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TTWebViewApiProxyProxy", "call method getLocalSoVersion throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public void fetchWebViewCore(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TTWebViewApiProxyProxy", "call method fetchWebViewCore throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public TTWebViewApiProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

package com.ss.android.lark.meego.wrapper.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;

public final class IMeegoProxyProxy implements IInterface, IMeegoProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.meego.wrapper.manis.IMeegoProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getMeegoSignature() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMeegoProxyProxy", "call method getMeegoSignature throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getRpcPersistDyecpFd() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMeegoProxyProxy", "call method getRpcPersistDyecpFd throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public String getTtFeatureEnv() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMeegoProxyProxy", "call method getTtFeatureEnv throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void openWebUrl(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            obtain.writeString(str);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMeegoProxyProxy", "call method openWebUrl throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.meego.wrapper.manis.IMeegoProxy
    public void installPlugin(AbstractC44874a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.meego.wrapper.manis.IMeegoProxy");
            if (aVar != null) {
                obtain.writeStrongBinder(new PluginInstallCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IMeegoProxyProxy", "call method installPlugin throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IMeegoProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

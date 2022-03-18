package com.ss.android.lark.browser.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AppConfigProxy implements IInterface, AppConfig {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.browser.manis.AppConfig";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public int getSampleTextMaxContentLength() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i = 0;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.browser.manis.AppConfig");
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppConfigProxy", "call method getSampleTextMaxContentLength throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return i;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getJSAPIWhiteList() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.browser.manis.AppConfig");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppConfigProxy", "call method getJSAPIWhiteList throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.browser.manis.AppConfig
    public Map<String, String> getSchemaHandleList() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.browser.manis.AppConfig");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            HashMap readHashMap = obtain2.readHashMap(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readHashMap;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppConfigProxy", "call method getSchemaHandleList throw RemoteException", e, true);
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
    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getSecLinkWhiteList() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.browser.manis.AppConfig");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppConfigProxy", "call method getSecLinkWhiteList throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public boolean isUrlEnableForWebTranslate(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.browser.manis.AppConfig");
            obtain.writeString(str);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("AppConfigProxy", "call method isUrlEnableForWebTranslate throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public AppConfigProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

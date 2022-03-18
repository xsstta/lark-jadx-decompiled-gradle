package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

public final class IEngagementSettingServiceProxy implements IInterface, IEngagementSettingService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean canShareToExternalPermission() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IEngagementSettingServiceProxy", "call method canShareToExternalPermission throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public List<String> getDomains() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IEngagementSettingServiceProxy", "call method getDomains throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean getRecallEnable() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        boolean z = true;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IEngagementSettingServiceProxy", "call method getRecallEnable throw RemoteException", e, true);
            return false;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IEngagementSettingServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }
}

package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.EngagementSettingServiceImp;
import java.util.List;

public final class IEngagementSettingServiceStub extends Binder implements IInterface, IEngagementSettingService {
    public final EngagementSettingServiceImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean canShareToExternalPermission() {
        return this.base.canShareToExternalPermission();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public List<String> getDomains() {
        return this.base.getDomains();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean getRecallEnable() {
        return this.base.getRecallEnable();
    }

    public IEngagementSettingServiceStub(Context context) {
        this.base = new EngagementSettingServiceImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
    }

    public static IEngagementSettingServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IEngagementSettingServiceProxy)) {
            return new IEngagementSettingServiceProxy(context, iBinder);
        }
        return (IEngagementSettingServiceProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            boolean canShareToExternalPermission = canShareToExternalPermission();
            parcel2.writeNoException();
            parcel2.writeInt(canShareToExternalPermission ? 1 : 0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            List<String> domains = getDomains();
            parcel2.writeNoException();
            parcel2.writeList(domains);
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            boolean recallEnable = getRecallEnable();
            parcel2.writeNoException();
            parcel2.writeInt(recallEnable ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService");
            return true;
        }
    }
}

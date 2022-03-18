package com.ss.android.lark.audit_provider;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.audit.auth.TransactionalPermData;
import com.ss.android.lark.audit.db.AuditDBData;
import java.util.List;

public final class IDataIPCServiceStub extends Binder implements IInterface, IDataIPCService {
    public final DataIPCServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        this.base.deletePermissionData(str);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public TransactionalPermData queryPermissionData(String str) {
        return this.base.queryPermissionData(str);
    }

    public IDataIPCServiceStub(Context context) {
        this.base = new DataIPCServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.audit_provider.IDataIPCService");
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void deleteAuditData(String str, List<AuditDBData> list) {
        this.base.deleteAuditData(str, list);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public List<AuditDBData> queryAuditData(String str, int i) {
        return this.base.queryAuditData(str, i);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void recordAuditData(String str, String str2) {
        this.base.recordAuditData(str, str2);
    }

    public static IDataIPCServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.audit_provider.IDataIPCService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IDataIPCServiceProxy)) {
            return new IDataIPCServiceProxy(context, iBinder);
        }
        return (IDataIPCServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        this.base.savePermissionData(str, str2, bArr, bArr2);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    savePermissionData(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    deletePermissionData(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    TransactionalPermData queryPermissionData = queryPermissionData(parcel.readString());
                    parcel2.writeNoException();
                    if (queryPermissionData != null) {
                        parcel2.writeInt(1);
                        queryPermissionData.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    recordAuditData(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    List<AuditDBData> queryAuditData = queryAuditData(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeList(queryAuditData);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.audit_provider.IDataIPCService");
                    deleteAuditData(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.audit_provider.IDataIPCService");
            return true;
        }
    }
}

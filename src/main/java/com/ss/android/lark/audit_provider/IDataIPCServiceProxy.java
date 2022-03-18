package com.ss.android.lark.audit_provider;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.audit.auth.TransactionalPermData;
import com.ss.android.lark.audit.db.AuditDBData;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

public final class IDataIPCServiceProxy implements IInterface, IDataIPCService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.audit_provider.IDataIPCService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method deletePermissionData throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public TransactionalPermData queryPermissionData(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        TransactionalPermData transactionalPermData = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                transactionalPermData = TransactionalPermData.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method queryPermissionData throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return transactionalPermData;
    }

    public IDataIPCServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void deleteAuditData(String str, List<AuditDBData> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            obtain.writeList(list);
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method deleteAuditData throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void recordAuditData(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method recordAuditData throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public List<AuditDBData> queryAuditData(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
            obtain2.recycle();
            obtain.recycle();
            return readArrayList;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method queryAuditData throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.audit_provider.IDataIPCService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IDataIPCServiceProxy", "call method savePermissionData throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}

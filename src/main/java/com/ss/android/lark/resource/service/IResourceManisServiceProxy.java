package com.ss.android.lark.resource.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.log.Log;

public final class IResourceManisServiceProxy implements IInterface, IResourceManisService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.resource.service.IResourceManisService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void cancelDownloadResource(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            obtain.writeString(str);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method cancelDownloadResource throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushPushResourceListener(AbstractC53140b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            if (bVar != null) {
                obtain.writeStrongBinder(new IProxyPushResourceListenerStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method addPushPushResourceListener throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushResourceDownloadProgressListener(AbstractC53139a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            if (aVar != null) {
                obtain.writeStrongBinder(new IProxyPushResourceDownloadProgressListenerStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method addPushResourceDownloadProgressListener throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IResourceManisServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getEncryptImage(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method getEncryptImage throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void downloadResource(String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method downloadResource throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getAvatarPath(String str, String str2, int i, float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method getAvatarPath throw RemoteException", e, true);
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public Resource getEncryptImage(String str, String str2, String str3, boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        Resource resource = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.resource.service.IResourceManisService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                resource = Resource.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IResourceManisServiceProxy", "call method getEncryptImage throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return resource;
    }
}

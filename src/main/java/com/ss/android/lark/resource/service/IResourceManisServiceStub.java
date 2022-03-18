package com.ss.android.lark.resource.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.resource.service.impl.ResourceManisServiceImpl;

public final class IResourceManisServiceStub extends Binder implements IInterface, IResourceManisService {
    public final ResourceManisServiceImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushPushResourceListener(AbstractC53140b bVar) {
        this.base.addPushPushResourceListener(bVar);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushResourceDownloadProgressListener(AbstractC53139a aVar) {
        this.base.addPushResourceDownloadProgressListener(aVar);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void cancelDownloadResource(String str) {
        this.base.cancelDownloadResource(str);
    }

    public IResourceManisServiceStub(Context context) {
        this.base = new ResourceManisServiceImpl(context);
        attachInterface(this, "com.ss.android.lark.resource.service.IResourceManisService");
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getEncryptImage(String str, String str2) {
        return this.base.getEncryptImage(str, str2);
    }

    public static IResourceManisServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.resource.service.IResourceManisService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IResourceManisServiceProxy)) {
            return new IResourceManisServiceProxy(context, iBinder);
        }
        return (IResourceManisServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void downloadResource(String str, String str2, String str3) {
        this.base.downloadResource(str, str2, str3);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getAvatarPath(String str, String str2, int i, float f) {
        return this.base.getAvatarPath(str, str2, i, f);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public Resource getEncryptImage(String str, String str2, String str3, boolean z) {
        return this.base.getEncryptImage(str, str2, str3, z);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    downloadResource(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    cancelDownloadResource(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    addPushPushResourceListener(IProxyPushResourceListenerStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    addPushResourceDownloadProgressListener(IProxyPushResourceDownloadProgressListenerStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    String encryptImage = getEncryptImage(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(encryptImage);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Resource encryptImage2 = getEncryptImage(readString, readString2, readString3, z);
                    parcel2.writeNoException();
                    if (encryptImage2 != null) {
                        parcel2.writeInt(1);
                        encryptImage2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.resource.service.IResourceManisService");
                    String avatarPath = getAvatarPath(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeString(avatarPath);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.resource.service.IResourceManisService");
            return true;
        }
    }
}

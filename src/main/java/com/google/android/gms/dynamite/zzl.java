package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C21910a;
import com.google.android.gms.internal.common.zza;

public final class zzl extends zza implements zzk {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C21910a.m79219a(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C21910a.m79219a(zza, iObjectWrapper2);
        Parcel zza2 = zza(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C21910a.m79219a(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C21910a.m79219a(zza, iObjectWrapper2);
        Parcel zza2 = zza(3, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C21910a;
import com.google.android.gms.internal.common.zza;

public final class zzo extends zza implements zzm {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzm
    public final boolean zza(zzk zzk, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21910a.m79220a(zza, zzk);
        C21910a.m79219a(zza, iObjectWrapper);
        Parcel zza2 = zza(5, zza);
        boolean a = C21910a.m79222a(zza2);
        zza2.recycle();
        return a;
    }
}

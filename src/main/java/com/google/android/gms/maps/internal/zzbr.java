package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public final class zzbr extends zza implements IProjectionDelegate {
    zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        Parcel zza2 = zza(1, zza);
        LatLng latLng = (LatLng) C21936a.m79263a(zza2, LatLng.CREATOR);
        zza2.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocation(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        Parcel zza2 = zza(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final VisibleRegion getVisibleRegion() throws RemoteException {
        Parcel zza = zza(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) C21936a.m79263a(zza, VisibleRegion.CREATOR);
        zza.recycle();
        return visibleRegion;
    }
}

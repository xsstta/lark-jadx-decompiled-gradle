package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;

public final class zzbw extends zza implements IStreetViewPanoramaViewDelegate {
    zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate;
        Parcel zza = zza(1, zza());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            iStreetViewPanoramaDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                iStreetViewPanoramaDelegate = (IStreetViewPanoramaDelegate) queryLocalInterface;
            } else {
                iStreetViewPanoramaDelegate = new zzbu(readStrongBinder);
            }
        }
        zza.recycle();
        return iStreetViewPanoramaDelegate;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        zzb(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onResume() throws RemoteException {
        zzb(3, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onPause() throws RemoteException {
        zzb(4, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onDestroy() throws RemoteException {
        zzb(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onLowMemory() throws RemoteException {
        zzb(6, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        Parcel zza2 = zza(7, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IObjectWrapper getView() throws RemoteException {
        Parcel zza = zza(8, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void getStreetViewPanoramaAsync(zzbp zzbp) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbp);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStart() throws RemoteException {
        zzb(10, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStop() throws RemoteException {
        zzb(11, zza());
    }
}

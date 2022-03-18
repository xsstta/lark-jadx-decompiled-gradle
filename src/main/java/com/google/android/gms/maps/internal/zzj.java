package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.GoogleMapOptions;

public final class zzj extends zza implements IMapFragmentDelegate {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final IGoogleMapDelegate getMap() throws RemoteException {
        IGoogleMapDelegate iGoogleMapDelegate;
        Parcel zza = zza(1, zza());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            iGoogleMapDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface instanceof IGoogleMapDelegate) {
                iGoogleMapDelegate = (IGoogleMapDelegate) queryLocalInterface;
            } else {
                iGoogleMapDelegate = new zzg(readStrongBinder);
            }
        }
        zza.recycle();
        return iGoogleMapDelegate;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onInflate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        C21936a.m79265a(zza, googleMapOptions);
        C21936a.m79265a(zza, bundle);
        zzb(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        C21936a.m79264a(zza, iObjectWrapper2);
        C21936a.m79265a(zza, bundle);
        Parcel zza2 = zza(4, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onResume() throws RemoteException {
        zzb(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onPause() throws RemoteException {
        zzb(6, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroyView() throws RemoteException {
        zzb(7, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroy() throws RemoteException {
        zzb(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onLowMemory() throws RemoteException {
        zzb(9, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        Parcel zza2 = zza(10, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final boolean isReady() throws RemoteException {
        Parcel zza = zza(11, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzap);
        zzb(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onExitAmbient() throws RemoteException {
        zzb(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStart() throws RemoteException {
        zzb(15, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStop() throws RemoteException {
        zzb(16, zza());
    }
}

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

public final class zzbu extends zza implements IStreetViewPanoramaDelegate {
    zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableZoom(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(1, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enablePanning(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableUserNavigation(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableStreetNames(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel zza = zza(5, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isPanningGesturesEnabled() throws RemoteException {
        Parcel zza = zza(6, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isUserNavigationEnabled() throws RemoteException {
        Parcel zza = zza(7, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isStreetNamesEnabled() throws RemoteException {
        Parcel zza = zza(8, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, streetViewPanoramaCamera);
        zza.writeLong(j);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
        Parcel zza = zza(10, zza());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) C21936a.m79263a(zza, StreetViewPanoramaCamera.CREATOR);
        zza.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithID(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(11, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        zzb(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadius(LatLng latLng, int i) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        zza.writeInt(i);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
        Parcel zza = zza(14, zza());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) C21936a.m79263a(zza, StreetViewPanoramaLocation.CREATOR);
        zza.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaChangeListener(zzbj zzbj) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbj);
        zzb(15, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaCameraChangeListener(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbh);
        zzb(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaClickListener(zzbl zzbl) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbl);
        zzb(17, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        Parcel zza2 = zza(18, zza);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) C21936a.m79263a(zza2, StreetViewPanoramaOrientation.CREATOR);
        zza2.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, streetViewPanoramaOrientation);
        Parcel zza2 = zza(19, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza2.readStrongBinder());
        zza2.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaLongClickListener(zzbn zzbn) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbn);
        zzb(20, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        C21936a.m79265a(zza, streetViewSource);
        zzb(21, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        zza.writeInt(i);
        C21936a.m79265a(zza, streetViewSource);
        zzb(22, zza);
    }
}

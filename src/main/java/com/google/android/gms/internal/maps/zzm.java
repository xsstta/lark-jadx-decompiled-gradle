package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class zzm extends zza implements zzk {
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final String getId() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final LatLng getPosition() throws RemoteException {
        Parcel zza = zza(4, zza());
        LatLng latLng = (LatLng) C21936a.m79263a(zza, LatLng.CREATOR);
        zza.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setDimensions(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zza(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzb(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getWidth() throws RemoteException {
        Parcel zza = zza(7, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getHeight() throws RemoteException {
        Parcel zza = zza(8, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLngBounds);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final LatLngBounds getBounds() throws RemoteException {
        Parcel zza = zza(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) C21936a.m79263a(zza, LatLngBounds.CREATOR);
        zza.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setBearing(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getBearing() throws RemoteException {
        Parcel zza = zza(12, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(14, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(16, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setTransparency(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getTransparency() throws RemoteException {
        Parcel zza = zza(18, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean zzb(zzk zzk) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzk);
        Parcel zza2 = zza(19, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final int zzj() throws RemoteException {
        Parcel zza = zza(20, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setClickable(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isClickable() throws RemoteException {
        Parcel zza = zza(23, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zza = zza(25, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}

package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzae extends zza implements zzac {
    zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void clearTileCache() throws RemoteException {
        zzb(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final String getId() throws RemoteException {
        Parcel zza = zza(3, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(5, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(7, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean zza(zzac zzac) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzac);
        Parcel zza2 = zza(8, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final int zzj() throws RemoteException {
        Parcel zza = zza(9, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setFadeIn(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean getFadeIn() throws RemoteException {
        Parcel zza = zza(11, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setTransparency(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getTransparency() throws RemoteException {
        Parcel zza = zza(13, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }
}

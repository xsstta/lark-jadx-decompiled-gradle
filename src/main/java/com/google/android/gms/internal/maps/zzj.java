package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

public final class zzj extends zza implements zzh {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final String getId() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setCenter(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLng);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final LatLng getCenter() throws RemoteException {
        Parcel zza = zza(4, zza());
        LatLng latLng = (LatLng) C21936a.m79263a(zza, LatLng.CREATOR);
        zza.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setRadius(double d) throws RemoteException {
        Parcel zza = zza();
        zza.writeDouble(d);
        zzb(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final double getRadius() throws RemoteException {
        Parcel zza = zza(6, zza());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokeWidth(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final float getStrokeWidth() throws RemoteException {
        Parcel zza = zza(8, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokeColor(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int getStrokeColor() throws RemoteException {
        Parcel zza = zza(10, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setFillColor(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int getFillColor() throws RemoteException {
        Parcel zza = zza(12, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(14, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(16, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean zzb(zzh zzh) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzh);
        Parcel zza2 = zza(17, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final int zzj() throws RemoteException {
        Parcel zza = zza(18, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setClickable(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final boolean isClickable() throws RemoteException {
        Parcel zza = zza(20, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void setStrokePattern(List<PatternItem> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzb(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final List<PatternItem> getStrokePattern() throws RemoteException {
        Parcel zza = zza(22, zza());
        ArrayList createTypedArrayList = zza.createTypedArrayList(PatternItem.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzh
    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zza = zza(24, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}

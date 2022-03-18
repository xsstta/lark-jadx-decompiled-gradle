package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

public final class zzab extends zza implements zzz {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final String getId() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setPoints(List<LatLng> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final List<LatLng> getPoints() throws RemoteException {
        Parcel zza = zza(4, zza());
        ArrayList createTypedArrayList = zza.createTypedArrayList(LatLng.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setWidth(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final float getWidth() throws RemoteException {
        Parcel zza = zza(6, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setColor(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int getColor() throws RemoteException {
        Parcel zza = zza(8, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(10, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(12, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setGeodesic(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isGeodesic() throws RemoteException {
        Parcel zza = zza(14, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean zzb(zzz zzz) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzz);
        Parcel zza2 = zza(15, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int zzj() throws RemoteException {
        Parcel zza = zza(16, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setClickable(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final boolean isClickable() throws RemoteException {
        Parcel zza = zza(18, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setStartCap(Cap cap) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, cap);
        zzb(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final Cap getStartCap() throws RemoteException {
        Parcel zza = zza(20, zza());
        Cap cap = (Cap) C21936a.m79263a(zza, Cap.CREATOR);
        zza.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setEndCap(Cap cap) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, cap);
        zzb(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final Cap getEndCap() throws RemoteException {
        Parcel zza = zza(22, zza());
        Cap cap = (Cap) C21936a.m79263a(zza, Cap.CREATOR);
        zza.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setJointType(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final int getJointType() throws RemoteException {
        Parcel zza = zza(24, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void setPattern(List<PatternItem> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzb(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final List<PatternItem> getPattern() throws RemoteException {
        Parcel zza = zza(26, zza());
        ArrayList createTypedArrayList = zza.createTypedArrayList(PatternItem.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzz
    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zza = zza(28, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}

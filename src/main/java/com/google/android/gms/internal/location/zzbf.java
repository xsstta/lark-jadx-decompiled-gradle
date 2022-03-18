package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C21922j();

    /* renamed from: a */
    private int f53348a;

    /* renamed from: b */
    private zzbd f53349b;

    /* renamed from: c */
    private zzx f53350c;

    /* renamed from: d */
    private PendingIntent f53351d;

    /* renamed from: e */
    private zzu f53352e;

    /* renamed from: f */
    private zzaj f53353f;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f53348a = i;
        this.f53349b = zzbd;
        zzaj zzaj = null;
        this.f53350c = iBinder == null ? null : zzy.zzc(iBinder);
        this.f53351d = pendingIntent;
        this.f53352e = iBinder2 == null ? null : zzv.zzb(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder3);
        }
        this.f53353f = zzaj;
    }

    /* renamed from: a */
    public static zzbf m79260a(zzu zzu, zzaj zzaj) {
        return new zzbf(2, null, null, null, zzu.asBinder(), zzaj != null ? zzaj.asBinder() : null);
    }

    /* renamed from: a */
    public static zzbf m79261a(zzx zzx, zzaj zzaj) {
        return new zzbf(2, null, zzx.asBinder(), null, null, zzaj != null ? zzaj.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53348a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53349b, i, false);
        zzx zzx = this.f53350c;
        IBinder iBinder = null;
        SafeParcelWriter.writeIBinder(parcel, 3, zzx == null ? null : zzx.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f53351d, i, false);
        zzu zzu = this.f53352e;
        SafeParcelWriter.writeIBinder(parcel, 5, zzu == null ? null : zzu.asBinder(), false);
        zzaj zzaj = this.f53353f;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C21933u();

    /* renamed from: a */
    private int f53368a;

    /* renamed from: b */
    private zzm f53369b;

    /* renamed from: c */
    private zzr f53370c;

    /* renamed from: d */
    private zzaj f53371d;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f53368a = i;
        this.f53369b = zzm;
        zzaj zzaj = null;
        this.f53370c = iBinder == null ? null : zzs.zza(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder2);
        }
        this.f53371d = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53368a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53369b, i, false);
        zzr zzr = this.f53370c;
        IBinder iBinder = null;
        SafeParcelWriter.writeIBinder(parcel, 3, zzr == null ? null : zzr.asBinder(), false);
        zzaj zzaj = this.f53371d;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

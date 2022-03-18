package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C22038ac();

    /* renamed from: a */
    private zzaf f53645a;

    /* renamed from: b */
    private AbstractC22048i f53646b;

    /* renamed from: c */
    private boolean f53647c = true;

    /* renamed from: d */
    private float f53648d;

    /* renamed from: e */
    private boolean f53649e = true;

    /* renamed from: f */
    private float f53650f;

    public TileOverlayOptions() {
    }

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        C22037ab abVar;
        zzaf zzk = zzag.zzk(iBinder);
        this.f53645a = zzk;
        if (zzk == null) {
            abVar = null;
        } else {
            abVar = new C22037ab(this);
        }
        this.f53646b = abVar;
        this.f53647c = z;
        this.f53648d = f;
        this.f53649e = z2;
        this.f53650f = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f53645a.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, mo74895b());
        SafeParcelWriter.writeFloat(parcel, 4, mo74894a());
        SafeParcelWriter.writeBoolean(parcel, 5, mo74896c());
        SafeParcelWriter.writeFloat(parcel, 6, mo74897d());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final float mo74894a() {
        return this.f53648d;
    }

    /* renamed from: b */
    public final boolean mo74895b() {
        return this.f53647c;
    }

    /* renamed from: c */
    public final boolean mo74896c() {
        return this.f53649e;
    }

    /* renamed from: d */
    public final float mo74897d() {
        return this.f53650f;
    }
}

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C22052m();

    /* renamed from: a */
    private C22035a f53565a;

    /* renamed from: b */
    private LatLng f53566b;

    /* renamed from: c */
    private float f53567c;

    /* renamed from: d */
    private float f53568d;

    /* renamed from: e */
    private LatLngBounds f53569e;

    /* renamed from: f */
    private float f53570f;

    /* renamed from: g */
    private float f53571g;

    /* renamed from: h */
    private boolean f53572h = true;

    /* renamed from: i */
    private float f53573i;

    /* renamed from: j */
    private float f53574j = 0.5f;

    /* renamed from: k */
    private float f53575k = 0.5f;

    /* renamed from: l */
    private boolean f53576l;

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f53565a = new C22035a(IObjectWrapper.Stub.asInterface(iBinder));
        this.f53566b = latLng;
        this.f53567c = f;
        this.f53568d = f2;
        this.f53569e = latLngBounds;
        this.f53570f = f3;
        this.f53571g = f4;
        this.f53572h = z;
        this.f53573i = f5;
        this.f53574j = f6;
        this.f53575k = f7;
        this.f53576l = z2;
    }

    public GroundOverlayOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f53565a.mo74903a().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo74804a(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, mo74805b());
        SafeParcelWriter.writeFloat(parcel, 5, mo74806c());
        SafeParcelWriter.writeParcelable(parcel, 6, mo74807d(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, mo74808e());
        SafeParcelWriter.writeFloat(parcel, 8, mo74809f());
        SafeParcelWriter.writeBoolean(parcel, 9, mo74813j());
        SafeParcelWriter.writeFloat(parcel, 10, mo74810g());
        SafeParcelWriter.writeFloat(parcel, 11, mo74811h());
        SafeParcelWriter.writeFloat(parcel, 12, mo74812i());
        SafeParcelWriter.writeBoolean(parcel, 13, mo74814k());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final LatLng mo74804a() {
        return this.f53566b;
    }

    /* renamed from: b */
    public final float mo74805b() {
        return this.f53567c;
    }

    /* renamed from: c */
    public final float mo74806c() {
        return this.f53568d;
    }

    /* renamed from: d */
    public final LatLngBounds mo74807d() {
        return this.f53569e;
    }

    /* renamed from: e */
    public final float mo74808e() {
        return this.f53570f;
    }

    /* renamed from: f */
    public final float mo74809f() {
        return this.f53571g;
    }

    /* renamed from: g */
    public final float mo74810g() {
        return this.f53573i;
    }

    /* renamed from: h */
    public final float mo74811h() {
        return this.f53574j;
    }

    /* renamed from: i */
    public final float mo74812i() {
        return this.f53575k;
    }

    /* renamed from: j */
    public final boolean mo74813j() {
        return this.f53572h;
    }

    /* renamed from: k */
    public final boolean mo74814k() {
        return this.f53576l;
    }
}

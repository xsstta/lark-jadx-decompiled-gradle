package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C22056q();

    /* renamed from: a */
    private LatLng f53583a;

    /* renamed from: b */
    private String f53584b;

    /* renamed from: c */
    private String f53585c;

    /* renamed from: d */
    private C22035a f53586d;

    /* renamed from: e */
    private float f53587e = 0.5f;

    /* renamed from: f */
    private float f53588f = 1.0f;

    /* renamed from: g */
    private boolean f53589g;

    /* renamed from: h */
    private boolean f53590h = true;

    /* renamed from: i */
    private boolean f53591i;

    /* renamed from: j */
    private float f53592j;

    /* renamed from: k */
    private float f53593k = 0.5f;

    /* renamed from: l */
    private float f53594l;

    /* renamed from: m */
    private float f53595m = 1.0f;

    /* renamed from: n */
    private float f53596n;

    public MarkerOptions() {
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f53583a = latLng;
        this.f53584b = str;
        this.f53585c = str2;
        if (iBinder == null) {
            this.f53586d = null;
        } else {
            this.f53586d = new C22035a(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.f53587e = f;
        this.f53588f = f2;
        this.f53589g = z;
        this.f53590h = z2;
        this.f53591i = z3;
        this.f53592j = f3;
        this.f53593k = f4;
        this.f53594l = f5;
        this.f53595m = f6;
        this.f53596n = f7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo74825a(), i, false);
        SafeParcelWriter.writeString(parcel, 3, mo74830b(), false);
        SafeParcelWriter.writeString(parcel, 4, mo74831c(), false);
        C22035a aVar = this.f53586d;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo74903a().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinder, false);
        SafeParcelWriter.writeFloat(parcel, 6, mo74832d());
        SafeParcelWriter.writeFloat(parcel, 7, mo74833e());
        SafeParcelWriter.writeBoolean(parcel, 8, mo74834f());
        SafeParcelWriter.writeBoolean(parcel, 9, mo74835g());
        SafeParcelWriter.writeBoolean(parcel, 10, mo74836h());
        SafeParcelWriter.writeFloat(parcel, 11, mo74837i());
        SafeParcelWriter.writeFloat(parcel, 12, mo74838j());
        SafeParcelWriter.writeFloat(parcel, 13, mo74839k());
        SafeParcelWriter.writeFloat(parcel, 14, mo74840l());
        SafeParcelWriter.writeFloat(parcel, 15, mo74841m());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final MarkerOptions mo74827a(LatLng latLng) {
        if (latLng != null) {
            this.f53583a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: a */
    public final MarkerOptions mo74828a(C22035a aVar) {
        this.f53586d = aVar;
        return this;
    }

    /* renamed from: a */
    public final MarkerOptions mo74826a(float f, float f2) {
        this.f53587e = f;
        this.f53588f = f2;
        return this;
    }

    /* renamed from: a */
    public final MarkerOptions mo74829a(String str) {
        this.f53584b = str;
        return this;
    }

    /* renamed from: a */
    public final LatLng mo74825a() {
        return this.f53583a;
    }

    /* renamed from: b */
    public final String mo74830b() {
        return this.f53584b;
    }

    /* renamed from: c */
    public final String mo74831c() {
        return this.f53585c;
    }

    /* renamed from: d */
    public final float mo74832d() {
        return this.f53587e;
    }

    /* renamed from: e */
    public final float mo74833e() {
        return this.f53588f;
    }

    /* renamed from: f */
    public final boolean mo74834f() {
        return this.f53589g;
    }

    /* renamed from: g */
    public final boolean mo74835g() {
        return this.f53590h;
    }

    /* renamed from: h */
    public final boolean mo74836h() {
        return this.f53591i;
    }

    /* renamed from: i */
    public final float mo74837i() {
        return this.f53592j;
    }

    /* renamed from: j */
    public final float mo74838j() {
        return this.f53593k;
    }

    /* renamed from: k */
    public final float mo74839k() {
        return this.f53594l;
    }

    /* renamed from: l */
    public final float mo74840l() {
        return this.f53595m;
    }

    /* renamed from: m */
    public final float mo74841m() {
        return this.f53596n;
    }
}

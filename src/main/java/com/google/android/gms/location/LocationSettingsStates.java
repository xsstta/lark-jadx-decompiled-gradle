package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C21963q();

    /* renamed from: a */
    private final boolean f53422a;

    /* renamed from: b */
    private final boolean f53423b;

    /* renamed from: c */
    private final boolean f53424c;

    /* renamed from: d */
    private final boolean f53425d;

    /* renamed from: e */
    private final boolean f53426e;

    /* renamed from: f */
    private final boolean f53427f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f53422a = z;
        this.f53423b = z2;
        this.f53424c = z3;
        this.f53425d = z4;
        this.f53426e = z5;
        this.f53427f = z6;
    }

    /* renamed from: a */
    public final boolean mo74339a() {
        return this.f53422a;
    }

    /* renamed from: b */
    public final boolean mo74340b() {
        return this.f53425d;
    }

    /* renamed from: c */
    public final boolean mo74341c() {
        return this.f53423b;
    }

    /* renamed from: d */
    public final boolean mo74342d() {
        return this.f53426e;
    }

    /* renamed from: e */
    public final boolean mo74343e() {
        return this.f53422a || this.f53423b;
    }

    /* renamed from: f */
    public final boolean mo74344f() {
        return this.f53425d || this.f53426e;
    }

    /* renamed from: g */
    public final boolean mo74345g() {
        return this.f53424c;
    }

    /* renamed from: h */
    public final boolean mo74346h() {
        return this.f53427f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo74339a());
        SafeParcelWriter.writeBoolean(parcel, 2, mo74341c());
        SafeParcelWriter.writeBoolean(parcel, 3, mo74345g());
        SafeParcelWriter.writeBoolean(parcel, 4, mo74340b());
        SafeParcelWriter.writeBoolean(parcel, 5, mo74342d());
        SafeParcelWriter.writeBoolean(parcel, 6, mo74346h());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

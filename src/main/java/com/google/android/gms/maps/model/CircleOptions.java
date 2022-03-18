package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C22051l();

    /* renamed from: a */
    private LatLng f53552a;

    /* renamed from: b */
    private double f53553b;

    /* renamed from: c */
    private float f53554c = 10.0f;

    /* renamed from: d */
    private int f53555d = -16777216;

    /* renamed from: e */
    private int f53556e;

    /* renamed from: f */
    private float f53557f;

    /* renamed from: g */
    private boolean f53558g = true;

    /* renamed from: h */
    private boolean f53559h;

    /* renamed from: i */
    private List<PatternItem> f53560i;

    public CircleOptions() {
    }

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f53552a = latLng;
        this.f53553b = d;
        this.f53554c = f;
        this.f53555d = i;
        this.f53556e = i2;
        this.f53557f = f2;
        this.f53558g = z;
        this.f53559h = z2;
        this.f53560i = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo74792a(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, mo74793b());
        SafeParcelWriter.writeFloat(parcel, 4, mo74795c());
        SafeParcelWriter.writeInt(parcel, 5, mo74796d());
        SafeParcelWriter.writeInt(parcel, 6, mo74798f());
        SafeParcelWriter.writeFloat(parcel, 7, mo74799g());
        SafeParcelWriter.writeBoolean(parcel, 8, mo74800h());
        SafeParcelWriter.writeBoolean(parcel, 9, mo74801i());
        SafeParcelWriter.writeTypedList(parcel, 10, mo74797e(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final CircleOptions mo74791a(LatLng latLng) {
        this.f53552a = latLng;
        return this;
    }

    /* renamed from: a */
    public final CircleOptions mo74788a(double d) {
        this.f53553b = d;
        return this;
    }

    /* renamed from: a */
    public final CircleOptions mo74789a(float f) {
        this.f53554c = f;
        return this;
    }

    /* renamed from: a */
    public final CircleOptions mo74790a(int i) {
        this.f53555d = i;
        return this;
    }

    /* renamed from: b */
    public final CircleOptions mo74794b(int i) {
        this.f53556e = i;
        return this;
    }

    /* renamed from: a */
    public final LatLng mo74792a() {
        return this.f53552a;
    }

    /* renamed from: b */
    public final double mo74793b() {
        return this.f53553b;
    }

    /* renamed from: c */
    public final float mo74795c() {
        return this.f53554c;
    }

    /* renamed from: d */
    public final int mo74796d() {
        return this.f53555d;
    }

    /* renamed from: e */
    public final List<PatternItem> mo74797e() {
        return this.f53560i;
    }

    /* renamed from: f */
    public final int mo74798f() {
        return this.f53556e;
    }

    /* renamed from: g */
    public final float mo74799g() {
        return this.f53557f;
    }

    /* renamed from: h */
    public final boolean mo74800h() {
        return this.f53558g;
    }

    /* renamed from: i */
    public final boolean mo74801i() {
        return this.f53559h;
    }
}

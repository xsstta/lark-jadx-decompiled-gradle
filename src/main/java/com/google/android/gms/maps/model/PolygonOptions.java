package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C22059t();

    /* renamed from: a */
    private final List<LatLng> f53603a;

    /* renamed from: b */
    private final List<List<LatLng>> f53604b;

    /* renamed from: c */
    private float f53605c;

    /* renamed from: d */
    private int f53606d;

    /* renamed from: e */
    private int f53607e;

    /* renamed from: f */
    private float f53608f;

    /* renamed from: g */
    private boolean f53609g;

    /* renamed from: h */
    private boolean f53610h;

    /* renamed from: i */
    private boolean f53611i;

    /* renamed from: j */
    private int f53612j;

    /* renamed from: k */
    private List<PatternItem> f53613k;

    public PolygonOptions() {
        this.f53605c = 10.0f;
        this.f53606d = -16777216;
        this.f53609g = true;
        this.f53603a = new ArrayList();
        this.f53604b = new ArrayList();
    }

    PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f53605c = 10.0f;
        this.f53606d = -16777216;
        this.f53609g = true;
        this.f53603a = list;
        this.f53604b = list2;
        this.f53605c = f;
        this.f53606d = i;
        this.f53607e = i2;
        this.f53608f = f2;
        this.f53609g = z;
        this.f53610h = z2;
        this.f53611i = z3;
        this.f53612j = i3;
        this.f53613k = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, mo74847a(), false);
        SafeParcelWriter.writeList(parcel, 3, this.f53604b, false);
        SafeParcelWriter.writeFloat(parcel, 4, mo74848b());
        SafeParcelWriter.writeInt(parcel, 5, mo74849c());
        SafeParcelWriter.writeInt(parcel, 6, mo74852f());
        SafeParcelWriter.writeFloat(parcel, 7, mo74853g());
        SafeParcelWriter.writeBoolean(parcel, 8, mo74854h());
        SafeParcelWriter.writeBoolean(parcel, 9, mo74855i());
        SafeParcelWriter.writeBoolean(parcel, 10, mo74856j());
        SafeParcelWriter.writeInt(parcel, 11, mo74850d());
        SafeParcelWriter.writeTypedList(parcel, 12, mo74851e(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final List<LatLng> mo74847a() {
        return this.f53603a;
    }

    /* renamed from: b */
    public final float mo74848b() {
        return this.f53605c;
    }

    /* renamed from: c */
    public final int mo74849c() {
        return this.f53606d;
    }

    /* renamed from: d */
    public final int mo74850d() {
        return this.f53612j;
    }

    /* renamed from: e */
    public final List<PatternItem> mo74851e() {
        return this.f53613k;
    }

    /* renamed from: f */
    public final int mo74852f() {
        return this.f53607e;
    }

    /* renamed from: g */
    public final float mo74853g() {
        return this.f53608f;
    }

    /* renamed from: h */
    public final boolean mo74854h() {
        return this.f53609g;
    }

    /* renamed from: i */
    public final boolean mo74855i() {
        return this.f53610h;
    }

    /* renamed from: j */
    public final boolean mo74856j() {
        return this.f53611i;
    }
}

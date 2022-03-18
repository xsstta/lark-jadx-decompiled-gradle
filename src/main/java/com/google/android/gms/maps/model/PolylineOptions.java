package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C22060u();

    /* renamed from: a */
    private final List<LatLng> f53614a;

    /* renamed from: b */
    private float f53615b;

    /* renamed from: c */
    private int f53616c;

    /* renamed from: d */
    private float f53617d;

    /* renamed from: e */
    private boolean f53618e;

    /* renamed from: f */
    private boolean f53619f;

    /* renamed from: g */
    private boolean f53620g;

    /* renamed from: h */
    private Cap f53621h;

    /* renamed from: i */
    private Cap f53622i;

    /* renamed from: j */
    private int f53623j;

    /* renamed from: k */
    private List<PatternItem> f53624k;

    public PolylineOptions() {
        this.f53615b = 10.0f;
        this.f53616c = -16777216;
        this.f53618e = true;
        this.f53621h = new ButtCap();
        this.f53622i = new ButtCap();
        this.f53623j = 0;
        this.f53624k = null;
        this.f53614a = new ArrayList();
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f53615b = 10.0f;
        this.f53616c = -16777216;
        this.f53618e = true;
        this.f53621h = new ButtCap();
        this.f53622i = new ButtCap();
        this.f53623j = 0;
        this.f53624k = null;
        this.f53614a = list;
        this.f53615b = f;
        this.f53616c = i;
        this.f53617d = f2;
        this.f53618e = z;
        this.f53619f = z2;
        this.f53620g = z3;
        if (cap != null) {
            this.f53621h = cap;
        }
        if (cap2 != null) {
            this.f53622i = cap2;
        }
        this.f53623j = i2;
        this.f53624k = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, mo74858a(), false);
        SafeParcelWriter.writeFloat(parcel, 3, mo74859b());
        SafeParcelWriter.writeInt(parcel, 4, mo74860c());
        SafeParcelWriter.writeFloat(parcel, 5, mo74865h());
        SafeParcelWriter.writeBoolean(parcel, 6, mo74866i());
        SafeParcelWriter.writeBoolean(parcel, 7, mo74867j());
        SafeParcelWriter.writeBoolean(parcel, 8, mo74868k());
        SafeParcelWriter.writeParcelable(parcel, 9, mo74861d(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, mo74862e(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, mo74863f());
        SafeParcelWriter.writeTypedList(parcel, 12, mo74864g(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    public final List<LatLng> mo74858a() {
        return this.f53614a;
    }

    /* renamed from: b */
    public final float mo74859b() {
        return this.f53615b;
    }

    /* renamed from: c */
    public final int mo74860c() {
        return this.f53616c;
    }

    /* renamed from: d */
    public final Cap mo74861d() {
        return this.f53621h;
    }

    /* renamed from: e */
    public final Cap mo74862e() {
        return this.f53622i;
    }

    /* renamed from: f */
    public final int mo74863f() {
        return this.f53623j;
    }

    /* renamed from: g */
    public final List<PatternItem> mo74864g() {
        return this.f53624k;
    }

    /* renamed from: h */
    public final float mo74865h() {
        return this.f53617d;
    }

    /* renamed from: i */
    public final boolean mo74866i() {
        return this.f53618e;
    }

    /* renamed from: j */
    public final boolean mo74867j() {
        return this.f53619f;
    }

    /* renamed from: k */
    public final boolean mo74868k() {
        return this.f53620g;
    }
}

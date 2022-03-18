package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.C22026c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C22031l();

    /* renamed from: a */
    private StreetViewPanoramaCamera f53498a;

    /* renamed from: b */
    private String f53499b;

    /* renamed from: c */
    private LatLng f53500c;

    /* renamed from: d */
    private Integer f53501d;

    /* renamed from: e */
    private Boolean f53502e = true;

    /* renamed from: f */
    private Boolean f53503f = true;

    /* renamed from: g */
    private Boolean f53504g = true;

    /* renamed from: h */
    private Boolean f53505h = true;

    /* renamed from: i */
    private Boolean f53506i;

    /* renamed from: j */
    private StreetViewSource f53507j = StreetViewSource.f53638a;

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f53498a = streetViewPanoramaCamera;
        this.f53500c = latLng;
        this.f53501d = num;
        this.f53499b = str;
        this.f53502e = C22026c.m79513a(b);
        this.f53503f = C22026c.m79513a(b2);
        this.f53504g = C22026c.m79513a(b3);
        this.f53505h = C22026c.m79513a(b4);
        this.f53506i = C22026c.m79513a(b5);
        this.f53507j = streetViewSource;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo74516a(), i, false);
        SafeParcelWriter.writeString(parcel, 3, mo74520e(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo74517b(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, mo74518c(), false);
        SafeParcelWriter.writeByte(parcel, 6, C22026c.m79512a(this.f53502e));
        SafeParcelWriter.writeByte(parcel, 7, C22026c.m79512a(this.f53503f));
        SafeParcelWriter.writeByte(parcel, 8, C22026c.m79512a(this.f53504g));
        SafeParcelWriter.writeByte(parcel, 9, C22026c.m79512a(this.f53505h));
        SafeParcelWriter.writeByte(parcel, 10, C22026c.m79512a(this.f53506i));
        SafeParcelWriter.writeParcelable(parcel, 11, mo74519d(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StreetViewPanoramaOptions() {
    }

    /* renamed from: a */
    public final StreetViewPanoramaCamera mo74516a() {
        return this.f53498a;
    }

    /* renamed from: b */
    public final LatLng mo74517b() {
        return this.f53500c;
    }

    /* renamed from: c */
    public final Integer mo74518c() {
        return this.f53501d;
    }

    /* renamed from: d */
    public final StreetViewSource mo74519d() {
        return this.f53507j;
    }

    /* renamed from: e */
    public final String mo74520e() {
        return this.f53499b;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.f53499b).add("Position", this.f53500c).add("Radius", this.f53501d).add("Source", this.f53507j).add("StreetViewPanoramaCamera", this.f53498a).add("UserNavigationEnabled", this.f53502e).add("ZoomGesturesEnabled", this.f53503f).add("PanningGesturesEnabled", this.f53504g).add("StreetNamesEnabled", this.f53505h).add("UseViewLifecycleInFragment", this.f53506i).toString();
    }
}

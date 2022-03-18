package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C22039ad();

    /* renamed from: a */
    public final LatLng f53651a;

    /* renamed from: b */
    public final LatLng f53652b;

    /* renamed from: c */
    public final LatLng f53653c;

    /* renamed from: d */
    public final LatLng f53654d;

    /* renamed from: e */
    public final LatLngBounds f53655e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f53651a = latLng;
        this.f53652b = latLng2;
        this.f53653c = latLng3;
        this.f53654d = latLng4;
        this.f53655e = latLngBounds;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53651a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53652b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f53653c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f53654d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f53655e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f53651a, this.f53652b, this.f53653c, this.f53654d, this.f53655e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f53651a.equals(visibleRegion.f53651a) && this.f53652b.equals(visibleRegion.f53652b) && this.f53653c.equals(visibleRegion.f53653c) && this.f53654d.equals(visibleRegion.f53654d) && this.f53655e.equals(visibleRegion.f53655e);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("nearLeft", this.f53651a).add("nearRight", this.f53652b).add("farLeft", this.f53653c).add("farRight", this.f53654d).add("latLngBounds", this.f53655e).toString();
    }
}

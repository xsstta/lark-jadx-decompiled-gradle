package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C22063x();

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f53631a;

    /* renamed from: b */
    public final LatLng f53632b;

    /* renamed from: c */
    public final String f53633c;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f53631a = streetViewPanoramaLinkArr;
        this.f53632b = latLng;
        this.f53633c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f53631a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53632b, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f53633c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(this.f53632b, this.f53633c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f53633c.equals(streetViewPanoramaLocation.f53633c) && this.f53632b.equals(streetViewPanoramaLocation.f53632b);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f53633c).add("position", this.f53632b.toString()).toString();
    }
}

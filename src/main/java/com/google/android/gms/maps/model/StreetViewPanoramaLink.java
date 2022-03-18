package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C22062w();

    /* renamed from: a */
    public final String f53629a;

    /* renamed from: b */
    public final float f53630b;

    public StreetViewPanoramaLink(String str, float f) {
        this.f53629a = str;
        this.f53630b = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f53629a, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f53630b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(this.f53629a, Float.valueOf(this.f53630b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f53629a.equals(streetViewPanoramaLink.f53629a) && Float.floatToIntBits(this.f53630b) == Float.floatToIntBits(streetViewPanoramaLink.f53630b);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f53629a).add("bearing", Float.valueOf(this.f53630b)).toString();
    }
}

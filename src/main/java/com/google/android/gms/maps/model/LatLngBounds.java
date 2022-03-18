package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C22053n();

    /* renamed from: a */
    public final LatLng f53579a;

    /* renamed from: b */
    public final LatLng f53580b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "null southwest");
        Preconditions.checkNotNull(latLng2, "null northeast");
        Preconditions.checkArgument(latLng2.f53577a >= latLng.f53577a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f53577a), Double.valueOf(latLng2.f53577a));
        this.f53579a = latLng;
        this.f53580b = latLng2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53579a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53580b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f53579a, this.f53580b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f53579a.equals(latLngBounds.f53579a) && this.f53580b.equals(latLngBounds.f53580b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("southwest", this.f53579a).add("northeast", this.f53580b).toString();
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C22054o();

    /* renamed from: a */
    public final double f53577a;

    /* renamed from: b */
    public final double f53578b;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f53578b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f53578b = d2;
        }
        this.f53577a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.f53577a);
        SafeParcelWriter.writeDouble(parcel, 3, this.f53578b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53577a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53578b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f53577a) == Double.doubleToLongBits(latLng.f53577a) && Double.doubleToLongBits(this.f53578b) == Double.doubleToLongBits(latLng.f53578b);
    }

    public final String toString() {
        double d = this.f53577a;
        double d2 = this.f53578b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C22065z();

    /* renamed from: a */
    public static final StreetViewSource f53638a = new StreetViewSource(0);

    /* renamed from: b */
    public static final StreetViewSource f53639b = new StreetViewSource(1);

    /* renamed from: c */
    private static final String f53640c = "StreetViewSource";

    /* renamed from: d */
    private final int f53641d;

    public StreetViewSource(int i) {
        this.f53641d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f53641d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53641d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f53641d == ((StreetViewSource) obj).f53641d;
    }

    public final String toString() {
        String str;
        int i = this.f53641d;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", Integer.valueOf(i));
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", str);
    }
}

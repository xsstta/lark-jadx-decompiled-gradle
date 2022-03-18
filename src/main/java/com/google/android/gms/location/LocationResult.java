package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C21957l();

    /* renamed from: a */
    static final List<Location> f53410a = Collections.emptyList();

    /* renamed from: b */
    private final List<Location> f53411b;

    LocationResult(List<Location> list) {
        this.f53411b = list;
    }

    /* renamed from: a */
    public final Location mo74328a() {
        int size = this.f53411b.size();
        if (size == 0) {
            return null;
        }
        return this.f53411b.get(size - 1);
    }

    /* renamed from: b */
    public final List<Location> mo74329b() {
        return this.f53411b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f53411b.size() != this.f53411b.size()) {
            return false;
        }
        Iterator<Location> it = this.f53411b.iterator();
        for (Location location : locationResult.f53411b) {
            if (it.next().getTime() != location.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location location : this.f53411b) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f53411b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, mo74329b(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

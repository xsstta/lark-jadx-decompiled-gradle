package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C21955j();

    /* renamed from: a */
    private int f53397a;

    /* renamed from: b */
    private int f53398b;

    /* renamed from: c */
    private long f53399c;

    /* renamed from: d */
    private int f53400d;

    /* renamed from: e */
    private zzaj[] f53401e;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f53400d = i;
        this.f53397a = i2;
        this.f53398b = i3;
        this.f53399c = j;
        this.f53401e = zzajArr;
    }

    /* renamed from: a */
    public final boolean mo74313a() {
        return this.f53400d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f53397a == locationAvailability.f53397a && this.f53398b == locationAvailability.f53398b && this.f53399c == locationAvailability.f53399c && this.f53400d == locationAvailability.f53400d && Arrays.equals(this.f53401e, locationAvailability.f53401e);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53400d), Integer.valueOf(this.f53397a), Integer.valueOf(this.f53398b), Long.valueOf(this.f53399c), this.f53401e);
    }

    public final String toString() {
        boolean a = mo74313a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53397a);
        SafeParcelWriter.writeInt(parcel, 2, this.f53398b);
        SafeParcelWriter.writeLong(parcel, 3, this.f53399c);
        SafeParcelWriter.writeInt(parcel, 4, this.f53400d);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f53401e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

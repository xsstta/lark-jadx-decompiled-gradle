package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C21964r();

    /* renamed from: a */
    private final int f53444a;

    /* renamed from: b */
    private final int f53445b;

    /* renamed from: c */
    private final long f53446c;

    /* renamed from: d */
    private final long f53447d;

    zzaj(int i, int i2, long j, long j2) {
        this.f53444a = i;
        this.f53445b = i2;
        this.f53446c = j;
        this.f53447d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f53444a == zzaj.f53444a && this.f53445b == zzaj.f53445b && this.f53446c == zzaj.f53446c && this.f53447d == zzaj.f53447d;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53445b), Integer.valueOf(this.f53444a), Long.valueOf(this.f53447d), Long.valueOf(this.f53446c));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f53444a + " Cell status: " + this.f53445b + " elapsed time NS: " + this.f53447d + " system time ms: " + this.f53446c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53444a);
        SafeParcelWriter.writeInt(parcel, 2, this.f53445b);
        SafeParcelWriter.writeLong(parcel, 3, this.f53446c);
        SafeParcelWriter.writeLong(parcel, 4, this.f53447d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

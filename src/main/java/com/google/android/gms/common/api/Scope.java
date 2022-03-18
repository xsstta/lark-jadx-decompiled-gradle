package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C21698p();

    /* renamed from: a */
    private final int f52558a;

    /* renamed from: b */
    private final String f52559b;

    Scope(int i, String str) {
        Preconditions.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.f52558a = i;
        this.f52559b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public final String mo73201a() {
        return this.f52559b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f52559b.equals(((Scope) obj).f52559b);
    }

    public final int hashCode() {
        return this.f52559b.hashCode();
    }

    public final String toString() {
        return this.f52559b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52558a);
        SafeParcelWriter.writeString(parcel, 2, mo73201a(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

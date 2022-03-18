package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C21863b();

    /* renamed from: a */
    private final int f53284a = 1;

    /* renamed from: b */
    private final String f53285b;

    zzad(int i, String str) {
        this.f53285b = (String) Preconditions.checkNotNull(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53284a);
        SafeParcelWriter.writeString(parcel, 2, this.f53285b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

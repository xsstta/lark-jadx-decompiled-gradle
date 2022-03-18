package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C21883v();

    /* renamed from: a */
    private final int f53293a = 1;

    /* renamed from: b */
    private final String f53294b;

    zzv(int i, String str) {
        this.f53294b = (String) Preconditions.checkNotNull(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53293a);
        SafeParcelWriter.writeString(parcel, 2, this.f53294b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

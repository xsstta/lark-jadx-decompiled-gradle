package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C21862a();

    /* renamed from: a */
    private final int f53281a = 1;

    /* renamed from: b */
    private final String f53282b;

    /* renamed from: c */
    private final int f53283c;

    zzab(int i, String str, int i2) {
        this.f53282b = (String) Preconditions.checkNotNull(str);
        this.f53283c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53281a);
        SafeParcelWriter.writeString(parcel, 2, this.f53282b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f53283c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

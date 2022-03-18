package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C21864c();

    /* renamed from: a */
    private final int f53286a = 1;

    /* renamed from: b */
    private final String f53287b;

    /* renamed from: c */
    private final byte[] f53288c;

    zzaf(int i, String str, byte[] bArr) {
        this.f53287b = (String) Preconditions.checkNotNull(str);
        this.f53288c = (byte[]) Preconditions.checkNotNull(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53286a);
        SafeParcelWriter.writeString(parcel, 2, this.f53287b, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f53288c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

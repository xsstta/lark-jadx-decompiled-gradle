package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C21959n();

    /* renamed from: a */
    private final String f53441a;

    /* renamed from: b */
    private final String f53442b;

    /* renamed from: c */
    private final String f53443c;

    zzae(String str, String str2, String str3) {
        this.f53443c = str;
        this.f53441a = str2;
        this.f53442b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f53441a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f53442b, false);
        SafeParcelWriter.writeString(parcel, 5, this.f53443c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

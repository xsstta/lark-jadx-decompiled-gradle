package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C21798j();

    /* renamed from: a */
    final String f53173a;

    /* renamed from: b */
    final FastJsonResponse.Field<?, ?> f53174b;

    /* renamed from: c */
    private final int f53175c;

    zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f53175c = i;
        this.f53173a = str;
        this.f53174b = field;
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f53175c = 1;
        this.f53173a = str;
        this.f53174b = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53175c);
        SafeParcelWriter.writeString(parcel, 2, this.f53173a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53174b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

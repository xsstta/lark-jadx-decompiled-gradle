package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzad extends AbstractSafeParcelable implements AbstractC21641i {
    public static final Parcelable.Creator<zzad> CREATOR = new C21914b();

    /* renamed from: a */
    private static final zzad f53337a = new zzad(Status.RESULT_SUCCESS);

    /* renamed from: b */
    private final Status f53338b;

    public zzad(Status status) {
        this.f53338b = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53338b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

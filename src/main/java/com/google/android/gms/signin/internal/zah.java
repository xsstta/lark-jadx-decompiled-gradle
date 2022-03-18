package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new C22074c();

    /* renamed from: a */
    private final int f53693a;

    /* renamed from: b */
    private final ResolveAccountRequest f53694b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f53693a = i;
        this.f53694b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53693a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53694b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C21865d();

    /* renamed from: a */
    private final int f53289a = 1;

    /* renamed from: b */
    private final String f53290b;

    /* renamed from: c */
    private final PendingIntent f53291c;

    zzah(int i, String str, PendingIntent pendingIntent) {
        this.f53290b = (String) Preconditions.checkNotNull(str);
        this.f53291c = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53289a);
        SafeParcelWriter.writeString(parcel, 2, this.f53290b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53291c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

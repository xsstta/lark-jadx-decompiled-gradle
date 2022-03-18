package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C21965s();

    /* renamed from: a */
    private final List<String> f53448a;

    /* renamed from: b */
    private final PendingIntent f53449b;

    /* renamed from: c */
    private final String f53450c;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f53448a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f53449b = pendingIntent;
        this.f53450c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f53448a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53449b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f53450c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

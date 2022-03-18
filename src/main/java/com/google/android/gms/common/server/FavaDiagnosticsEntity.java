package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C21783a();

    /* renamed from: a */
    private final int f53123a;

    /* renamed from: b */
    private final String f53124b;

    /* renamed from: c */
    private final int f53125c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f53123a = i;
        this.f53124b = str;
        this.f53125c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53123a);
        SafeParcelWriter.writeString(parcel, 2, this.f53124b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f53125c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

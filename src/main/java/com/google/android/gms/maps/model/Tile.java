package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new C22036aa();

    /* renamed from: a */
    public final int f53642a;

    /* renamed from: b */
    public final int f53643b;

    /* renamed from: c */
    public final byte[] f53644c;

    public Tile(int i, int i2, byte[] bArr) {
        this.f53642a = i;
        this.f53643b = i2;
        this.f53644c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f53642a);
        SafeParcelWriter.writeInt(parcel, 3, this.f53643b);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f53644c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

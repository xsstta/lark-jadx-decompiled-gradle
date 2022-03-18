package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C22055p();

    /* renamed from: a */
    private static final String f53581a = "MapStyleOptions";

    /* renamed from: b */
    private String f53582b;

    public MapStyleOptions(String str) {
        this.f53582b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f53582b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

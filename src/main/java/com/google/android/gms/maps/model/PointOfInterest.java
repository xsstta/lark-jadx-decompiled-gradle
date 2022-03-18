package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C22058s();

    /* renamed from: a */
    public final LatLng f53600a;

    /* renamed from: b */
    public final String f53601b;

    /* renamed from: c */
    public final String f53602c;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f53600a = latLng;
        this.f53601b = str;
        this.f53602c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53600a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f53601b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f53602c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

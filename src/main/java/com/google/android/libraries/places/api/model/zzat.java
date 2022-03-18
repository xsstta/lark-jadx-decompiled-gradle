package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class zzat extends zzr {
    public static final Parcelable.Creator<zzat> CREATOR = new zzas();

    public final int describeContents() {
        return 0;
    }

    zzat(Place place, double d) {
        super(place, d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPlace(), i);
        parcel.writeDouble(getLikelihood());
    }
}

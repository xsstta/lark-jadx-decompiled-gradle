package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzan extends zzl {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();

    public final int describeContents() {
        return 0;
    }

    zzan(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getOpen(), i);
        parcel.writeParcelable(getClose(), i);
    }
}

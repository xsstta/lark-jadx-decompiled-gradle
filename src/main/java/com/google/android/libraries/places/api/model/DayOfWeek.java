package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public enum DayOfWeek implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    
    public static final Parcelable.Creator<DayOfWeek> CREATOR = new zzbb();

    public final int describeContents() {
        return 0;
    }

    static DayOfWeek zza(Parcel parcel) {
        return valueOf(parcel.readString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

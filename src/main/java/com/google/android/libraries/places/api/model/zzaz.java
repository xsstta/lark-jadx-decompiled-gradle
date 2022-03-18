package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class zzaz extends zzx {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzay();

    public final int describeContents() {
        return 0;
    }

    zzaz(DayOfWeek dayOfWeek, LocalTime localTime) {
        super(dayOfWeek, localTime);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDay(), i);
        parcel.writeParcelable(getTime(), i);
    }
}

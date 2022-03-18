package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzay implements Parcelable.Creator<zzaz> {
    zzay() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz[] newArray(int i) {
        return new zzaz[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz createFromParcel(Parcel parcel) {
        return new zzaz((DayOfWeek) parcel.readParcelable(TimeOfWeek.class.getClassLoader()), (LocalTime) parcel.readParcelable(TimeOfWeek.class.getClassLoader()));
    }
}

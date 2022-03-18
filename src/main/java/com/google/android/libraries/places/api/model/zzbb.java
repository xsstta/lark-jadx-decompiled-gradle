package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbb implements Parcelable.Creator<DayOfWeek> {
    zzbb() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DayOfWeek[] newArray(int i) {
        return new DayOfWeek[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DayOfWeek createFromParcel(Parcel parcel) {
        return DayOfWeek.zza(parcel);
    }
}

package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzak implements Parcelable.Creator<zzal> {
    zzak() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i) {
        return new zzal[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal createFromParcel(Parcel parcel) {
        return new zzal(parcel.readArrayList(OpeningHours.class.getClassLoader()), parcel.readArrayList(OpeningHours.class.getClassLoader()));
    }
}

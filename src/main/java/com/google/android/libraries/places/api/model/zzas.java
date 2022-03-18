package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzas implements Parcelable.Creator<zzat> {
    zzas() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzat[] newArray(int i) {
        return new zzat[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzat createFromParcel(Parcel parcel) {
        return new zzat((Place) parcel.readParcelable(PlaceLikelihood.class.getClassLoader()), parcel.readDouble());
    }
}

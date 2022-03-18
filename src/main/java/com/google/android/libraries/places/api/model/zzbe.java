package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

final class zzbe implements Parcelable.Creator<Place.Type> {
    zzbe() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Place.Type[] newArray(int i) {
        return new Place.Type[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Place.Type createFromParcel(Parcel parcel) {
        return Place.Type.valueOf(parcel.readString());
    }
}

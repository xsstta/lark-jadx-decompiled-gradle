package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

final class zzbd implements Parcelable.Creator<Place.Field> {
    zzbd() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Place.Field[] newArray(int i) {
        return new Place.Field[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Place.Field createFromParcel(Parcel parcel) {
        return Place.Field.valueOf(parcel.readString());
    }
}

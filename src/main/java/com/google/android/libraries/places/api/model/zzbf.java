package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbf implements Parcelable.Creator<TypeFilter> {
    zzbf() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TypeFilter[] newArray(int i) {
        return new TypeFilter[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TypeFilter createFromParcel(Parcel parcel) {
        return TypeFilter.valueOf(parcel.readString());
    }
}

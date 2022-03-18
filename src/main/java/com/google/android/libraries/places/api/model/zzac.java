package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzac implements Parcelable.Creator<zzad> {
    zzac() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i) {
        return new zzad[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad createFromParcel(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            num = Integer.valueOf(parcel.readInt());
        } else {
            num = null;
        }
        return new zzad(readString, num, parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(AutocompletePrediction.class.getClassLoader()));
    }
}

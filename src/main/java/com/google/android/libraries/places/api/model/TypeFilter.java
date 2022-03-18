package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;
    
    public static final Parcelable.Creator<TypeFilter> CREATOR = new zzbf();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

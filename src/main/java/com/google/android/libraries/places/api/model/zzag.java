package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

final class zzag implements Parcelable.Creator<zzah> {
    zzag() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah[] newArray(int i) {
        return new zzah[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah createFromParcel(Parcel parcel) {
        return new zzah((ParcelUuid) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader()));
    }
}

package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zza implements Parcelable.Creator<AutocompleteActivityMode> {
    zza() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteActivityMode[] newArray(int i) {
        return new AutocompleteActivityMode[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteActivityMode createFromParcel(Parcel parcel) {
        return AutocompleteActivityMode.valueOf(parcel.readString());
    }
}

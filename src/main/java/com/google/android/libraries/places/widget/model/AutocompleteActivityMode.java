package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

public enum AutocompleteActivityMode implements Parcelable {
    FULLSCREEN,
    OVERLAY;
    
    public static final Parcelable.Creator<AutocompleteActivityMode> CREATOR = new zza();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

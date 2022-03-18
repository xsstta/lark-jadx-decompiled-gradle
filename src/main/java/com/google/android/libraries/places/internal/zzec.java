package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

public enum zzec implements Parcelable {
    FRAGMENT,
    INTENT;
    
    public static final Parcelable.Creator<zzec> CREATOR = new zzeb();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

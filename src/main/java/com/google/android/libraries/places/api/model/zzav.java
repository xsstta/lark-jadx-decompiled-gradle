package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzav extends zzu {
    public static final Parcelable.Creator<zzav> CREATOR = new zzau();

    public final int describeContents() {
        return 0;
    }

    zzav(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getCompoundCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getCompoundCode());
        }
        if (getGlobalCode() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getGlobalCode());
    }
}

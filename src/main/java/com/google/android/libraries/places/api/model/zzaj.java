package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaj extends zzh {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzai();

    public final int describeContents() {
        return 0;
    }

    zzaj(int i, int i2) {
        super(i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}

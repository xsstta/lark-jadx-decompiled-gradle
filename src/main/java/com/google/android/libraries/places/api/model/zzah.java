package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

final class zzah extends zzi {
    public static final Parcelable.Creator<zzah> CREATOR = new zzag();

    public final int describeContents() {
        return 0;
    }

    zzah(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
    }
}

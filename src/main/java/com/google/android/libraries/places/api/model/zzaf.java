package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaf extends zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();

    public final int describeContents() {
        return 0;
    }

    zzaf(int i, int i2) {
        super(i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}

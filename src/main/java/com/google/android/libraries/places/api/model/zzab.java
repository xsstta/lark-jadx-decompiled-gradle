package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class zzab extends zzb {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();

    public final int describeContents() {
        return 0;
    }

    zzab(List<AddressComponent> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(asList());
    }
}

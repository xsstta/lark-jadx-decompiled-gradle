package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaa implements Parcelable.Creator<zzab> {
    zzaa() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab[] newArray(int i) {
        return new zzab[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab createFromParcel(Parcel parcel) {
        return new zzab(parcel.readArrayList(AddressComponents.class.getClassLoader()));
    }
}

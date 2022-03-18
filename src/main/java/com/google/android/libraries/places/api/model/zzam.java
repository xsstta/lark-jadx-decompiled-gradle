package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzam implements Parcelable.Creator<zzan> {
    zzam() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        return new zzan((TimeOfWeek) parcel.readParcelable(Period.class.getClassLoader()), (TimeOfWeek) parcel.readParcelable(Period.class.getClassLoader()));
    }
}

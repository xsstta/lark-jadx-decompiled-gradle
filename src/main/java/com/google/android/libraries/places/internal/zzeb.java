package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class zzeb implements Parcelable.Creator<zzec> {
    zzeb() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzec[] newArray(int i) {
        return new zzec[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzec createFromParcel(Parcel parcel) {
        return zzec.valueOf(parcel.readString());
    }
}

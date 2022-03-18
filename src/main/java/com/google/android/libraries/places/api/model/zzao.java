package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzao implements Parcelable.Creator<zzap> {
    zzao() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzap[] newArray(int i) {
        return new zzap[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzap createFromParcel(Parcel parcel) {
        return new zzap(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }
}

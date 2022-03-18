package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzai implements Parcelable.Creator<zzaj> {
    zzai() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj[] newArray(int i) {
        return new zzaj[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj createFromParcel(Parcel parcel) {
        return new zzaj(parcel.readInt(), parcel.readInt());
    }
}

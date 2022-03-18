package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class zzex implements Parcelable.Creator<zzey> {
    zzex() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzey[] newArray(int i) {
        return new zzey[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzey createFromParcel(Parcel parcel) {
        return new zzey(parcel, null);
    }
}

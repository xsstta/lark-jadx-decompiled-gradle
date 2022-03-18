package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzy implements Parcelable.Creator<zzz> {
    zzy() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i) {
        return new zzz[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz createFromParcel(Parcel parcel) {
        String str;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        return new zzz(readString, str, parcel.readArrayList(AddressComponent.class.getClassLoader()));
    }
}

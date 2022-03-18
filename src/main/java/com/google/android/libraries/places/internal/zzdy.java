package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Collection;

final class zzdy implements Parcelable.Creator<zzdv> {
    zzdy() {
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdv[] newArray(int i) {
        return new zzdv[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdv createFromParcel(Parcel parcel) {
        String str;
        String str2;
        AutocompleteActivityMode autocompleteActivityMode = (AutocompleteActivityMode) parcel.readParcelable(zzed.class.getClassLoader());
        zzgi zza = zzgi.zza((Collection) parcel.readArrayList(Place.Field.class.getClassLoader()));
        zzec zzec = (zzec) parcel.readParcelable(zzed.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        } else {
            str2 = null;
        }
        return new zzdv(autocompleteActivityMode, zza, zzec, str, str2, (LocationBias) parcel.readParcelable(zzed.class.getClassLoader()), (LocationRestriction) parcel.readParcelable(zzed.class.getClassLoader()), zzgi.zza((Collection) parcel.readArrayList(String.class.getClassLoader())), (TypeFilter) parcel.readParcelable(zzed.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}

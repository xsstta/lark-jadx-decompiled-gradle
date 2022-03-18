package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class zzal extends zzj {
    public static final Parcelable.Creator<zzal> CREATOR = new zzak();

    public final int describeContents() {
        return 0;
    }

    zzal(List<Period> list, List<String> list2) {
        super(list, list2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPeriods());
        parcel.writeList(getWeekdayText());
    }
}

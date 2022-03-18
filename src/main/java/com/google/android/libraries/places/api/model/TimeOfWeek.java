package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

public abstract class TimeOfWeek implements Parcelable {
    public abstract DayOfWeek getDay();

    public abstract LocalTime getTime();

    public static TimeOfWeek newInstance(DayOfWeek dayOfWeek, LocalTime localTime) {
        return new zzaz(dayOfWeek, localTime);
    }
}

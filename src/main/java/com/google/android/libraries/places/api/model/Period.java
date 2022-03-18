package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

public abstract class Period implements Parcelable {

    public static abstract class Builder {
        public abstract Period build();

        public abstract Builder setClose(TimeOfWeek timeOfWeek);

        public abstract Builder setOpen(TimeOfWeek timeOfWeek);
    }

    public abstract TimeOfWeek getClose();

    public abstract TimeOfWeek getOpen();

    public static Builder builder() {
        return new zzo();
    }
}

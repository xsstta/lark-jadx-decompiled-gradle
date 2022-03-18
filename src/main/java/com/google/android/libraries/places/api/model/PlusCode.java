package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

public abstract class PlusCode implements Parcelable {

    public static abstract class Builder {
        public abstract PlusCode build();

        public abstract Builder setCompoundCode(String str);

        public abstract Builder setGlobalCode(String str);
    }

    public abstract String getCompoundCode();

    public abstract String getGlobalCode();

    public static Builder builder() {
        return new zzt();
    }
}

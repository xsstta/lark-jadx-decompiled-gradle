package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

public abstract class AddressComponents implements Parcelable {
    public abstract List<AddressComponent> asList();

    public static AddressComponents newInstance(List<AddressComponent> list) {
        return new zzab(list);
    }
}

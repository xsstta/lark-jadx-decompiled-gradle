package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

public abstract class AutocompleteSessionToken implements Parcelable {
    /* access modifiers changed from: package-private */
    public abstract ParcelUuid zza();

    public static AutocompleteSessionToken newInstance() {
        return new zzah(new ParcelUuid(UUID.randomUUID()));
    }

    public final String toString() {
        return zza().toString();
    }
}

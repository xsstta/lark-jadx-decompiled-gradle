package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzi extends AutocompleteSessionToken {
    private final ParcelUuid zza;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompleteSessionToken
    public final ParcelUuid zza() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    zzi(ParcelUuid parcelUuid) {
        Objects.requireNonNull(parcelUuid, "Null UUID");
        this.zza = parcelUuid;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompleteSessionToken) {
            return this.zza.equals(((AutocompleteSessionToken) obj).zza());
        }
        return false;
    }
}

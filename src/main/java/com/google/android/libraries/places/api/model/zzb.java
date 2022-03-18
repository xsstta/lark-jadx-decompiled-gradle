package com.google.android.libraries.places.api.model;

import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzb extends AddressComponents {
    private final List<AddressComponent> zza;

    @Override // com.google.android.libraries.places.api.model.AddressComponents
    public List<AddressComponent> asList() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("AddressComponents{asList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    zzb(List<AddressComponent> list) {
        Objects.requireNonNull(list, "Null asList");
        this.zza = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponents) {
            return this.zza.equals(((AddressComponents) obj).asList());
        }
        return false;
    }
}

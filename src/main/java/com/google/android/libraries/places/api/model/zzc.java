package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;
import java.util.Objects;

final class zzc extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List<String> zzc;

    zzc() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" name");
        }
        if (this.zzc == null) {
            str2 = String.valueOf(str2).concat(" types");
        }
        if (str2.isEmpty()) {
            return new zzz(this.zza, this.zzb, this.zzc);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(String str) {
        this.zzb = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder zza(String str) {
        Objects.requireNonNull(str, "Null name");
        this.zza = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder zza(List<String> list) {
        Objects.requireNonNull(list, "Null types");
        this.zzc = list;
        return this;
    }
}

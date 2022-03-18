package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;

/* access modifiers changed from: package-private */
public final class zzf extends zzba {
    private Integer zza;
    private Integer zzb;

    zzf() {
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final AutocompletePrediction.zza zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" offset");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" length");
        }
        if (str2.isEmpty()) {
            return new zzaf(this.zza.intValue(), this.zzb.intValue());
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }
}

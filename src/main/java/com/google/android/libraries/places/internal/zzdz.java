package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class zzdz extends zzee {
    private zzeh zza;
    private String zzb;
    private zzgi<AutocompletePrediction> zzc;
    private Place zzd;
    private AutocompletePrediction zze;
    private Status zzf;

    zzdz() {
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzef zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" type");
        }
        if (str2.isEmpty()) {
            return new zzdx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzee zza(Status status) {
        this.zzf = status;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzee zza(AutocompletePrediction autocompletePrediction) {
        this.zze = autocompletePrediction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzee zza(Place place) {
        this.zzd = place;
        return this;
    }

    public final zzee zza(zzeh zzeh) {
        Objects.requireNonNull(zzeh, "Null type");
        this.zza = zzeh;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzee zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzee
    public final zzee zza(List<AutocompletePrediction> list) {
        zzgi<AutocompletePrediction> zzgi;
        if (list == null) {
            zzgi = null;
        } else {
            zzgi = zzgi.zza((Collection) list);
        }
        this.zzc = zzgi;
        return this;
    }
}

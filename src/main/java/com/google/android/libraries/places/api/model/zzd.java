package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class zzd extends AutocompletePrediction.Builder {
    private String zza;
    private Integer zzb;
    private List<Place.Type> zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private List<AutocompletePrediction.zza> zzg;
    private List<AutocompletePrediction.zza> zzh;
    private List<AutocompletePrediction.zza> zzi;

    zzd() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" placeId");
        }
        if (this.zzc == null) {
            str2 = String.valueOf(str2).concat(" placeTypes");
        }
        if (this.zzd == null) {
            str2 = String.valueOf(str2).concat(" fullText");
        }
        if (this.zze == null) {
            str2 = String.valueOf(str2).concat(" primaryText");
        }
        if (this.zzf == null) {
            str2 = String.valueOf(str2).concat(" secondaryText");
        }
        if (str2.isEmpty()) {
            return new zzad(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zza(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzb(List<AutocompletePrediction.zza> list) {
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzc(List<AutocompletePrediction.zza> list) {
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setFullText(String str) {
        Objects.requireNonNull(str, "Null fullText");
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPlaceTypes(List<Place.Type> list) {
        Objects.requireNonNull(list, "Null placeTypes");
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPrimaryText(String str) {
        Objects.requireNonNull(str, "Null primaryText");
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setSecondaryText(String str) {
        Objects.requireNonNull(str, "Null secondaryText");
        this.zzf = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zza(String str) {
        Objects.requireNonNull(str, "Null placeId");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zza(List<AutocompletePrediction.zza> list) {
        this.zzg = list;
        return this;
    }
}

package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

final class zzdw extends zzed.zza {
    private AutocompleteActivityMode zza;
    private zzgi<Place.Field> zzb;
    private zzec zzc;
    private String zzd;
    private String zze;
    private LocationBias zzf;
    private LocationRestriction zzg;
    private zzgi<String> zzh;
    private TypeFilter zzi;
    private Integer zzj;
    private Integer zzk;

    zzdw() {
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" mode");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" placeFields");
        }
        if (this.zzc == null) {
            str2 = String.valueOf(str2).concat(" origin");
        }
        if (this.zzh == null) {
            str2 = String.valueOf(str2).concat(" countries");
        }
        if (this.zzj == null) {
            str2 = String.valueOf(str2).concat(" primaryColor");
        }
        if (this.zzk == null) {
            str2 = String.valueOf(str2).concat(" primaryColorDark");
        }
        if (str2.isEmpty()) {
            return new zzdv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj.intValue(), this.zzk.intValue());
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(LocationBias locationBias) {
        this.zzf = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zzb(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(int i) {
        this.zzj = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zzb(int i) {
        this.zzk = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(LocationRestriction locationRestriction) {
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zzb(List<String> list) {
        this.zzh = zzgi.zza((Collection) list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(TypeFilter typeFilter) {
        this.zzi = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(zzec zzec) {
        Objects.requireNonNull(zzec, "Null origin");
        this.zzc = zzec;
        return this;
    }

    private zzdw(zzed zzed) {
        this.zza = zzed.zza();
        this.zzb = zzed.zzb();
        this.zzc = zzed.zzc();
        this.zzd = zzed.zzd();
        this.zze = zzed.zze();
        this.zzf = zzed.zzf();
        this.zzg = zzed.zzg();
        this.zzh = zzed.zzh();
        this.zzi = zzed.zzi();
        this.zzj = Integer.valueOf(zzed.zzj());
        this.zzk = Integer.valueOf(zzed.zzk());
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(AutocompleteActivityMode autocompleteActivityMode) {
        Objects.requireNonNull(autocompleteActivityMode, "Null mode");
        this.zza = autocompleteActivityMode;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzed.zza
    public final zzed.zza zza(List<Place.Field> list) {
        this.zzb = zzgi.zza((Collection) list);
        return this;
    }
}

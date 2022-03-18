package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzdu extends zzed {
    private final AutocompleteActivityMode zza;
    private final zzgi<Place.Field> zzb;
    private final zzec zzc;
    private final String zzd;
    private final String zze;
    private final LocationBias zzf;
    private final LocationRestriction zzg;
    private final zzgi<String> zzh;
    private final TypeFilter zzi;
    private final int zzj;
    private final int zzk;

    @Override // com.google.android.libraries.places.internal.zzed
    public final AutocompleteActivityMode zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final zzgi<Place.Field> zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final zzec zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final String zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final LocationBias zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final LocationRestriction zzg() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final zzgi<String> zzh() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final TypeFilter zzi() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final int zzj() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final int zzk() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzed
    public final zzed.zza zzl() {
        return new zzdw(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        String str = this.zzd;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str2 = this.zze;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        LocationBias locationBias = this.zzf;
        if (locationBias == null) {
            i3 = 0;
        } else {
            i3 = locationBias.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        if (locationRestriction == null) {
            i4 = 0;
        } else {
            i4 = locationRestriction.hashCode();
        }
        int hashCode2 = (((i8 ^ i4) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        if (typeFilter != null) {
            i5 = typeFilter.hashCode();
        }
        return ((((hashCode2 ^ i5) * 1000003) ^ this.zzj) * 1000003) ^ this.zzk;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String str = this.zzd;
        String str2 = this.zze;
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(this.zzg);
        String valueOf6 = String.valueOf(this.zzh);
        String valueOf7 = String.valueOf(this.zzi);
        int i = this.zzj;
        int i2 = this.zzk;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 189 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("AutocompleteOptions{mode=");
        sb.append(valueOf);
        sb.append(", placeFields=");
        sb.append(valueOf2);
        sb.append(", origin=");
        sb.append(valueOf3);
        sb.append(", initialQuery=");
        sb.append(str);
        sb.append(", hint=");
        sb.append(str2);
        sb.append(", locationBias=");
        sb.append(valueOf4);
        sb.append(", locationRestriction=");
        sb.append(valueOf5);
        sb.append(", countries=");
        sb.append(valueOf6);
        sb.append(", typeFilter=");
        sb.append(valueOf7);
        sb.append(", primaryColor=");
        sb.append(i);
        sb.append(", primaryColorDark=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzed) {
            zzed zzed = (zzed) obj;
            if (!this.zza.equals(zzed.zza()) || !this.zzb.equals(zzed.zzb()) || !this.zzc.equals(zzed.zzc()) || ((str = this.zzd) != null ? !str.equals(zzed.zzd()) : zzed.zzd() != null) || ((str2 = this.zze) != null ? !str2.equals(zzed.zze()) : zzed.zze() != null) || ((locationBias = this.zzf) != null ? !locationBias.equals(zzed.zzf()) : zzed.zzf() != null) || ((locationRestriction = this.zzg) != null ? !locationRestriction.equals(zzed.zzg()) : zzed.zzg() != null) || !this.zzh.equals(zzed.zzh()) || ((typeFilter = this.zzi) != null ? !typeFilter.equals(zzed.zzi()) : zzed.zzi() != null) || this.zzj != zzed.zzj() || this.zzk != zzed.zzk()) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzdu(AutocompleteActivityMode autocompleteActivityMode, zzgi<Place.Field> zzgi, zzec zzec, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zzgi<String> zzgi2, TypeFilter typeFilter, int i, int i2) {
        Objects.requireNonNull(autocompleteActivityMode, "Null mode");
        this.zza = autocompleteActivityMode;
        Objects.requireNonNull(zzgi, "Null placeFields");
        this.zzb = zzgi;
        Objects.requireNonNull(zzec, "Null origin");
        this.zzc = zzec;
        this.zzd = str;
        this.zze = str2;
        this.zzf = locationBias;
        this.zzg = locationRestriction;
        Objects.requireNonNull(zzgi2, "Null countries");
        this.zzh = zzgi2;
        this.zzi = typeFilter;
        this.zzj = i;
        this.zzk = i2;
    }
}

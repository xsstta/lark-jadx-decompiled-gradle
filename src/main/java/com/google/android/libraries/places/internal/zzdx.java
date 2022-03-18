package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;

final class zzdx extends zzef {
    private final zzeh zza;
    private final String zzb;
    private final zzgi<AutocompletePrediction> zzc;
    private final Place zzd;
    private final AutocompletePrediction zze;
    private final Status zzf;

    @Override // com.google.android.libraries.places.internal.zzef
    public final zzeh zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final zzgi<AutocompletePrediction> zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final Place zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final AutocompletePrediction zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final Status zzf() {
        return this.zzf;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        zzgi<AutocompletePrediction> zzgi = this.zzc;
        if (zzgi == null) {
            i2 = 0;
        } else {
            i2 = zzgi.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        Place place = this.zzd;
        if (place == null) {
            i3 = 0;
        } else {
            i3 = place.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        AutocompletePrediction autocompletePrediction = this.zze;
        if (autocompletePrediction == null) {
            i4 = 0;
        } else {
            i4 = autocompletePrediction.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        Status status = this.zzf;
        if (status != null) {
            i5 = status.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        String valueOf5 = String.valueOf(this.zzf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(str).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AutocompleteState{type=");
        sb.append(valueOf);
        sb.append(", query=");
        sb.append(str);
        sb.append(", predictions=");
        sb.append(valueOf2);
        sb.append(", place=");
        sb.append(valueOf3);
        sb.append(", prediction=");
        sb.append(valueOf4);
        sb.append(", status=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        zzgi<AutocompletePrediction> zzgi;
        Place place;
        AutocompletePrediction autocompletePrediction;
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzef) {
            zzef zzef = (zzef) obj;
            if (!this.zza.equals(zzef.zza()) || ((str = this.zzb) != null ? !str.equals(zzef.zzb()) : zzef.zzb() != null) || ((zzgi = this.zzc) != null ? !zzgi.equals(zzef.zzc()) : zzef.zzc() != null) || ((place = this.zzd) != null ? !place.equals(zzef.zzd()) : zzef.zzd() != null) || ((autocompletePrediction = this.zze) != null ? !autocompletePrediction.equals(zzef.zze()) : zzef.zze() != null) || ((status = this.zzf) != null ? !status.equals(zzef.zzf()) : zzef.zzf() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private zzdx(zzeh zzeh, String str, zzgi<AutocompletePrediction> zzgi, Place place, AutocompletePrediction autocompletePrediction, Status status) {
        this.zza = zzeh;
        this.zzb = str;
        this.zzc = zzgi;
        this.zzd = place;
        this.zze = autocompletePrediction;
        this.zzf = status;
    }
}

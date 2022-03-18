package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zze extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List<Place.Type> zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final List<AutocompletePrediction.zza> zzg;
    private final List<AutocompletePrediction.zza> zzh;
    private final List<AutocompletePrediction.zza> zzi;

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zza() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzb() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List<AutocompletePrediction.zza> zzd() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List<AutocompletePrediction.zza> zze() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List<AutocompletePrediction.zza> zzf() {
        return this.zzi;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        Integer num = this.zzb;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int hashCode2 = (((((((((hashCode ^ i) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003;
        List<AutocompletePrediction.zza> list = this.zzg;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.hashCode();
        }
        int i5 = (hashCode2 ^ i2) * 1000003;
        List<AutocompletePrediction.zza> list2 = this.zzh;
        if (list2 == null) {
            i3 = 0;
        } else {
            i3 = list2.hashCode();
        }
        int i6 = (i5 ^ i3) * 1000003;
        List<AutocompletePrediction.zza> list3 = this.zzi;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return i6 ^ i4;
    }

    public String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        String str3 = this.zze;
        String str4 = this.zzf;
        String valueOf3 = String.valueOf(this.zzg);
        String valueOf4 = String.valueOf(this.zzh);
        String valueOf5 = String.valueOf(this.zzi);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 195 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AutocompletePrediction{placeId=");
        sb.append(str);
        sb.append(", distanceMeters=");
        sb.append(valueOf);
        sb.append(", placeTypes=");
        sb.append(valueOf2);
        sb.append(", fullText=");
        sb.append(str2);
        sb.append(", primaryText=");
        sb.append(str3);
        sb.append(", secondaryText=");
        sb.append(str4);
        sb.append(", fullTextMatchedSubstrings=");
        sb.append(valueOf3);
        sb.append(", primaryTextMatchedSubstrings=");
        sb.append(valueOf4);
        sb.append(", secondaryTextMatchedSubstrings=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        Integer num;
        List<AutocompletePrediction.zza> list;
        List<AutocompletePrediction.zza> list2;
        List<AutocompletePrediction.zza> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (!this.zza.equals(autocompletePrediction.getPlaceId()) || ((num = this.zzb) != null ? !num.equals(autocompletePrediction.getDistanceMeters()) : autocompletePrediction.getDistanceMeters() != null) || !this.zzc.equals(autocompletePrediction.getPlaceTypes()) || !this.zzd.equals(autocompletePrediction.zza()) || !this.zze.equals(autocompletePrediction.zzb()) || !this.zzf.equals(autocompletePrediction.zzc()) || ((list = this.zzg) != null ? !list.equals(autocompletePrediction.zzd()) : autocompletePrediction.zzd() != null) || ((list2 = this.zzh) != null ? !list2.equals(autocompletePrediction.zze()) : autocompletePrediction.zze() != null) || ((list3 = this.zzi) != null ? !list3.equals(autocompletePrediction.zzf()) : autocompletePrediction.zzf() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    zze(String str, Integer num, List<Place.Type> list, String str2, String str3, String str4, List<AutocompletePrediction.zza> list2, List<AutocompletePrediction.zza> list3, List<AutocompletePrediction.zza> list4) {
        Objects.requireNonNull(str, "Null placeId");
        this.zza = str;
        this.zzb = num;
        Objects.requireNonNull(list, "Null placeTypes");
        this.zzc = list;
        Objects.requireNonNull(str2, "Null fullText");
        this.zzd = str2;
        Objects.requireNonNull(str3, "Null primaryText");
        this.zze = str3;
        Objects.requireNonNull(str4, "Null secondaryText");
        this.zzf = str4;
        this.zzg = list2;
        this.zzh = list3;
        this.zzi = list4;
    }
}

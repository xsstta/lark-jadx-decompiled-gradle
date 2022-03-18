package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;

/* access modifiers changed from: package-private */
public abstract class zzg extends AutocompletePrediction.zza {
    private final int zza;
    private final int zzb;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.zza
    public final int zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.zza
    public final int zzb() {
        return this.zzb;
    }

    public int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(54);
        sb.append("SubstringMatch{offset=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction.zza) {
            AutocompletePrediction.zza zza2 = (AutocompletePrediction.zza) obj;
            if (this.zza == zza2.zza() && this.zzb == zza2.zzb()) {
                return true;
            }
            return false;
        }
        return false;
    }

    zzg(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}

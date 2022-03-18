package com.google.android.libraries.places.api.model;

/* access modifiers changed from: package-private */
public abstract class zzh extends LocalTime {
    private final int zza;
    private final int zzb;

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public int getHours() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public int getMinutes() {
        return this.zzb;
    }

    public int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(49);
        sb.append("LocalTime{hours=");
        sb.append(i);
        sb.append(", minutes=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.zza == localTime.getHours() && this.zzb == localTime.getMinutes()) {
                return true;
            }
            return false;
        }
        return false;
    }

    zzh(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}

package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzdj;

final class zzdf extends zzdj {
    private final String zza;
    private final int zzb;
    private final zzdj.zzb zzc;

    @Override // com.google.android.libraries.places.internal.zzdj
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzdj
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzdj
    public final zzdj.zzb zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(valueOf).length());
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", requestSource=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdj) {
            zzdj zzdj = (zzdj) obj;
            if (!this.zza.equals(zzdj.zza()) || this.zzb != zzdj.zzb() || !this.zzc.equals(zzdj.zzc())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private zzdf(String str, int i, zzdj.zzb zzb2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzb2;
    }
}

package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzdj;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class zzdh extends zzdj.zza {
    private String zza;
    private Integer zzb;
    private zzdj.zzb zzc;

    zzdh() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzdj.zza
    public final zzdj zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" packageName");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" versionCode");
        }
        if (this.zzc == null) {
            str2 = String.valueOf(str2).concat(" requestSource");
        }
        if (str2.isEmpty()) {
            return new zzdf(this.zza, this.zzb.intValue(), this.zzc);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzdj.zza
    public final zzdj.zza zza(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzdj.zza
    public final zzdj.zza zza(zzdj.zzb zzb2) {
        Objects.requireNonNull(zzb2, "Null requestSource");
        this.zzc = zzb2;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzdj.zza
    public final zzdj.zza zza(String str) {
        Objects.requireNonNull(str, "Null packageName");
        this.zza = str;
        return this;
    }
}

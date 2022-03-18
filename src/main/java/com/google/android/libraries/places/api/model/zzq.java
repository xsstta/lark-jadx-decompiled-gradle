package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import java.util.Objects;

final class zzq extends PhotoMetadata.Builder {
    private String zza;
    private Integer zzb;
    private Integer zzc;
    private String zzd;

    zzq() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" attributions");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" height");
        }
        if (this.zzc == null) {
            str2 = String.valueOf(str2).concat(" width");
        }
        if (this.zzd == null) {
            str2 = String.valueOf(str2).concat(" photoReference");
        }
        if (str2.isEmpty()) {
            return new zzap(this.zza, this.zzb.intValue(), this.zzc.intValue(), this.zzd);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        Objects.requireNonNull(str, "Null attributions");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i) {
        this.zzc = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zza(String str) {
        Objects.requireNonNull(str, "Null photoReference");
        this.zzd = str;
        return this;
    }
}

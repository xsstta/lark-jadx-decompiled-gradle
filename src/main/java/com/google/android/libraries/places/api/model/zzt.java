package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PlusCode;

/* access modifiers changed from: package-private */
public final class zzt extends PlusCode.Builder {
    private String zza;
    private String zzb;

    zzt() {
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode build() {
        return new zzav(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setCompoundCode(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setGlobalCode(String str) {
        this.zzb = str;
        return this;
    }
}

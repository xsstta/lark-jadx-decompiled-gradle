package com.google.android.libraries.places.internal;

import android.content.Context;

/* access modifiers changed from: package-private */
public final class zzcx implements zzcz {
    private Context zza;
    private zzdb zzb;
    private zzdj zzc;

    private zzcx() {
    }

    @Override // com.google.android.libraries.places.internal.zzcz
    public final zzcw zza() {
        zzul.zza(this.zza, Context.class);
        zzul.zza(this.zzb, zzdb.class);
        zzul.zza(this.zzc, zzdj.class);
        return new zzcv(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzcz
    public final /* synthetic */ zzcz zza(Context context) {
        this.zza = (Context) zzul.zza(context);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcz
    public final /* synthetic */ zzcz zza(zzdb zzdb) {
        this.zzb = (zzdb) zzul.zza(zzdb);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcz
    public final /* synthetic */ zzcz zza(zzdj zzdj) {
        this.zzc = (zzdj) zzul.zza(zzdj);
        return this;
    }
}

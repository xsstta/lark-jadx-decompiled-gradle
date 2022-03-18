package com.google.android.libraries.places.internal;

import java.util.Locale;

public final class zzdb implements zzda, zzds {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;

    @Override // com.google.android.libraries.places.internal.zzda
    public final boolean zzc() {
        return this.zzc;
    }

    public final synchronized boolean zzd() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void zze() {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.libraries.places.internal.zzda
    public final synchronized String zza() {
        zzft.zzb(zzd(), "ApiConfig must be initialized.");
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzda, com.google.android.libraries.places.internal.zzds
    public final synchronized Locale zzb() {
        zzft.zzb(zzd(), "ApiConfig must be initialized.");
        if (this.zzb == null) {
            return Locale.getDefault();
        }
        return this.zzb;
    }

    public final synchronized void zza(String str, Locale locale, boolean z) {
        boolean z2;
        zzft.zza(str, "API Key must not be null.");
        if (!str.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzft.zza(z2, "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }
}

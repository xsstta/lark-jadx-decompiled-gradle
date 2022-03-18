package com.google.android.libraries.places.internal;

import android.os.SystemClock;

public final class zzg {
    private static final zzg zzd = new zzg();
    private final long zza;
    private long zzb;
    private int zzc;
    private boolean zze;

    zzg() {
        this(SystemClock.elapsedRealtime());
    }

    public static zzg zza() {
        return new zzg();
    }

    private zzg(long j) {
        this.zzb = -1;
        this.zzc = zzi.zza;
        this.zza = j;
    }
}

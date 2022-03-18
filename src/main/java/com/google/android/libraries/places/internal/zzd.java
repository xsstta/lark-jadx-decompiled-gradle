package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.SystemClock;

public final class zzd implements zzb {
    private static final boolean zza = zzb();

    @Override // com.google.android.libraries.places.internal.zzb
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    private static boolean zzb() {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return false;
            }
            SystemClock.elapsedRealtimeNanos();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

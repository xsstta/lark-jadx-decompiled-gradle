package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.concurrent.TimeUnit;

public final class zzs {
    private static final long zza = TimeUnit.MINUTES.toMicros(1);
    private final WifiManager zzb;
    private final zzb zzc;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        if (r10 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.places.internal.zzgi<com.google.android.libraries.places.internal.zzq> zza() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzs.zza():com.google.android.libraries.places.internal.zzgi");
    }

    zzs(WifiManager wifiManager, zzb zzb2) {
        this.zzb = wifiManager;
        this.zzc = zzb2;
    }

    static final /* synthetic */ int zza(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult2.level - scanResult.level;
    }
}

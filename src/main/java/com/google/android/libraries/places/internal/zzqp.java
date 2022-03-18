package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzqp {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzqp zzc;
    private static final zzqp zzd = new zzqp(true);
    private final Map<Object, Object> zze;

    zzqp() {
        this.zze = new HashMap();
    }

    public static zzqp zza() {
        zzqp zzqp = zzc;
        if (zzqp == null) {
            synchronized (zzqp.class) {
                zzqp = zzc;
                if (zzqp == null) {
                    zzqp = zzd;
                    zzc = zzqp;
                }
            }
        }
        return zzqp;
    }

    private zzqp(boolean z) {
        this.zze = Collections.emptyMap();
    }
}

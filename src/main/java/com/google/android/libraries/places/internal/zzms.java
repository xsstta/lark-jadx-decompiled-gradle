package com.google.android.libraries.places.internal;

import com.huawei.hms.support.api.entity.core.CommonCode;

public enum zzms implements zzrb {
    SUCCESS(0),
    GEOFENCE_NOT_AVAILABLE(1000),
    GEOFENCE_TOO_MANY_GEOFENCES(CommonCode.StatusCode.API_CLIENT_EXPIRED),
    GEOFENCE_TOO_MANY_PENDING_INTENTS(1002),
    GEOFENCE_CURRENT_LOCATION_UNKNOWN(1003);
    
    private static final zzre<zzms> zzf = new zzmr();
    private final int zzg;

    public static zzrd zzb() {
        return zzmt.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzg;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    private zzms(int i) {
        this.zzg = i;
    }
}

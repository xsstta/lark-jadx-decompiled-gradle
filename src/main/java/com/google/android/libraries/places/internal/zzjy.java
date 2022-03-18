package com.google.android.libraries.places.internal;

public enum zzjy implements zzrb {
    INVALID_STATE(0),
    NOT_INITIALIZED(1),
    NO_GEOFENCE(2),
    DISABLED(3),
    HAS_GEOFENCE(4),
    UNAVAILABLE_ACTIVITY(5),
    UNKNOWN_ACTIVITY(6),
    STILL_ACTIVITY(7),
    WALKING_ACTIVITY(8),
    FAST_MOVING_ACTIVITY(9),
    BACKGROUND_USER(10),
    CHRE_GEOFENCING(11);
    
    private static final zzre<zzjy> zzm = new zzka();
    private final int zzn;

    public static zzrd zzb() {
        return zzjz.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzn;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzn + " name=" + name() + '>';
    }

    private zzjy(int i) {
        this.zzn = i;
    }
}

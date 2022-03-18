package com.google.android.libraries.places.internal;

public enum zzkc implements zzrb {
    INVALID_MOVEMENT(0),
    UNKNOWN_MOVEMENT(1),
    STILL_MOVEMENT(2),
    WALKING_MOVEMENT(3),
    FAST_MOVING_MOVEMENT(4);
    
    private static final zzre<zzkc> zzf = new zzkb();
    private final int zzg;

    public static zzrd zzb() {
        return zzkd.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzg;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    private zzkc(int i) {
        this.zzg = i;
    }
}

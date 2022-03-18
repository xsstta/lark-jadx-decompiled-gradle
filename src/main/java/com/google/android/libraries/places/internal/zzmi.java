package com.google.android.libraries.places.internal;

public enum zzmi implements zzrb {
    UNKNOWN(0),
    TYPE_ADD(1),
    TYPE_REMOVE(2);
    
    private static final zzre<zzmi> zzd = new zzml();
    private final int zze;

    public static zzrd zzb() {
        return zzmk.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zze;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    private zzmi(int i) {
        this.zze = i;
    }
}

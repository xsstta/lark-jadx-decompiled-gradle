package com.google.android.libraries.places.internal;

public enum zzpe implements zzrb {
    UNDEFINED(0),
    INFERRED_HOME(1),
    INFERRED_WORK(2);
    
    private static final zzre<zzpe> zzd = new zzph();
    private final int zze;

    public static zzrd zzb() {
        return zzpg.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zze;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    private zzpe(int i) {
        this.zze = i;
    }
}

package com.google.android.libraries.places.internal;

public enum zzmn implements zzrb {
    HOME(0),
    WORK(1),
    NICKNAME(2);
    
    private static final zzre<zzmn> zzd = new zzmm();
    private final int zze;

    public static zzrd zzb() {
        return zzmo.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zze;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    private zzmn(int i) {
        this.zze = i;
    }
}

package com.google.android.libraries.places.internal;

public enum zznb implements zzrb {
    TYPE_UNSPECIFIED(0),
    ENTER(1),
    EXIT(2),
    DWELL_DEPRECATED(3),
    DWELL(4);
    
    private static final zzre<zznb> zzf = new zzna();
    private final int zzg;

    public static zzrd zzb() {
        return zznc.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzg;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }

    private zznb(int i) {
        this.zzg = i;
    }
}

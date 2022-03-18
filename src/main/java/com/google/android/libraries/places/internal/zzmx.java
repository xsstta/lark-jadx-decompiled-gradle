package com.google.android.libraries.places.internal;

public enum zzmx implements zzrb {
    OTHERS(0),
    NEARBY_ALERT(1),
    GET_CURRENT_PLACE(2),
    GEO_DATA_API(3);
    
    private static final zzre<zzmx> zze = new zzmz();
    private final int zzf;

    public static zzrd zzb() {
        return zzmy.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzf;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    private zzmx(int i) {
        this.zzf = i;
    }
}

package com.google.android.libraries.places.internal;

public abstract class zzqj {
    private int zza;
    private int zzb;
    private boolean zzc;

    public abstract int zza();

    public abstract int zza(int i) throws zzrk;

    private zzqj() {
        this.zza = 100;
        this.zzb = Integer.MAX_VALUE;
    }

    static zzqj zza(byte[] bArr, int i, int i2, boolean z) {
        zzql zzql = new zzql(bArr, 0, i2, false);
        try {
            zzql.zza(i2);
            return zzql;
        } catch (zzrk e) {
            throw new IllegalArgumentException(e);
        }
    }
}

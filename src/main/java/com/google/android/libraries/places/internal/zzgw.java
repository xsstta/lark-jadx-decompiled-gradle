package com.google.android.libraries.places.internal;

final class zzgw extends zzgi<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzc;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzft.zza(i, this.zzc);
        return this.zza[(i * 2) + this.zzb];
    }

    zzgw(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }
}

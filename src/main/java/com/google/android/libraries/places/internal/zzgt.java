package com.google.android.libraries.places.internal;

/* access modifiers changed from: package-private */
public final class zzgt<E> extends zzgi<E> {
    static final zzgi<Object> zza = new zzgt(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zze() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return false;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final Object[] zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zzf() {
        return this.zzc;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzft.zza(i, this.zzc);
        return (E) this.zzb[i];
    }

    zzgt(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgi, com.google.android.libraries.places.internal.zzgj
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }
}

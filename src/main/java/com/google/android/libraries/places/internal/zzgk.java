package com.google.android.libraries.places.internal;

import java.util.List;

/* access modifiers changed from: package-private */
public final class zzgk extends zzgi<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzgi zzc;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final Object[] zzd() {
        return this.zzc.zzd();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zze() {
        return this.zzc.zze() + this.zza;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zzf() {
        return this.zzc.zze() + this.zza + this.zzb;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzft.zza(i, this.zzb);
        return (E) this.zzc.get(i + this.zza);
    }

    @Override // java.util.List, com.google.android.libraries.places.internal.zzgi
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzgi
    public final zzgi<E> zza(int i, int i2) {
        zzft.zza(i, i2, this.zzb);
        zzgi zzgi = this.zzc;
        int i3 = this.zza;
        return (zzgi) zzgi.subList(i + i3, i2 + i3);
    }

    zzgk(zzgi zzgi, int i, int i2) {
        this.zzc = zzgi;
        this.zza = i;
        this.zzb = i2;
    }
}

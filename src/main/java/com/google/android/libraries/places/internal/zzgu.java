package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Map;

final class zzgu extends zzgi<Map.Entry<K, V>> {
    private final /* synthetic */ zzgv zza;

    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zza.zzd;
    }

    zzgu(zzgv zzgv) {
        this.zza = zzgv;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzft.zza(i, this.zza.zzd);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zza.zzb[i2], this.zza.zzb[i2 + 1]);
    }
}

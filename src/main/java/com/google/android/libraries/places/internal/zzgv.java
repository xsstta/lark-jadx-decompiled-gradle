package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

final class zzgv<K, V> extends zzgp<Map.Entry<K, V>> {
    private final transient zzgn<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;
    private final transient int zzd;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzd;
    }

    @Override // java.util.AbstractCollection, com.google.android.libraries.places.internal.zzgp, java.util.Collection, java.util.Set, com.google.android.libraries.places.internal.zzgj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgp
    public final zzgi<Map.Entry<K, V>> zza() {
        return new zzgu(this);
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public final zzgy<Map.Entry<K, V>> zzb() {
        return (zzgy) zzc().iterator();
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    zzgv(zzgn<K, V> zzgn, Object[] objArr, int i, int i2) {
        this.zza = zzgn;
        this.zzb = objArr;
        this.zzd = i2;
    }
}

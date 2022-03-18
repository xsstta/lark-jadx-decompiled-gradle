package com.google.android.libraries.places.internal;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzgx<K> extends zzgp<K> {
    private final transient zzgn<K, ?> zza;
    private final transient zzgi<K> zzb;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean zzg() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzgp, com.google.android.libraries.places.internal.zzgj
    public final zzgi<K> zzc() {
        return this.zzb;
    }

    @Override // java.util.AbstractCollection, com.google.android.libraries.places.internal.zzgp, java.util.Collection, java.util.Set, com.google.android.libraries.places.internal.zzgj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public final zzgy<K> zzb() {
        return (zzgy) zzc().iterator();
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public final boolean contains(@NullableDecl Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    zzgx(zzgn<K, ?> zzgn, zzgi<K> zzgi) {
        this.zza = zzgn;
        this.zzb = zzgi;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }
}

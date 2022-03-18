package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zztu extends AbstractList<String> implements zzrr, RandomAccess {
    private final zzrr zza;

    @Override // com.google.android.libraries.places.internal.zzrr
    public final zzrr a_() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zztw(this);
    }

    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final List<?> zzb() {
        return this.zza.zzb();
    }

    public zztu(zzrr zzrr) {
        this.zza = zzrr;
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new zztt(this, i);
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final Object zza(int i) {
        return this.zza.zza(i);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.zza.get(i);
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final void zza(zzpx zzpx) {
        throw new UnsupportedOperationException();
    }
}

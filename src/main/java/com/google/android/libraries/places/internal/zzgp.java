package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzgp<E> extends zzgj<E> implements Set<E> {
    @NullableDecl
    private transient zzgi<E> zza;

    zzgp() {
    }

    public int hashCode() {
        return zzgz.zza(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.libraries.places.internal.zzgj, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public zzgi<E> zza() {
        return zzgi.zzb(toArray());
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public zzgi<E> zzc() {
        zzgi<E> zzgi = this.zza;
        if (zzgi != null) {
            return zzgi;
        }
        zzgi<E> zza2 = zza();
        this.zza = zza2;
        return zza2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return zzgz.zza(this, obj);
    }
}

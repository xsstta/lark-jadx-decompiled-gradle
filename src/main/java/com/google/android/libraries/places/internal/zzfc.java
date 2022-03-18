package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzfc<T> implements Iterator<T> {
    private int zza = zzfe.zzb;
    @NullableDecl
    private T zzb;

    /* access modifiers changed from: protected */
    public abstract T zza();

    protected zzfc() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public final T zzb() {
        this.zza = zzfe.zzc;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zza = zzfe.zzb;
            T t = this.zzb;
            this.zzb = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.zza != zzfe.zzd) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = zzfb.zza[this.zza - 1];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.zza = zzfe.zzd;
            this.zzb = zza();
            if (this.zza == zzfe.zzc) {
                return false;
            }
            this.zza = zzfe.zza;
            return true;
        }
        throw new IllegalStateException();
    }
}

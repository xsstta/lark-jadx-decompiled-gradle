package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

abstract class zzfy<E> extends zzhb<E> {
    private final int zza;
    private int zzb;

    /* access modifiers changed from: protected */
    public abstract E zza(int i);

    public final int nextIndex() {
        return this.zzb;
    }

    public final boolean hasPrevious() {
        if (this.zzb > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    public final boolean hasNext() {
        if (this.zzb < this.zza) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zza(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.zzb - 1;
            this.zzb = i;
            return zza(i);
        }
        throw new NoSuchElementException();
    }

    protected zzfy(int i, int i2) {
        zzft.zzb(i2, i);
        this.zza = i;
        this.zzb = i2;
    }
}

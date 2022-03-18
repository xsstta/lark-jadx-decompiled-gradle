package com.google.android.libraries.places.internal;

import java.util.ListIterator;

public abstract class zzhb<E> extends zzgy<E> implements ListIterator<E> {
    protected zzhb() {
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}

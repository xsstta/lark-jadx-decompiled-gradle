package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zztf implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    zztf() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.libraries.places.internal;

import java.util.Iterator;

public abstract class zzgy<E> implements Iterator<E> {
    protected zzgy() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

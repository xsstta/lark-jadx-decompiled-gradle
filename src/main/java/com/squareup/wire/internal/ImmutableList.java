package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class ImmutableList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final ArrayList<T> list;

    private Object writeReplace() throws ObjectStreamException {
        return Collections.unmodifiableList(this.list);
    }

    public int size() {
        return this.list.size();
    }

    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        return this.list.get(i);
    }

    ImmutableList(List<T> list2) {
        this.list = new ArrayList<>(list2);
    }
}

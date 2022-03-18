package com.ss.android.ugc.effectmanager.common;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.a */
public class C60495a<E> extends AbstractSet<E> implements Set<E> {

    /* renamed from: a */
    private final Map<E, Boolean> f151229a;

    /* renamed from: b */
    private transient Set<E> f151230b;

    public void clear() {
        this.f151229a.clear();
    }

    public int hashCode() {
        return this.f151230b.hashCode();
    }

    public boolean isEmpty() {
        return this.f151229a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f151230b.iterator();
    }

    public int size() {
        return this.f151229a.size();
    }

    public Object[] toArray() {
        return this.f151230b.toArray();
    }

    public String toString() {
        return this.f151230b.toString();
    }

    public C60495a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f151229a = concurrentHashMap;
        this.f151230b = concurrentHashMap.keySet();
    }

    public boolean contains(Object obj) {
        return this.f151229a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return this.f151230b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.AbstractSet, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this.f151230b.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return this.f151230b.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.f151229a.put(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this || this.f151230b.equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (this.f151229a.remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f151230b.toArray(tArr);
    }
}

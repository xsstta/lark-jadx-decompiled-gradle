package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;
    final ArrayList<T> list;

    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.list.listIterator();
    }

    public int size() {
        return get();
    }

    public Object[] toArray() {
        return this.list.toArray();
    }

    public String toString() {
        return this.list.toString();
    }

    public VolatileSizeArrayList() {
        this.list = new ArrayList<>();
    }

    public void clear() {
        this.list.clear();
        lazySet(0);
    }

    public boolean isEmpty() {
        if (get() == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.list.containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i) {
        return this.list.get(i);
    }

    public int indexOf(Object obj) {
        return this.list.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.list.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return this.list.listIterator(i);
    }

    @Override // java.util.List
    public T remove(int i) {
        T remove = this.list.remove(i);
        lazySet(this.list.size());
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.list.removeAll(collection);
        lazySet(this.list.size());
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.list.retainAll(collection);
        lazySet(this.list.size());
        return retainAll;
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.list.toArray(eArr);
    }

    public VolatileSizeArrayList(int i) {
        this.list = new ArrayList<>(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        boolean add = this.list.add(t);
        lazySet(this.list.size());
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.list.addAll(collection);
        lazySet(this.list.size());
        return addAll;
    }

    public boolean equals(Object obj) {
        if (obj instanceof VolatileSizeArrayList) {
            return this.list.equals(((VolatileSizeArrayList) obj).list);
        }
        return this.list.equals(obj);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        boolean remove = this.list.remove(obj);
        lazySet(this.list.size());
        return remove;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        return this.list.set(i, t);
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        return this.list.subList(i, i2);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        this.list.add(i, t);
        lazySet(this.list.size());
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.list.addAll(i, collection);
        lazySet(this.list.size());
        return addAll;
    }
}

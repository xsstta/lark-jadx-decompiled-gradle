package com.google.protobuf;

import com.google.protobuf.C23115i;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
abstract class AbstractC23106c<E> extends AbstractList<E> implements C23115i.AbstractC23118c<E> {

    /* renamed from: a */
    private boolean f57036a = true;

    @Override // com.google.protobuf.C23115i.AbstractC23118c
    /* renamed from: b */
    public final void mo80241b() {
        this.f57036a = false;
    }

    @Override // com.google.protobuf.C23115i.AbstractC23118c
    /* renamed from: a */
    public boolean mo80236a() {
        return this.f57036a;
    }

    AbstractC23106c() {
    }

    public void clear() {
        mo80242c();
        super.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80242c() {
        if (!this.f57036a) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public E remove(int i) {
        mo80242c();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        mo80242c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        mo80242c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e) {
        mo80242c();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        mo80242c();
        return super.addAll(collection);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        mo80242c();
        return super.remove(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e) {
        mo80242c();
        super.add(i, e);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends E> collection) {
        mo80242c();
        return super.addAll(i, collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e) {
        mo80242c();
        return (E) super.set(i, e);
    }
}

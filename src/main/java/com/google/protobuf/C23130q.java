package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.protobuf.q */
final class C23130q<E> extends AbstractC23106c<E> {

    /* renamed from: a */
    private static final C23130q<Object> f57074a;

    /* renamed from: b */
    private final List<E> f57075b;

    /* renamed from: d */
    public static <E> C23130q<E> m83841d() {
        return (C23130q<E>) f57074a;
    }

    public int size() {
        return this.f57075b.size();
    }

    static {
        C23130q<Object> qVar = new C23130q<>();
        f57074a = qVar;
        qVar.mo80241b();
    }

    C23130q() {
        this(new ArrayList(10));
    }

    private C23130q(List<E> list) {
        this.f57075b = list;
    }

    @Override // java.util.List, java.util.AbstractList
    public E get(int i) {
        return this.f57075b.get(i);
    }

    @Override // java.util.List, java.util.AbstractList, com.google.protobuf.AbstractC23106c
    public E remove(int i) {
        mo80242c();
        E remove = this.f57075b.remove(i);
        this.modCount++;
        return remove;
    }

    /* renamed from: b */
    public C23130q<E> mo80278a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f57075b);
            return new C23130q<>(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList, com.google.protobuf.AbstractC23106c
    public void add(int i, E e) {
        mo80242c();
        this.f57075b.add(i, e);
        this.modCount++;
    }

    @Override // java.util.List, java.util.AbstractList, com.google.protobuf.AbstractC23106c
    public E set(int i, E e) {
        mo80242c();
        E e2 = this.f57075b.set(i, e);
        this.modCount++;
        return e2;
    }
}

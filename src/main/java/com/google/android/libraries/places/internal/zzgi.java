package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzgi<E> extends zzgj<E> implements List<E>, RandomAccess {
    private static final zzhb<Object> zza = new zzgl(zzgt.zza, 0);

    @Override // com.google.android.libraries.places.internal.zzgj
    public final zzgi<E> zzc() {
        return this;
    }

    zzgi() {
    }

    public static <E> zzgi<E> zza() {
        return (zzgi<E>) zzgt.zza;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzgj, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzhb) listIterator(0);
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public final zzgy<E> zzb() {
        return (zzhb) listIterator();
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    static <E> zzgi<E> zzb(Object[] objArr) {
        int length = objArr.length;
        return length == 0 ? (zzgi<E>) zzgt.zza : new zzgt(objArr, length);
    }

    @Override // com.google.android.libraries.places.internal.zzgj
    public boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        zzft.zzb(i, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzgl(this, i);
    }

    public static <E> zzgi<E> zza(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            if (objArr[0] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index 0");
                throw new NullPointerException(sb.toString());
            }
        }
        return new zzgt(objArr, 1);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzft.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    zzgi<E> zzgi = this;
                    int size2 = zzgi.size();
                    Iterator<E> it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            E e = zzgi.get(i);
                            i++;
                            if (!zzfn.zza(e, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (zzfn.zza(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzfn.zza(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
            return -1;
        }
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (zzfn.zza(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static <E> zzgi<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzgj) {
            zzgi<E> zzc = ((zzgj) collection).zzc();
            if (!zzc.zzg()) {
                return zzc;
            }
            Object[] array = zzc.toArray();
            int length = array.length;
            return length == 0 ? (zzgi<E>) zzgt.zza : new zzgt(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length3 = array2.length;
        return length3 == 0 ? (zzgi<E>) zzgt.zza : new zzgt(array2, length3);
    }

    public static <E> zzgi<E> zza(E[] eArr) {
        if (eArr.length == 0) {
            return (zzgi<E>) zzgt.zza;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length2 = objArr.length;
        return length2 == 0 ? (zzgi<E>) zzgt.zza : new zzgt(objArr, length2);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgj
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static <E> zzgi<E> zza(E e, E e2) {
        Object[] objArr = {e, e2};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new zzgt(objArr, 2);
    }

    public static <E> zzgi<E> zza(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        zzft.zza(comparator);
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            Collection arrayList = new ArrayList();
            zzft.zza(arrayList);
            zzft.zza(it);
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        Arrays.sort(array, comparator);
        int length2 = array.length;
        return length2 == 0 ? (zzgi<E>) zzgt.zza : new zzgt(array, length2);
    }

    /* renamed from: zza */
    public zzgi<E> subList(int i, int i2) {
        zzft.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (zzgi<E>) zzgt.zza : new zzgk(this, i, i3);
    }
}

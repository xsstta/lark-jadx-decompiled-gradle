package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzgj<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzb */
    public abstract zzgy<E> iterator();

    /* access modifiers changed from: package-private */
    public Object[] zzd() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean zzg();

    zzgj() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    /* access modifiers changed from: package-private */
    public int zze() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzf() {
        throw new UnsupportedOperationException();
    }

    public zzgi<E> zzc() {
        if (isEmpty()) {
            return zzgi.zza();
        }
        return zzgi.zzb(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzft.zza(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzd = zzd();
            if (zzd != null) {
                return (T[]) Arrays.copyOfRange(zzd, zze(), zzf(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzgy zzgy = (zzgy) iterator();
        while (zzgy.hasNext()) {
            objArr[i] = zzgy.next();
            i++;
        }
        return i;
    }
}

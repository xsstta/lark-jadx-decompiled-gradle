package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class zzsv<E> extends zzps<E> implements RandomAccess {
    private static final zzsv<Object> zza;
    private E[] zzb;
    private int zzc;

    public static <E> zzsv<E> zzd() {
        return (zzsv<E>) zza;
    }

    public final int size() {
        return this.zzc;
    }

    static {
        zzsv<Object> zzsv = new zzsv<>(new Object[0], 0);
        zza = zzsv;
        zzsv.b_();
    }

    zzsv() {
        this(new Object[10], 0);
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        zza(i);
        return this.zzb[i];
    }

    private final void zza(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    private final String zzc(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzrh
    public final /* synthetic */ zzrh zzb(int i) {
        if (i >= this.zzc) {
            return new zzsv(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final boolean add(E e) {
        zzc();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final E remove(int i) {
        zzc();
        zza(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    private zzsv(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final E set(int i, E e) {
        zzc();
        zza(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final void add(int i, E e) {
        int i2;
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        this.modCount++;
    }
}

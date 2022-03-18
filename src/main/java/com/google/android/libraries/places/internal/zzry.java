package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzry extends zzps<Long> implements zzrh<Long>, zzst, RandomAccess {
    private static final zzry zza;
    private long[] zzb;
    private int zzc;

    public static zzry zzd() {
        return zza;
    }

    public final int size() {
        return this.zzc;
    }

    static {
        zzry zzry = new zzry(new long[0], 0);
        zza = zzry;
        zzry.b_();
    }

    zzry() {
        this(new long[10], 0);
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzrc.zza(this.zzb[i2]);
        }
        return i;
    }

    public final long zza(int i) {
        zzc(i);
        return this.zzb[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(zza(i));
    }

    private final void zzc(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
    }

    private final String zzd(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.libraries.places.internal.zzrh' to match base method */
    @Override // com.google.android.libraries.places.internal.zzrh
    public final /* synthetic */ zzrh<Long> zzb(int i) {
        if (i >= this.zzc) {
            return new zzry(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ boolean add(Long l) {
        long longValue = l.longValue();
        zzc();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzry)) {
            return super.equals(obj);
        }
        zzry zzry = (zzry) obj;
        if (this.zzc != zzry.zzc) {
            return false;
        }
        long[] jArr = zzry.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ Long remove(int i) {
        zzc();
        zzc(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzps
    public final boolean addAll(Collection<? extends Long> collection) {
        zzc();
        zzrc.zza(collection);
        if (!(collection instanceof zzry)) {
            return super.addAll(collection);
        }
        zzry zzry = (zzry) collection;
        int i = zzry.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzb;
            if (i3 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzry.zzb, 0, this.zzb, this.zzc, zzry.zzc);
            this.zzc = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.libraries.places.internal.zzps
    public final boolean remove(Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(Long.valueOf(this.zzb[i]))) {
                long[] jArr = this.zzb;
                System.arraycopy(jArr, i + 1, jArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private zzry(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ Long set(int i, Long l) {
        long longValue = l.longValue();
        zzc();
        zzc(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzc();
        if (i2 >= i) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ void add(int i, Long l) {
        int i2;
        long longValue = l.longValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        this.modCount++;
    }
}

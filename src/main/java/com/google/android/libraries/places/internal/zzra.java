package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzra extends zzps<Integer> implements zzrh<Integer>, zzst, RandomAccess {
    private static final zzra zza;
    private int[] zzb;
    private int zzc;

    public static zzra zzd() {
        return zza;
    }

    public final int size() {
        return this.zzc;
    }

    static {
        zzra zzra = new zzra(new int[0], 0);
        zza = zzra;
        zzra.b_();
    }

    zzra() {
        this(new int[10], 0);
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final int zza(int i) {
        zzc(i);
        return this.zzb[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(zza(i));
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
    public final /* synthetic */ zzrh<Integer> zzb(int i) {
        if (i >= this.zzc) {
            return new zzra(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ boolean add(Integer num) {
        int intValue = num.intValue();
        zzc();
        int i = this.zzc;
        int[] iArr = this.zzb;
        if (i == iArr.length) {
            int[] iArr2 = new int[(((i * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        iArr3[i2] = intValue;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzra)) {
            return super.equals(obj);
        }
        zzra zzra = (zzra) obj;
        if (this.zzc != zzra.zzc) {
            return false;
        }
        int[] iArr = zzra.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ Integer remove(int i) {
        zzc();
        zzc(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        int i3 = this.zzc;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzps
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzc();
        zzrc.zza(collection);
        if (!(collection instanceof zzra)) {
            return super.addAll(collection);
        }
        zzra zzra = (zzra) collection;
        int i = zzra.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzb;
            if (i3 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzra.zzb, 0, this.zzb, this.zzc, zzra.zzc);
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
            if (obj.equals(Integer.valueOf(this.zzb[i]))) {
                int[] iArr = this.zzb;
                System.arraycopy(iArr, i + 1, iArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private zzra(int[] iArr, int i) {
        this.zzb = iArr;
        this.zzc = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ Integer set(int i, Integer num) {
        int intValue = num.intValue();
        zzc();
        zzc(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzc();
        if (i2 >= i) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ void add(int i, Integer num) {
        int i2;
        int intValue = num.intValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
        int[] iArr = this.zzb;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
            this.zzb = iArr2;
        }
        this.zzb[i] = intValue;
        this.zzc++;
        this.modCount++;
    }
}

package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzrs extends zzps<String> implements zzrr, RandomAccess {
    private static final zzrs zza;
    private static final zzrr zzb;
    private final List<Object> zzc;

    public zzrs() {
        this(10);
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final List<?> zzb() {
        return Collections.unmodifiableList(this.zzc);
    }

    static {
        zzrs zzrs = new zzrs();
        zza = zzrs;
        zzrs.b_();
        zzb = zzrs;
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final zzrr a_() {
        if (zza()) {
            return new zztu(this);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzrh, com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean add(String str) {
        return super.add(str);
    }

    @Override // com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.List, com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzps
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final Object zza(int i) {
        return this.zzc.get(i);
    }

    public zzrs(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.libraries.places.internal.zzps
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.libraries.places.internal.zzrr
    public final void zza(zzpx zzpx) {
        zzc();
        this.zzc.add(zzpx);
        this.modCount++;
    }

    private zzrs(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzpx) {
            return ((zzpx) obj).zzb();
        }
        return zzrc.zzb((byte[]) obj);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ String remove(int i) {
        zzc();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zza(remove);
    }

    @Override // com.google.android.libraries.places.internal.zzrh
    public final /* synthetic */ zzrh zzb(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzrs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzpx) {
            zzpx zzpx = (zzpx) obj;
            String zzb2 = zzpx.zzb();
            if (zzpx.zzc()) {
                this.zzc.set(i, zzb2);
            }
            return zzb2;
        }
        byte[] bArr = (byte[]) obj;
        String zzb3 = zzrc.zzb(bArr);
        if (zzrc.zza(bArr)) {
            this.zzc.set(i, zzb3);
        }
        return zzb3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ String set(int i, String str) {
        zzc();
        return zza(this.zzc.set(i, str));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final /* synthetic */ void add(int i, String str) {
        zzc();
        this.zzc.add(i, str);
        this.modCount++;
    }

    @Override // java.util.List, java.util.AbstractList, com.google.android.libraries.places.internal.zzps
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzc();
        if (collection instanceof zzrr) {
            collection = ((zzrr) collection).zzb();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}

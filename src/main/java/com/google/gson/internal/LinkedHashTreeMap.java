package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        /* class com.google.gson.internal.LinkedHashTreeMap.C229381 */

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.C22941c entrySet;
    final C22946f<K, V> header;
    private LinkedHashTreeMap<K, V>.C22943d keySet;
    int modCount;
    int size;
    C22946f<K, V>[] table;
    int threshold;

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$a */
    public static final class C22939a<K, V> {

        /* renamed from: a */
        private C22946f<K, V> f56662a;

        /* renamed from: b */
        private int f56663b;

        /* renamed from: c */
        private int f56664c;

        /* renamed from: d */
        private int f56665d;

        C22939a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C22946f<K, V> mo79749a() {
            C22946f<K, V> fVar = this.f56662a;
            if (fVar.f56675a == null) {
                return fVar;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79750a(int i) {
            this.f56663b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f56665d = 0;
            this.f56664c = 0;
            this.f56662a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79751a(C22946f<K, V> fVar) {
            fVar.f56677c = null;
            fVar.f56675a = null;
            fVar.f56676b = null;
            fVar.f56683i = 1;
            int i = this.f56663b;
            if (i > 0) {
                int i2 = this.f56665d;
                if ((i2 & 1) == 0) {
                    this.f56665d = i2 + 1;
                    this.f56663b = i - 1;
                    this.f56664c++;
                }
            }
            fVar.f56675a = this.f56662a;
            this.f56662a = fVar;
            int i3 = this.f56665d + 1;
            this.f56665d = i3;
            int i4 = this.f56663b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f56665d = i3 + 1;
                this.f56663b = i4 - 1;
                this.f56664c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f56665d & i6) == i6) {
                    int i7 = this.f56664c;
                    if (i7 == 0) {
                        C22946f<K, V> fVar2 = this.f56662a;
                        C22946f<K, V> fVar3 = fVar2.f56675a;
                        C22946f<K, V> fVar4 = fVar3.f56675a;
                        fVar3.f56675a = fVar4.f56675a;
                        this.f56662a = fVar3;
                        fVar3.f56676b = fVar4;
                        fVar3.f56677c = fVar2;
                        fVar3.f56683i = fVar2.f56683i + 1;
                        fVar4.f56675a = fVar3;
                        fVar2.f56675a = fVar3;
                    } else if (i7 == 1) {
                        C22946f<K, V> fVar5 = this.f56662a;
                        C22946f<K, V> fVar6 = fVar5.f56675a;
                        this.f56662a = fVar6;
                        fVar6.f56677c = fVar5;
                        fVar6.f56683i = fVar5.f56683i + 1;
                        fVar5.f56675a = fVar6;
                        this.f56664c = 0;
                    } else if (i7 == 2) {
                        this.f56664c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$b */
    public static class C22940b<K, V> {

        /* renamed from: a */
        private C22946f<K, V> f56666a;

        C22940b() {
        }

        /* renamed from: a */
        public C22946f<K, V> mo79752a() {
            C22946f<K, V> fVar = this.f56666a;
            if (fVar == null) {
                return null;
            }
            C22946f<K, V> fVar2 = fVar.f56675a;
            fVar.f56675a = null;
            C22946f<K, V> fVar3 = fVar.f56677c;
            while (true) {
                fVar2 = fVar3;
                if (fVar2 != null) {
                    fVar2.f56675a = fVar2;
                    fVar3 = fVar2.f56676b;
                } else {
                    this.f56666a = fVar2;
                    return fVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79753a(C22946f<K, V> fVar) {
            C22946f<K, V> fVar2 = null;
            while (fVar != null) {
                fVar.f56675a = fVar2;
                fVar2 = fVar;
                fVar = fVar.f56676b;
            }
            this.f56666a = fVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$f */
    public static final class C22946f<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C22946f<K, V> f56675a;

        /* renamed from: b */
        C22946f<K, V> f56676b;

        /* renamed from: c */
        C22946f<K, V> f56677c;

        /* renamed from: d */
        C22946f<K, V> f56678d;

        /* renamed from: e */
        C22946f<K, V> f56679e;

        /* renamed from: f */
        final K f56680f;

        /* renamed from: g */
        final int f56681g;

        /* renamed from: h */
        V f56682h;

        /* renamed from: i */
        int f56683i;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56680f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f56682h;
        }

        C22946f() {
            this.f56681g = -1;
            this.f56679e = this;
            this.f56678d = this;
        }

        /* renamed from: a */
        public C22946f<K, V> mo79770a() {
            C22946f<K, V> fVar = this;
            for (C22946f<K, V> fVar2 = this.f56676b; fVar2 != null; fVar2 = fVar2.f56676b) {
                fVar = fVar2;
            }
            return fVar;
        }

        /* renamed from: b */
        public C22946f<K, V> mo79771b() {
            C22946f<K, V> fVar = this;
            for (C22946f<K, V> fVar2 = this.f56677c; fVar2 != null; fVar2 = fVar2.f56677c) {
                fVar = fVar2;
            }
            return fVar;
        }

        public int hashCode() {
            int i;
            K k = this.f56680f;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f56682h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public String toString() {
            return ((Object) this.f56680f) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) this.f56682h);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f56682h;
            this.f56682h = v;
            return v2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f56680f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f56682h
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.C22946f.equals(java.lang.Object):boolean");
        }

        C22946f(C22946f<K, V> fVar, K k, int i, C22946f<K, V> fVar2, C22946f<K, V> fVar3) {
            this.f56675a = fVar;
            this.f56680f = k;
            this.f56681g = i;
            this.f56683i = 1;
            this.f56678d = fVar2;
            this.f56679e = fVar3;
            fVar3.f56678d = this;
            fVar2.f56679e = this;
        }
    }

    public int size() {
        return this.size;
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$c */
    final class C22941c extends AbstractSet<Map.Entry<K, V>> {
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.AbstractC22945e() {
                /* class com.google.gson.internal.LinkedHashTreeMap.C22941c.C229421 */

                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    return mo79767b();
                }

                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }
            };
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }

        C22941c() {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            C22946f<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d */
    final class C22943d extends AbstractSet<K> {
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.AbstractC22945e() {
                /* class com.google.gson.internal.LinkedHashTreeMap.C22943d.C229441 */

                @Override // java.util.Iterator
                public K next() {
                    return mo79767b().f56680f;
                }

                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }
            };
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }

        C22943d() {
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$e */
    private abstract class AbstractC22945e<T> implements Iterator<T> {

        /* renamed from: b */
        C22946f<K, V> f56671b;

        /* renamed from: c */
        C22946f<K, V> f56672c;

        /* renamed from: d */
        int f56673d;

        public final boolean hasNext() {
            if (this.f56671b != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            C22946f<K, V> fVar = this.f56672c;
            if (fVar != null) {
                LinkedHashTreeMap.this.removeInternal(fVar, true);
                this.f56672c = null;
                this.f56673d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C22946f<K, V> mo79767b() {
            C22946f<K, V> fVar = this.f56671b;
            if (fVar == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            } else if (LinkedHashTreeMap.this.modCount == this.f56673d) {
                this.f56671b = fVar.f56678d;
                this.f56672c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        AbstractC22945e() {
            this.f56671b = LinkedHashTreeMap.this.header.f56678d;
            this.f56673d = LinkedHashTreeMap.this.modCount;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C22941c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.C22941c cVar2 = new C22941c();
        this.entrySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C22943d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.C22943d dVar2 = new C22943d();
        this.keySet = dVar2;
        return dVar2;
    }

    private void doubleCapacity() {
        C22946f<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C22946f<K, V> fVar = this.header;
        C22946f<K, V> fVar2 = fVar.f56678d;
        while (fVar2 != fVar) {
            C22946f<K, V> fVar3 = fVar2.f56678d;
            fVar2.f56679e = null;
            fVar2.f56678d = null;
            fVar2 = fVar3;
        }
        fVar.f56679e = fVar;
        fVar.f56678d = fVar;
    }

    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public C22946f<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C22946f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f56682h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C22946f<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f56682h;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C22946f<K, V> removeInternalByKey(Object obj) {
        C22946f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    /* access modifiers changed from: package-private */
    public C22946f<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z;
        C22946f<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f56682h, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return findByObject;
        }
        return null;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.comparator = comparator2 == null ? NATURAL_ORDER : comparator2;
        this.header = new C22946f<>();
        C22946f<K, V>[] fVarArr = new C22946f[16];
        this.table = fVarArr;
        this.threshold = (fVarArr.length / 2) + (fVarArr.length / 4);
    }

    private void rotateLeft(C22946f<K, V> fVar) {
        int i;
        int i2;
        C22946f<K, V> fVar2 = fVar.f56676b;
        C22946f<K, V> fVar3 = fVar.f56677c;
        C22946f<K, V> fVar4 = fVar3.f56676b;
        C22946f<K, V> fVar5 = fVar3.f56677c;
        fVar.f56677c = fVar4;
        if (fVar4 != null) {
            fVar4.f56675a = fVar;
        }
        replaceInParent(fVar, fVar3);
        fVar3.f56676b = fVar;
        fVar.f56675a = fVar3;
        int i3 = 0;
        if (fVar2 != null) {
            i = fVar2.f56683i;
        } else {
            i = 0;
        }
        if (fVar4 != null) {
            i2 = fVar4.f56683i;
        } else {
            i2 = 0;
        }
        fVar.f56683i = Math.max(i, i2) + 1;
        int i4 = fVar.f56683i;
        if (fVar5 != null) {
            i3 = fVar5.f56683i;
        }
        fVar3.f56683i = Math.max(i4, i3) + 1;
    }

    private void rotateRight(C22946f<K, V> fVar) {
        int i;
        int i2;
        C22946f<K, V> fVar2 = fVar.f56676b;
        C22946f<K, V> fVar3 = fVar.f56677c;
        C22946f<K, V> fVar4 = fVar2.f56676b;
        C22946f<K, V> fVar5 = fVar2.f56677c;
        fVar.f56676b = fVar5;
        if (fVar5 != null) {
            fVar5.f56675a = fVar;
        }
        replaceInParent(fVar, fVar2);
        fVar2.f56677c = fVar;
        fVar.f56675a = fVar2;
        int i3 = 0;
        if (fVar3 != null) {
            i = fVar3.f56683i;
        } else {
            i = 0;
        }
        if (fVar5 != null) {
            i2 = fVar5.f56683i;
        } else {
            i2 = 0;
        }
        fVar.f56683i = Math.max(i, i2) + 1;
        int i4 = fVar.f56683i;
        if (fVar4 != null) {
            i3 = fVar4.f56683i;
        }
        fVar2.f56683i = Math.max(i4, i3) + 1;
    }

    static <K, V> C22946f<K, V>[] doubleCapacity(C22946f<K, V>[] fVarArr) {
        int length = fVarArr.length;
        C22946f<K, V>[] fVarArr2 = new C22946f[(length * 2)];
        C22940b bVar = new C22940b();
        C22939a aVar = new C22939a();
        C22939a aVar2 = new C22939a();
        for (int i = 0; i < length; i++) {
            C22946f<K, V> fVar = fVarArr[i];
            if (fVar != null) {
                bVar.mo79753a(fVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C22946f<K, V> a = bVar.mo79752a();
                    if (a == null) {
                        break;
                    } else if ((a.f56681g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                aVar.mo79750a(i2);
                aVar2.mo79750a(i3);
                bVar.mo79753a(fVar);
                while (true) {
                    C22946f<K, V> a2 = bVar.mo79752a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f56681g & length) == 0) {
                        aVar.mo79751a(a2);
                    } else {
                        aVar2.mo79751a(a2);
                    }
                }
                C22946f<K, V> fVar2 = null;
                fVarArr2[i] = i2 > 0 ? aVar.mo79749a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar2 = aVar2.mo79749a();
                }
                fVarArr2[i4] = fVar2;
            }
        }
        return fVarArr2;
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C22946f<K, V> find = find(k, true);
        V v2 = find.f56682h;
        find.f56682h = v;
        return v2;
    }

    private void replaceInParent(C22946f<K, V> fVar, C22946f<K, V> fVar2) {
        C22946f<K, V> fVar3 = fVar.f56675a;
        fVar.f56675a = null;
        if (fVar2 != null) {
            fVar2.f56675a = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f56681g;
            C22946f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f56676b == fVar) {
            fVar3.f56676b = fVar2;
        } else {
            fVar3.f56677c = fVar2;
        }
    }

    private void rebalance(C22946f<K, V> fVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (fVar != null) {
            C22946f<K, V> fVar2 = fVar.f56676b;
            C22946f<K, V> fVar3 = fVar.f56677c;
            int i5 = 0;
            if (fVar2 != null) {
                i = fVar2.f56683i;
            } else {
                i = 0;
            }
            if (fVar3 != null) {
                i2 = fVar3.f56683i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C22946f<K, V> fVar4 = fVar3.f56676b;
                C22946f<K, V> fVar5 = fVar3.f56677c;
                if (fVar5 != null) {
                    i4 = fVar5.f56683i;
                } else {
                    i4 = 0;
                }
                if (fVar4 != null) {
                    i5 = fVar4.f56683i;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    rotateLeft(fVar);
                } else {
                    rotateRight(fVar3);
                    rotateLeft(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C22946f<K, V> fVar6 = fVar2.f56676b;
                C22946f<K, V> fVar7 = fVar2.f56677c;
                if (fVar7 != null) {
                    i3 = fVar7.f56683i;
                } else {
                    i3 = 0;
                }
                if (fVar6 != null) {
                    i5 = fVar6.f56683i;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    rotateRight(fVar);
                } else {
                    rotateLeft(fVar2);
                    rotateRight(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                fVar.f56683i = i + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f56683i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f56675a;
        }
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C22946f<K, V> fVar, boolean z) {
        C22946f<K, V> fVar2;
        int i;
        if (z) {
            fVar.f56679e.f56678d = fVar.f56678d;
            fVar.f56678d.f56679e = fVar.f56679e;
            fVar.f56679e = null;
            fVar.f56678d = null;
        }
        C22946f<K, V> fVar3 = fVar.f56676b;
        C22946f<K, V> fVar4 = fVar.f56677c;
        C22946f<K, V> fVar5 = fVar.f56675a;
        int i2 = 0;
        if (fVar3 == null || fVar4 == null) {
            if (fVar3 != null) {
                replaceInParent(fVar, fVar3);
                fVar.f56676b = null;
            } else if (fVar4 != null) {
                replaceInParent(fVar, fVar4);
                fVar.f56677c = null;
            } else {
                replaceInParent(fVar, null);
            }
            rebalance(fVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar3.f56683i > fVar4.f56683i) {
            fVar2 = fVar3.mo79771b();
        } else {
            fVar2 = fVar4.mo79770a();
        }
        removeInternal(fVar2, false);
        C22946f<K, V> fVar6 = fVar.f56676b;
        if (fVar6 != null) {
            i = fVar6.f56683i;
            fVar2.f56676b = fVar6;
            fVar6.f56675a = fVar2;
            fVar.f56676b = null;
        } else {
            i = 0;
        }
        C22946f<K, V> fVar7 = fVar.f56677c;
        if (fVar7 != null) {
            i2 = fVar7.f56683i;
            fVar2.f56677c = fVar7;
            fVar7.f56675a = fVar2;
            fVar.f56677c = null;
        }
        fVar2.f56683i = Math.max(i, i2) + 1;
        replaceInParent(fVar, fVar2);
    }

    /* access modifiers changed from: package-private */
    public C22946f<K, V> find(K k, boolean z) {
        int i;
        C22946f<K, V> fVar;
        C22946f<K, V> fVar2;
        K k2;
        int i2;
        C22946f<K, V> fVar3;
        Comparator<? super K> comparator2 = this.comparator;
        C22946f<K, V>[] fVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (fVarArr.length - 1) & secondaryHash;
        C22946f<K, V> fVar4 = fVarArr[length];
        if (fVar4 != null) {
            if (comparator2 == NATURAL_ORDER) {
                k2 = k;
            } else {
                k2 = null;
            }
            while (true) {
                if (k2 != null) {
                    i2 = k2.compareTo(fVar4.f56680f);
                } else {
                    i2 = comparator2.compare(k, fVar4.f56680f);
                }
                if (i2 == 0) {
                    return fVar4;
                }
                if (i2 < 0) {
                    fVar3 = fVar4.f56676b;
                } else {
                    fVar3 = fVar4.f56677c;
                }
                if (fVar3 == null) {
                    fVar = fVar4;
                    i = i2;
                    break;
                }
                fVar4 = fVar3;
            }
        } else {
            fVar = fVar4;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C22946f<K, V> fVar5 = this.header;
        if (fVar != null) {
            fVar2 = new C22946f<>(fVar, k, secondaryHash, fVar5, fVar5.f56679e);
            if (i < 0) {
                fVar.f56676b = fVar2;
            } else {
                fVar.f56677c = fVar2;
            }
            rebalance(fVar, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            fVar2 = new C22946f<>(fVar, k, secondaryHash, fVar5, fVar5.f56679e);
            fVarArr[length] = fVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return fVar2;
    }
}

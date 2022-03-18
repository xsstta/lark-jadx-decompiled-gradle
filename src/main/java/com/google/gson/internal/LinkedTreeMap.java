package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        /* class com.google.gson.internal.LinkedTreeMap.C229471 */

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.C22948a entrySet;
    final C22953d<K, V> header;
    private LinkedTreeMap<K, V>.C22950b keySet;
    int modCount;
    C22953d<K, V> root;
    int size;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    public static final class C22953d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C22953d<K, V> f56692a;

        /* renamed from: b */
        C22953d<K, V> f56693b;

        /* renamed from: c */
        C22953d<K, V> f56694c;

        /* renamed from: d */
        C22953d<K, V> f56695d;

        /* renamed from: e */
        C22953d<K, V> f56696e;

        /* renamed from: f */
        final K f56697f;

        /* renamed from: g */
        V f56698g;

        /* renamed from: h */
        int f56699h;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56697f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f56698g;
        }

        C22953d() {
            this.f56696e = this;
            this.f56695d = this;
        }

        /* renamed from: a */
        public C22953d<K, V> mo79809a() {
            C22953d<K, V> dVar = this;
            for (C22953d<K, V> dVar2 = this.f56693b; dVar2 != null; dVar2 = dVar2.f56693b) {
                dVar = dVar2;
            }
            return dVar;
        }

        /* renamed from: b */
        public C22953d<K, V> mo79810b() {
            C22953d<K, V> dVar = this;
            for (C22953d<K, V> dVar2 = this.f56694c; dVar2 != null; dVar2 = dVar2.f56694c) {
                dVar = dVar2;
            }
            return dVar;
        }

        public int hashCode() {
            int i;
            K k = this.f56697f;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f56698g;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public String toString() {
            return ((Object) this.f56697f) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) this.f56698g);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f56698g;
            this.f56698g = v;
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
                K r0 = r3.f56697f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f56698g
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.C22953d.equals(java.lang.Object):boolean");
        }

        C22953d(C22953d<K, V> dVar, K k, C22953d<K, V> dVar2, C22953d<K, V> dVar3) {
            this.f56692a = dVar;
            this.f56697f = k;
            this.f56699h = 1;
            this.f56695d = dVar2;
            this.f56696e = dVar3;
            dVar3.f56695d = this;
            dVar2.f56696e = this;
        }
    }

    public int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    public class C22948a extends AbstractSet<Map.Entry<K, V>> {
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.AbstractC22952c() {
                /* class com.google.gson.internal.LinkedTreeMap.C22948a.C229491 */

                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    return mo79806b();
                }

                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }
            };
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }

        C22948a() {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || LinkedTreeMap.this.findByEntry((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            C22953d<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    public final class C22950b extends AbstractSet<K> {
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.AbstractC22952c() {
                /* class com.google.gson.internal.LinkedTreeMap.C22950b.C229511 */

                @Override // java.util.Iterator
                public K next() {
                    return mo79806b().f56697f;
                }

                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }
            };
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }

        C22950b() {
        }

        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (LinkedTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    private abstract class AbstractC22952c<T> implements Iterator<T> {

        /* renamed from: b */
        C22953d<K, V> f56688b;

        /* renamed from: c */
        C22953d<K, V> f56689c;

        /* renamed from: d */
        int f56690d;

        public final boolean hasNext() {
            if (this.f56688b != LinkedTreeMap.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            C22953d<K, V> dVar = this.f56689c;
            if (dVar != null) {
                LinkedTreeMap.this.removeInternal(dVar, true);
                this.f56689c = null;
                this.f56690d = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C22953d<K, V> mo79806b() {
            C22953d<K, V> dVar = this.f56688b;
            if (dVar == LinkedTreeMap.this.header) {
                throw new NoSuchElementException();
            } else if (LinkedTreeMap.this.modCount == this.f56690d) {
                this.f56688b = dVar.f56695d;
                this.f56689c = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        AbstractC22952c() {
            this.f56688b = LinkedTreeMap.this.header.f56695d;
            this.f56690d = LinkedTreeMap.this.modCount;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.C22948a aVar = this.entrySet;
        if (aVar != null) {
            return aVar;
        }
        LinkedTreeMap<K, V>.C22948a aVar2 = new C22948a();
        this.entrySet = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.C22950b bVar = this.keySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.C22950b bVar2 = new C22950b();
        this.keySet = bVar2;
        return bVar2;
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C22953d<K, V> dVar = this.header;
        dVar.f56696e = dVar;
        dVar.f56695d = dVar;
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
    public C22953d<K, V> findByObject(Object obj) {
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
        C22953d<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f56698g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C22953d<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f56698g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C22953d<K, V> removeInternalByKey(Object obj) {
        C22953d<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public LinkedTreeMap(Comparator<? super K> comparator2) {
        this.header = new C22953d<>();
        this.comparator = comparator2 == null ? NATURAL_ORDER : comparator2;
    }

    /* access modifiers changed from: package-private */
    public C22953d<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z;
        C22953d<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f56698g, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return findByObject;
        }
        return null;
    }

    private void rotateLeft(C22953d<K, V> dVar) {
        int i;
        int i2;
        C22953d<K, V> dVar2 = dVar.f56693b;
        C22953d<K, V> dVar3 = dVar.f56694c;
        C22953d<K, V> dVar4 = dVar3.f56693b;
        C22953d<K, V> dVar5 = dVar3.f56694c;
        dVar.f56694c = dVar4;
        if (dVar4 != null) {
            dVar4.f56692a = dVar;
        }
        replaceInParent(dVar, dVar3);
        dVar3.f56693b = dVar;
        dVar.f56692a = dVar3;
        int i3 = 0;
        if (dVar2 != null) {
            i = dVar2.f56699h;
        } else {
            i = 0;
        }
        if (dVar4 != null) {
            i2 = dVar4.f56699h;
        } else {
            i2 = 0;
        }
        dVar.f56699h = Math.max(i, i2) + 1;
        int i4 = dVar.f56699h;
        if (dVar5 != null) {
            i3 = dVar5.f56699h;
        }
        dVar3.f56699h = Math.max(i4, i3) + 1;
    }

    private void rotateRight(C22953d<K, V> dVar) {
        int i;
        int i2;
        C22953d<K, V> dVar2 = dVar.f56693b;
        C22953d<K, V> dVar3 = dVar.f56694c;
        C22953d<K, V> dVar4 = dVar2.f56693b;
        C22953d<K, V> dVar5 = dVar2.f56694c;
        dVar.f56693b = dVar5;
        if (dVar5 != null) {
            dVar5.f56692a = dVar;
        }
        replaceInParent(dVar, dVar2);
        dVar2.f56694c = dVar;
        dVar.f56692a = dVar2;
        int i3 = 0;
        if (dVar3 != null) {
            i = dVar3.f56699h;
        } else {
            i = 0;
        }
        if (dVar5 != null) {
            i2 = dVar5.f56699h;
        } else {
            i2 = 0;
        }
        dVar.f56699h = Math.max(i, i2) + 1;
        int i4 = dVar.f56699h;
        if (dVar4 != null) {
            i3 = dVar4.f56699h;
        }
        dVar2.f56699h = Math.max(i4, i3) + 1;
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
        C22953d<K, V> find = find(k, true);
        V v2 = find.f56698g;
        find.f56698g = v;
        return v2;
    }

    private void replaceInParent(C22953d<K, V> dVar, C22953d<K, V> dVar2) {
        C22953d<K, V> dVar3 = dVar.f56692a;
        dVar.f56692a = null;
        if (dVar2 != null) {
            dVar2.f56692a = dVar3;
        }
        if (dVar3 == null) {
            this.root = dVar2;
        } else if (dVar3.f56693b == dVar) {
            dVar3.f56693b = dVar2;
        } else {
            dVar3.f56694c = dVar2;
        }
    }

    private void rebalance(C22953d<K, V> dVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (dVar != null) {
            C22953d<K, V> dVar2 = dVar.f56693b;
            C22953d<K, V> dVar3 = dVar.f56694c;
            int i5 = 0;
            if (dVar2 != null) {
                i = dVar2.f56699h;
            } else {
                i = 0;
            }
            if (dVar3 != null) {
                i2 = dVar3.f56699h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C22953d<K, V> dVar4 = dVar3.f56693b;
                C22953d<K, V> dVar5 = dVar3.f56694c;
                if (dVar5 != null) {
                    i4 = dVar5.f56699h;
                } else {
                    i4 = 0;
                }
                if (dVar4 != null) {
                    i5 = dVar4.f56699h;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    rotateLeft(dVar);
                } else {
                    rotateRight(dVar3);
                    rotateLeft(dVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C22953d<K, V> dVar6 = dVar2.f56693b;
                C22953d<K, V> dVar7 = dVar2.f56694c;
                if (dVar7 != null) {
                    i3 = dVar7.f56699h;
                } else {
                    i3 = 0;
                }
                if (dVar6 != null) {
                    i5 = dVar6.f56699h;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    rotateRight(dVar);
                } else {
                    rotateLeft(dVar2);
                    rotateRight(dVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                dVar.f56699h = i + 1;
                if (z) {
                    return;
                }
            } else {
                dVar.f56699h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.f56692a;
        }
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C22953d<K, V> dVar, boolean z) {
        C22953d<K, V> dVar2;
        int i;
        if (z) {
            dVar.f56696e.f56695d = dVar.f56695d;
            dVar.f56695d.f56696e = dVar.f56696e;
        }
        C22953d<K, V> dVar3 = dVar.f56693b;
        C22953d<K, V> dVar4 = dVar.f56694c;
        C22953d<K, V> dVar5 = dVar.f56692a;
        int i2 = 0;
        if (dVar3 == null || dVar4 == null) {
            if (dVar3 != null) {
                replaceInParent(dVar, dVar3);
                dVar.f56693b = null;
            } else if (dVar4 != null) {
                replaceInParent(dVar, dVar4);
                dVar.f56694c = null;
            } else {
                replaceInParent(dVar, null);
            }
            rebalance(dVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (dVar3.f56699h > dVar4.f56699h) {
            dVar2 = dVar3.mo79810b();
        } else {
            dVar2 = dVar4.mo79809a();
        }
        removeInternal(dVar2, false);
        C22953d<K, V> dVar6 = dVar.f56693b;
        if (dVar6 != null) {
            i = dVar6.f56699h;
            dVar2.f56693b = dVar6;
            dVar6.f56692a = dVar2;
            dVar.f56693b = null;
        } else {
            i = 0;
        }
        C22953d<K, V> dVar7 = dVar.f56694c;
        if (dVar7 != null) {
            i2 = dVar7.f56699h;
            dVar2.f56694c = dVar7;
            dVar7.f56692a = dVar2;
            dVar.f56694c = null;
        }
        dVar2.f56699h = Math.max(i, i2) + 1;
        replaceInParent(dVar, dVar2);
    }

    /* access modifiers changed from: package-private */
    public C22953d<K, V> find(K k, boolean z) {
        int i;
        C22953d<K, V> dVar;
        K k2;
        C22953d<K, V> dVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C22953d<K, V> dVar3 = this.root;
        if (dVar3 != null) {
            if (comparator2 == NATURAL_ORDER) {
                k2 = k;
            } else {
                k2 = null;
            }
            while (true) {
                if (k2 != null) {
                    i = k2.compareTo(dVar3.f56697f);
                } else {
                    i = comparator2.compare(k, dVar3.f56697f);
                }
                if (i == 0) {
                    return dVar3;
                }
                if (i < 0) {
                    dVar2 = dVar3.f56693b;
                } else {
                    dVar2 = dVar3.f56694c;
                }
                if (dVar2 == null) {
                    break;
                }
                dVar3 = dVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C22953d<K, V> dVar4 = this.header;
        if (dVar3 != null) {
            dVar = new C22953d<>(dVar3, k, dVar4, dVar4.f56696e);
            if (i < 0) {
                dVar3.f56693b = dVar;
            } else {
                dVar3.f56694c = dVar;
            }
            rebalance(dVar3, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            dVar = new C22953d<>(dVar3, k, dVar4, dVar4.f56696e);
            this.root = dVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return dVar;
    }
}

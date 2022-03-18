package com.google.protobuf;

import com.google.protobuf.C23112h;
import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.t */
public class C23189t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public List<C23189t<K, V>.C23194b> f57206a;

    /* renamed from: b */
    public Map<K, V> f57207b;

    /* renamed from: c */
    private final int f57208c;

    /* renamed from: d */
    private boolean f57209d;

    /* renamed from: e */
    private volatile C23189t<K, V>.C23196d f57210e;

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.t$a */
    public static class C23191a {

        /* renamed from: a */
        public static final Iterator<Object> f57211a = new Iterator<Object>() {
            /* class com.google.protobuf.C23189t.C23191a.C231921 */

            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b */
        private static final Iterable<Object> f57212b = new Iterable<Object>() {
            /* class com.google.protobuf.C23189t.C23191a.C231932 */

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C23191a.f57211a;
            }
        };

        /* renamed from: a */
        static <T> Iterable<T> m83976a() {
            return (Iterable<T>) f57212b;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.t$b */
    public class C23194b implements Comparable<C23189t<K, V>.C23194b>, Map.Entry<K, V> {

        /* renamed from: b */
        private final K f57214b;

        /* renamed from: c */
        private V f57215c;

        /* JADX WARN: Type inference failed for: r0v0, types: [K, K extends java.lang.Comparable<K>] */
        /* renamed from: a */
        public K getKey() {
            return this.f57214b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f57215c;
        }

        public int hashCode() {
            int i;
            K k = this.f57214b;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f57215c;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public String toString() {
            return ((Object) this.f57214b) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) this.f57215c);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C23189t.this.mo80431f();
            V v2 = this.f57215c;
            this.f57215c = v;
            return v2;
        }

        /* renamed from: a */
        public int compareTo(C23189t<K, V>.C23194b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m83977a(this.f57214b, entry.getKey()) || !m83977a(this.f57215c, entry.getValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m83977a(Object obj, Object obj2) {
            if (obj != null) {
                return obj.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
            return false;
        }

        C23194b(C23189t tVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        C23194b(K k, V v) {
            this.f57214b = k;
            this.f57215c = v;
        }
    }

    /* renamed from: b */
    public boolean mo80422b() {
        return this.f57209d;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.t$d */
    public class C23196d extends AbstractSet<Map.Entry<K, V>> {
        public void clear() {
            C23189t.this.clear();
        }

        public int size() {
            return C23189t.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C23195c();
        }

        private C23196d() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C23189t.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C23189t.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C23189t.this.remove(entry.getKey());
            return true;
        }
    }

    /* renamed from: c */
    public int mo80423c() {
        return this.f57206a.size();
    }

    /* renamed from: d */
    public int mo80427d() {
        return this.f57207b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f57210e == null) {
            this.f57210e = new C23196d();
        }
        return this.f57210e;
    }

    /* renamed from: f */
    public void mo80431f() {
        if (this.f57209d) {
            throw new UnsupportedOperationException();
        }
    }

    public int size() {
        return this.f57206a.size() + this.f57207b.size();
    }

    /* renamed from: com.google.protobuf.t$c */
    private class C23195c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private int f57217b;

        /* renamed from: c */
        private boolean f57218c;

        /* renamed from: d */
        private Iterator<Map.Entry<K, V>> f57219d;

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Iterator<java.util.Map$Entry<K, V>>, java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> */
        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m83980b() {
            if (this.f57219d == null) {
                this.f57219d = C23189t.this.f57207b.entrySet().iterator();
            }
            return (Iterator<Map.Entry<K, V>>) this.f57219d;
        }

        public boolean hasNext() {
            if (this.f57217b + 1 < C23189t.this.f57206a.size() || m83980b().hasNext()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f57218c = true;
            int i = this.f57217b + 1;
            this.f57217b = i;
            if (i < C23189t.this.f57206a.size()) {
                return C23189t.this.f57206a.get(this.f57217b);
            }
            return m83980b().next();
        }

        public void remove() {
            if (this.f57218c) {
                this.f57218c = false;
                C23189t.this.mo80431f();
                if (this.f57217b < C23189t.this.f57206a.size()) {
                    C23189t tVar = C23189t.this;
                    int i = this.f57217b;
                    this.f57217b = i - 1;
                    tVar.mo80424c(i);
                    return;
                }
                m83980b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        private C23195c() {
            this.f57217b = -1;
        }
    }

    /* renamed from: g */
    private SortedMap<K, V> m83964g() {
        mo80431f();
        if (this.f57207b.isEmpty() && !(this.f57207b instanceof TreeMap)) {
            this.f57207b = new TreeMap();
        }
        return (SortedMap) this.f57207b;
    }

    /* renamed from: h */
    private void m83965h() {
        mo80431f();
        if (this.f57206a.isEmpty() && !(this.f57206a instanceof ArrayList)) {
            this.f57206a = new ArrayList(this.f57208c);
        }
    }

    /* renamed from: a */
    public void mo80420a() {
        Map<K, V> map;
        if (!this.f57209d) {
            if (this.f57207b.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f57207b);
            }
            this.f57207b = map;
            this.f57209d = true;
        }
    }

    public void clear() {
        mo80431f();
        if (!this.f57206a.isEmpty()) {
            this.f57206a.clear();
        }
        if (!this.f57207b.isEmpty()) {
            this.f57207b.clear();
        }
    }

    /* renamed from: e */
    public Iterable<Map.Entry<K, V>> mo80428e() {
        if (this.f57207b.isEmpty()) {
            return C23191a.m83976a();
        }
        return this.f57207b.entrySet();
    }

    public int hashCode() {
        int c = mo80423c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f57206a.get(i2).hashCode();
        }
        if (mo80427d() > 0) {
            return i + this.f57207b.hashCode();
        }
        return i;
    }

    /* renamed from: a */
    static <FieldDescriptorType extends C23112h.AbstractC23114a<FieldDescriptorType>> C23189t<FieldDescriptorType, Object> m83963a(int i) {
        return new C23189t<FieldDescriptorType, Object>(i) {
            /* class com.google.protobuf.C23189t.C231901 */

            @Override // com.google.protobuf.C23189t
            /* renamed from: a */
            public void mo80420a() {
                if (!mo80422b()) {
                    for (int i = 0; i < mo80423c(); i++) {
                        Map.Entry<K, V> b = mo80421b(i);
                        if (((C23112h.AbstractC23114a) b.getKey()).mo80159b()) {
                            b.setValue((V) Collections.unmodifiableList(b.getValue()));
                        }
                    }
                    for (Map.Entry<K, V> entry : mo80428e()) {
                        if (((C23112h.AbstractC23114a) entry.getKey()).mo80159b()) {
                            entry.setValue((V) Collections.unmodifiableList(entry.getValue()));
                        }
                    }
                }
                C23189t.super.mo80420a();
            }

            @Override // java.util.AbstractMap, java.util.Map, com.google.protobuf.C23189t
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return C23189t.super.put((C23112h.AbstractC23114a) obj, obj2);
            }
        };
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo80421b(int i) {
        return this.f57206a.get(i);
    }

    private C23189t(int i) {
        this.f57208c = i;
        this.f57206a = Collections.emptyList();
        this.f57207b = Collections.emptyMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.t<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m83962a(comparable) >= 0 || this.f57207b.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.t<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m83962a(comparable);
        return a >= 0 ? (V) this.f57206a.get(a).getValue() : this.f57207b.get(comparable);
    }

    /* renamed from: c */
    public V mo80424c(int i) {
        mo80431f();
        V v = (V) this.f57206a.remove(i).getValue();
        if (!this.f57207b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m83964g().entrySet().iterator();
            this.f57206a.add(new C23194b(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.t<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        mo80431f();
        Comparable comparable = (Comparable) obj;
        int a = m83962a(comparable);
        if (a >= 0) {
            return (V) mo80424c(a);
        }
        if (this.f57207b.isEmpty()) {
            return null;
        }
        return this.f57207b.remove(comparable);
    }

    /* renamed from: a */
    private int m83962a(K k) {
        int size = this.f57206a.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f57206a.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f57206a.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23189t)) {
            return super.equals(obj);
        }
        C23189t tVar = (C23189t) obj;
        int size = size();
        if (size != tVar.size()) {
            return false;
        }
        int c = mo80423c();
        if (c != tVar.mo80423c()) {
            return entrySet().equals(tVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo80421b(i).equals(tVar.mo80421b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f57207b.equals(tVar.f57207b);
        }
        return true;
    }

    /* renamed from: a */
    public V put(K k, V v) {
        mo80431f();
        int a = m83962a(k);
        if (a >= 0) {
            return (V) this.f57206a.get(a).setValue(v);
        }
        m83965h();
        int i = -(a + 1);
        if (i >= this.f57208c) {
            return m83964g().put(k, v);
        }
        int size = this.f57206a.size();
        int i2 = this.f57208c;
        if (size == i2) {
            C23189t<K, V>.C23194b remove = this.f57206a.remove(i2 - 1);
            m83964g().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f57206a.add(i, new C23194b(k, v));
        return null;
    }
}

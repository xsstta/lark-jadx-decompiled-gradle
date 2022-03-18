package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: androidx.collection.f */
public abstract class AbstractC0519f<K, V> {

    /* renamed from: b */
    AbstractC0519f<K, V>.C0521b f1885b;

    /* renamed from: c */
    AbstractC0519f<K, V>.C0522c f1886c;

    /* renamed from: d */
    AbstractC0519f<K, V>.C0524e f1887d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2899a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2900a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2901a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo2902a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2903a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2904a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2905b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo2906b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2907c();

    AbstractC0519f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.collection.f$b */
    public final class C0521b implements Set<Map.Entry<K, V>> {
        public void clear() {
            AbstractC0519f.this.mo2907c();
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0523d();
        }

        public int size() {
            return AbstractC0519f.this.mo2899a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public boolean isEmpty() {
            if (AbstractC0519f.this.mo2899a() == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a = AbstractC0519f.this.mo2899a() - 1; a >= 0; a--) {
                Object a2 = AbstractC0519f.this.mo2901a(a, 0);
                Object a3 = AbstractC0519f.this.mo2901a(a, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        C0521b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return AbstractC0519f.m2357a((Set) this, obj);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.collection.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = AbstractC0519f.this.mo2899a();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC0519f.this.mo2904a(entry.getKey(), entry.getValue());
            }
            if (a != AbstractC0519f.this.mo2899a()) {
                return true;
            }
            return false;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = AbstractC0519f.this.mo2900a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0515b.m2329a(AbstractC0519f.this.mo2901a(a, 1), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.collection.f$c */
    public final class C0522c implements Set<K> {
        public void clear() {
            AbstractC0519f.this.mo2907c();
        }

        public int size() {
            return AbstractC0519f.this.mo2899a();
        }

        public Object[] toArray() {
            return AbstractC0519f.this.mo2984b(0);
        }

        public boolean isEmpty() {
            if (AbstractC0519f.this.mo2899a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0520a(0);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int a = AbstractC0519f.this.mo2899a() - 1; a >= 0; a--) {
                Object a2 = AbstractC0519f.this.mo2901a(a, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        C0522c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return AbstractC0519f.m2357a((Set) this, obj);
        }

        public boolean contains(Object obj) {
            if (AbstractC0519f.this.mo2900a(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0519f.m2356a((Map) AbstractC0519f.this.mo2906b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0519f.m2358b(AbstractC0519f.this.mo2906b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0519f.m2359c(AbstractC0519f.this.mo2906b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0519f.this.mo2983a(tArr, 0);
        }

        public boolean remove(Object obj) {
            int a = AbstractC0519f.this.mo2900a(obj);
            if (a < 0) {
                return false;
            }
            AbstractC0519f.this.mo2903a(a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.collection.f$e */
    public final class C0524e implements Collection<V> {
        public void clear() {
            AbstractC0519f.this.mo2907c();
        }

        public int size() {
            return AbstractC0519f.this.mo2899a();
        }

        public Object[] toArray() {
            return AbstractC0519f.this.mo2984b(1);
        }

        public boolean isEmpty() {
            if (AbstractC0519f.this.mo2899a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0520a(1);
        }

        C0524e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean contains(Object obj) {
            if (AbstractC0519f.this.mo2905b(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0519f.this.mo2983a(tArr, 1);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean remove(Object obj) {
            int b = AbstractC0519f.this.mo2905b(obj);
            if (b < 0) {
                return false;
            }
            AbstractC0519f.this.mo2903a(b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int a = AbstractC0519f.this.mo2899a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(AbstractC0519f.this.mo2901a(i, 1))) {
                    AbstractC0519f.this.mo2903a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int a = AbstractC0519f.this.mo2899a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(AbstractC0519f.this.mo2901a(i, 1))) {
                    AbstractC0519f.this.mo2903a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }
    }

    /* renamed from: androidx.collection.f$a */
    final class C0520a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1888a;

        /* renamed from: b */
        int f1889b;

        /* renamed from: c */
        int f1890c;

        /* renamed from: d */
        boolean f1891d;

        public boolean hasNext() {
            if (this.f1890c < this.f1889b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0519f.this.mo2901a(this.f1890c, this.f1888a);
                this.f1890c++;
                this.f1891d = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1891d) {
                int i = this.f1890c - 1;
                this.f1890c = i;
                this.f1889b--;
                this.f1891d = false;
                AbstractC0519f.this.mo2903a(i);
                return;
            }
            throw new IllegalStateException();
        }

        C0520a(int i) {
            this.f1888a = i;
            this.f1889b = AbstractC0519f.this.mo2899a();
        }
    }

    /* renamed from: androidx.collection.f$d */
    final class C0523d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f1895a;

        /* renamed from: b */
        int f1896b = -1;

        /* renamed from: c */
        boolean f1897c;

        public boolean hasNext() {
            if (this.f1896b < this.f1895a) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1896b++;
                this.f1897c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1897c) {
                return (K) AbstractC0519f.this.mo2901a(this.f1896b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1897c) {
                return (V) AbstractC0519f.this.mo2901a(this.f1896b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
        }

        public int hashCode() {
            int i;
            if (this.f1897c) {
                int i2 = 0;
                Object a = AbstractC0519f.this.mo2901a(this.f1896b, 0);
                Object a2 = AbstractC0519f.this.mo2901a(this.f1896b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f1897c) {
                AbstractC0519f.this.mo2903a(this.f1896b);
                this.f1896b--;
                this.f1895a--;
                this.f1897c = false;
                return;
            }
            throw new IllegalStateException();
        }

        C0523d() {
            this.f1895a = AbstractC0519f.this.mo2899a() - 1;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1897c) {
                return (V) AbstractC0519f.this.mo2902a(this.f1896b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (!this.f1897c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0515b.m2329a(entry.getKey(), AbstractC0519f.this.mo2901a(this.f1896b, 0)) || !C0515b.m2329a(entry.getValue(), AbstractC0519f.this.mo2901a(this.f1896b, 1))) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo2985d() {
        if (this.f1885b == null) {
            this.f1885b = new C0521b();
        }
        return this.f1885b;
    }

    /* renamed from: e */
    public Set<K> mo2986e() {
        if (this.f1886c == null) {
            this.f1886c = new C0522c();
        }
        return this.f1886c;
    }

    /* renamed from: f */
    public Collection<V> mo2987f() {
        if (this.f1887d == null) {
            this.f1887d = new C0524e();
        }
        return this.f1887d;
    }

    /* renamed from: b */
    public Object[] mo2984b(int i) {
        int a = mo2899a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2901a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <K, V> boolean m2356a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m2358b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m2357a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <K, V> boolean m2359c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T[] mo2983a(T[] tArr, int i) {
        int a = mo2899a();
        if (tArr.length < a) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), a));
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo2901a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }
}

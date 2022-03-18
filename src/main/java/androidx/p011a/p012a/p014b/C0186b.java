package androidx.p011a.p012a.p014b;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.a.a.b.b */
public class C0186b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    C0189c<K, V> f412a;

    /* renamed from: b */
    private C0189c<K, V> f413b;

    /* renamed from: c */
    private WeakHashMap<AbstractC0192f<K, V>, Boolean> f414c = new WeakHashMap<>();

    /* renamed from: d */
    private int f415d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.a.a.b.b$f */
    public interface AbstractC0192f<K, V> {
        void a_(C0189c<K, V> cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.a.a.b.b$c */
    public static class C0189c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f416a;

        /* renamed from: b */
        final V f417b;

        /* renamed from: c */
        C0189c<K, V> f418c;

        /* renamed from: d */
        C0189c<K, V> f419d;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f416a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f417b;
        }

        public int hashCode() {
            return this.f416a.hashCode() ^ this.f417b.hashCode();
        }

        public String toString() {
            return ((Object) this.f416a) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) this.f417b);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0189c)) {
                return false;
            }
            C0189c cVar = (C0189c) obj;
            if (!this.f416a.equals(cVar.f416a) || !this.f417b.equals(cVar.f417b)) {
                return false;
            }
            return true;
        }

        C0189c(K k, V v) {
            this.f416a = k;
            this.f417b = v;
        }
    }

    /* renamed from: a */
    public int mo560a() {
        return this.f415d;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo564d() {
        return this.f412a;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo565e() {
        return this.f413b;
    }

    /* renamed from: androidx.a.a.b.b$e */
    private static abstract class AbstractC0191e<K, V> implements AbstractC0192f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0189c<K, V> f423a;

        /* renamed from: b */
        C0189c<K, V> f424b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0189c<K, V> mo570a(C0189c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0189c<K, V> mo571b(C0189c<K, V> cVar);

        public boolean hasNext() {
            if (this.f424b != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private C0189c<K, V> m618b() {
            C0189c<K, V> cVar = this.f424b;
            C0189c<K, V> cVar2 = this.f423a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo570a(cVar);
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0189c<K, V> cVar = this.f424b;
            this.f424b = m618b();
            return cVar;
        }

        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0192f
        public void a_(C0189c<K, V> cVar) {
            if (this.f423a == cVar && cVar == this.f424b) {
                this.f424b = null;
                this.f423a = null;
            }
            C0189c<K, V> cVar2 = this.f423a;
            if (cVar2 == cVar) {
                this.f423a = mo571b(cVar2);
            }
            if (this.f424b == cVar) {
                this.f424b = m618b();
            }
        }

        AbstractC0191e(C0189c<K, V> cVar, C0189c<K, V> cVar2) {
            this.f423a = cVar2;
            this.f424b = cVar;
        }
    }

    /* renamed from: c */
    public C0186b<K, V>.C0190d mo563c() {
        C0186b<K, V>.C0190d dVar = new C0190d();
        this.f414c.put(dVar, false);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.a.a.b.b$d */
    public class C0190d implements AbstractC0192f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0189c<K, V> f421b;

        /* renamed from: c */
        private boolean f422c = true;

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0189c<K, V> cVar;
            if (this.f422c) {
                this.f422c = false;
                this.f421b = C0186b.this.f412a;
            } else {
                C0189c<K, V> cVar2 = this.f421b;
                if (cVar2 != null) {
                    cVar = cVar2.f418c;
                } else {
                    cVar = null;
                }
                this.f421b = cVar;
            }
            return this.f421b;
        }

        public boolean hasNext() {
            if (!this.f422c) {
                C0189c<K, V> cVar = this.f421b;
                if (cVar == null || cVar.f418c == null) {
                    return false;
                }
                return true;
            } else if (C0186b.this.f412a != null) {
                return true;
            } else {
                return false;
            }
        }

        C0190d() {
        }

        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0192f
        public void a_(C0189c<K, V> cVar) {
            boolean z;
            C0189c<K, V> cVar2 = this.f421b;
            if (cVar == cVar2) {
                C0189c<K, V> cVar3 = cVar2.f419d;
                this.f421b = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f422c = z;
            }
        }
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0187a aVar = new C0187a(this.f412a, this.f413b);
        this.f414c.put(aVar, false);
        return aVar;
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo562b() {
        C0188b bVar = new C0188b(this.f413b, this.f412a);
        this.f414c.put(bVar, false);
        return bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.a.a.b.b$a */
    public static class C0187a<K, V> extends AbstractC0191e<K, V> {
        /* access modifiers changed from: package-private */
        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0191e
        /* renamed from: a */
        public C0189c<K, V> mo570a(C0189c<K, V> cVar) {
            return cVar.f418c;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0191e
        /* renamed from: b */
        public C0189c<K, V> mo571b(C0189c<K, V> cVar) {
            return cVar.f419d;
        }

        C0187a(C0189c<K, V> cVar, C0189c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: androidx.a.a.b.b$b */
    private static class C0188b<K, V> extends AbstractC0191e<K, V> {
        /* access modifiers changed from: package-private */
        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0191e
        /* renamed from: a */
        public C0189c<K, V> mo570a(C0189c<K, V> cVar) {
            return cVar.f419d;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p011a.p012a.p014b.C0186b.AbstractC0191e
        /* renamed from: b */
        public C0189c<K, V> mo571b(C0189c<K, V> cVar) {
            return cVar.f418c;
        }

        C0188b(C0189c<K, V> cVar, C0189c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0189c<K, V> mo555a(K k) {
        C0189c<K, V> cVar = this.f412a;
        while (cVar != null && !cVar.f416a.equals(k)) {
            cVar = cVar.f418c;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo557b(K k) {
        C0189c<K, V> a = mo555a(k);
        if (a == null) {
            return null;
        }
        this.f415d--;
        if (!this.f414c.isEmpty()) {
            for (AbstractC0192f<K, V> fVar : this.f414c.keySet()) {
                fVar.a_(a);
            }
        }
        if (a.f419d != null) {
            a.f419d.f418c = a.f418c;
        } else {
            this.f412a = a.f418c;
        }
        if (a.f418c != null) {
            a.f418c.f419d = a.f419d;
        } else {
            this.f413b = a.f419d;
        }
        a.f418c = null;
        a.f419d = null;
        return a.f417b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0186b)) {
            return false;
        }
        C0186b bVar = (C0186b) obj;
        if (mo560a() != bVar.mo560a()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public V mo556a(K k, V v) {
        C0189c<K, V> a = mo555a(k);
        if (a != null) {
            return a.f417b;
        }
        mo561b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0189c<K, V> mo561b(K k, V v) {
        C0189c<K, V> cVar = new C0189c<>(k, v);
        this.f415d++;
        C0189c<K, V> cVar2 = this.f413b;
        if (cVar2 == null) {
            this.f412a = cVar;
            this.f413b = cVar;
            return cVar;
        }
        cVar2.f418c = cVar;
        cVar.f419d = this.f413b;
        this.f413b = cVar;
        return cVar;
    }
}

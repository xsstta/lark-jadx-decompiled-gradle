package com.bumptech.glide.load.engine.p087a;

import com.bumptech.glide.load.engine.p087a.AbstractC2296m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.a.h */
public class C2286h<K extends AbstractC2296m, V> {

    /* renamed from: a */
    private final C2287a<K, V> f7628a = new C2287a<>();

    /* renamed from: b */
    private final Map<K, C2287a<K, V>> f7629b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.a.h$a */
    public static class C2287a<K, V> {

        /* renamed from: a */
        final K f7630a;

        /* renamed from: b */
        C2287a<K, V> f7631b;

        /* renamed from: c */
        C2287a<K, V> f7632c;

        /* renamed from: d */
        private List<V> f7633d;

        C2287a() {
            this(null);
        }

        /* renamed from: b */
        public int mo10703b() {
            List<V> list = this.f7633d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: a */
        public V mo10701a() {
            int b = mo10703b();
            if (b > 0) {
                return this.f7633d.remove(b - 1);
            }
            return null;
        }

        C2287a(K k) {
            this.f7632c = this;
            this.f7631b = this;
            this.f7630a = k;
        }

        /* renamed from: a */
        public void mo10702a(V v) {
            if (this.f7633d == null) {
                this.f7633d = new ArrayList();
            }
            this.f7633d.add(v);
        }
    }

    C2286h() {
    }

    /* renamed from: a */
    public V mo10697a() {
        for (C2287a<K, V> aVar = this.f7628a.f7632c; !aVar.equals(this.f7628a); aVar = aVar.f7632c) {
            V a = aVar.mo10701a();
            if (a != null) {
                return a;
            }
            m9772d(aVar);
            this.f7629b.remove(aVar.f7630a);
            aVar.f7630a.mo10680a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C2287a<K, V> aVar = this.f7628a.f7631b; !aVar.equals(this.f7628a); aVar = aVar.f7631b) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.f7630a);
            sb.append(':');
            sb.append(aVar.mo10703b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: c */
    private static <K, V> void m9771c(C2287a<K, V> aVar) {
        aVar.f7631b.f7632c = aVar;
        aVar.f7632c.f7631b = aVar;
    }

    /* renamed from: d */
    private static <K, V> void m9772d(C2287a<K, V> aVar) {
        aVar.f7632c.f7631b = aVar.f7631b;
        aVar.f7631b.f7632c = aVar.f7632c;
    }

    /* renamed from: a */
    private void m9769a(C2287a<K, V> aVar) {
        m9772d(aVar);
        aVar.f7632c = this.f7628a;
        aVar.f7631b = this.f7628a.f7631b;
        m9771c(aVar);
    }

    /* renamed from: b */
    private void m9770b(C2287a<K, V> aVar) {
        m9772d(aVar);
        aVar.f7632c = this.f7628a.f7632c;
        aVar.f7631b = this.f7628a;
        m9771c(aVar);
    }

    /* renamed from: a */
    public V mo10698a(K k) {
        C2287a<K, V> aVar = this.f7629b.get(k);
        if (aVar == null) {
            aVar = new C2287a<>(k);
            this.f7629b.put(k, aVar);
        } else {
            k.mo10680a();
        }
        m9769a(aVar);
        return aVar.mo10701a();
    }

    /* renamed from: a */
    public void mo10699a(K k, V v) {
        C2287a<K, V> aVar = this.f7629b.get(k);
        if (aVar == null) {
            aVar = new C2287a<>(k);
            m9770b(aVar);
            this.f7629b.put(k, aVar);
        } else {
            k.mo10680a();
        }
        aVar.mo10702a(v);
    }
}

package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7310h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.e */
class C7303e<K extends AbstractC7310h, V> {

    /* renamed from: a */
    private final C7304a<K, V> f19564a = new C7304a<>();

    /* renamed from: b */
    private final Map<K, C7304a<K, V>> f19565b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.e$a */
    public static class C7304a<K, V> {

        /* renamed from: a */
        public final K f19566a;

        /* renamed from: b */
        C7304a<K, V> f19567b;

        /* renamed from: c */
        C7304a<K, V> f19568c;

        /* renamed from: d */
        private List<V> f19569d;

        public C7304a() {
            this(null);
        }

        /* renamed from: b */
        public int mo28514b() {
            List<V> list = this.f19569d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: a */
        public V mo28512a() {
            int b = mo28514b();
            if (b > 0) {
                return this.f19569d.remove(b - 1);
            }
            return null;
        }

        public C7304a(K k) {
            this.f19568c = this;
            this.f19567b = this;
            this.f19566a = k;
        }

        /* renamed from: a */
        public void mo28513a(V v) {
            if (this.f19569d == null) {
                this.f19569d = new ArrayList();
            }
            this.f19569d.add(v);
        }
    }

    C7303e() {
    }

    /* renamed from: a */
    public V mo28508a() {
        for (C7304a<K, V> aVar = this.f19564a.f19568c; !aVar.equals(this.f19564a); aVar = aVar.f19568c) {
            V a = aVar.mo28512a();
            if (a != null) {
                return a;
            }
            m29175d(aVar);
            this.f19565b.remove(aVar.f19566a);
            aVar.f19566a.mo28495a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C7304a<K, V> aVar = this.f19564a.f19567b; !aVar.equals(this.f19564a); aVar = aVar.f19567b) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.f19566a);
            sb.append(':');
            sb.append(aVar.mo28514b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: c */
    private static <K, V> void m29174c(C7304a<K, V> aVar) {
        aVar.f19567b.f19568c = aVar;
        aVar.f19568c.f19567b = aVar;
    }

    /* renamed from: d */
    private static <K, V> void m29175d(C7304a<K, V> aVar) {
        aVar.f19568c.f19567b = aVar.f19567b;
        aVar.f19567b.f19568c = aVar.f19568c;
    }

    /* renamed from: a */
    private void m29172a(C7304a<K, V> aVar) {
        m29175d(aVar);
        aVar.f19568c = this.f19564a;
        aVar.f19567b = this.f19564a.f19567b;
        m29174c(aVar);
    }

    /* renamed from: b */
    private void m29173b(C7304a<K, V> aVar) {
        m29175d(aVar);
        aVar.f19568c = this.f19564a.f19568c;
        aVar.f19567b = this.f19564a;
        m29174c(aVar);
    }

    /* renamed from: a */
    public V mo28509a(K k) {
        C7304a<K, V> aVar = this.f19565b.get(k);
        if (aVar == null) {
            aVar = new C7304a<>(k);
            this.f19565b.put(k, aVar);
        } else {
            k.mo28495a();
        }
        m29172a(aVar);
        return aVar.mo28512a();
    }

    /* renamed from: a */
    public void mo28510a(K k, V v) {
        C7304a<K, V> aVar = this.f19565b.get(k);
        if (aVar == null) {
            aVar = new C7304a<>(k);
            m29173b(aVar);
            this.f19565b.put(k, aVar);
        } else {
            k.mo28495a();
        }
        aVar.mo28513a(v);
    }
}

package androidx.p011a.p012a.p014b;

import androidx.p011a.p012a.p014b.C0186b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.a.a.b.a */
public class C0185a<K, V> extends C0186b<K, V> {

    /* renamed from: b */
    private HashMap<K, C0186b.C0189c<K, V>> f411b = new HashMap<>();

    /* renamed from: c */
    public boolean mo558c(K k) {
        return this.f411b.containsKey(k);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p011a.p012a.p014b.C0186b
    /* renamed from: a */
    public C0186b.C0189c<K, V> mo555a(K k) {
        return this.f411b.get(k);
    }

    @Override // androidx.p011a.p012a.p014b.C0186b
    /* renamed from: b */
    public V mo557b(K k) {
        V v = (V) super.mo557b(k);
        this.f411b.remove(k);
        return v;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo559d(K k) {
        if (mo558c(k)) {
            return this.f411b.get(k).f419d;
        }
        return null;
    }

    @Override // androidx.p011a.p012a.p014b.C0186b
    /* renamed from: a */
    public V mo556a(K k, V v) {
        C0186b.C0189c<K, V> a = mo555a(k);
        if (a != null) {
            return a.f417b;
        }
        this.f411b.put(k, mo561b(k, v));
        return null;
    }
}

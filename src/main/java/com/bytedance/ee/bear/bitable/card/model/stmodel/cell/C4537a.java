package com.bytedance.ee.bear.bitable.card.model.stmodel.cell;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4532f;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.util.common.ReflectUtils;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.cell.a */
public class C4537a<V> {

    /* renamed from: a */
    private C4533g f13354a;

    /* renamed from: b */
    private C4525a f13355b;

    /* renamed from: c */
    private int f13356c;

    /* renamed from: d */
    private boolean f13357d;

    /* renamed from: e */
    private EFieldUneditableReason f13358e;

    /* renamed from: f */
    private V f13359f;

    /* renamed from: a */
    public C4533g mo17829a() {
        return this.f13354a;
    }

    /* renamed from: b */
    public C4525a mo17834b() {
        return this.f13355b;
    }

    /* renamed from: c */
    public V mo17835c() {
        return this.f13359f;
    }

    /* renamed from: d */
    public int mo17836d() {
        return this.f13356c;
    }

    /* renamed from: e */
    public boolean mo17837e() {
        return this.f13357d;
    }

    /* renamed from: f */
    public EFieldUneditableReason mo17839f() {
        return this.f13358e;
    }

    /* renamed from: g */
    public EFieldType mo17840g() {
        C4533g gVar = this.f13354a;
        if (gVar instanceof C4532f) {
            return ((C4532f) gVar).mo17744b();
        }
        return null;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo17829a() != null) {
            i = mo17829a().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (mo17834b() != null) {
            i2 = mo17834b().hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: a */
    public void mo17831a(int i) {
        this.f13356c = i;
    }

    /* renamed from: a */
    public void mo17832a(C4533g gVar) {
        this.f13354a = gVar;
    }

    /* renamed from: a */
    public void mo17833a(V v) {
        this.f13359f = v;
    }

    /* renamed from: a */
    public <E> E mo17830a(Class<E> cls) {
        E e;
        V v = this.f13359f;
        if (!(v instanceof List) || v.isEmpty() || (e = (E) this.f13359f.get(0)) == null || e.getClass() != ReflectUtils.m55226a((Class<?>) cls)) {
            return null;
        }
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4537a)) {
            return false;
        }
        C4537a aVar = (C4537a) obj;
        if (mo17829a() == null ? aVar.mo17829a() != null : !mo17829a().equals(aVar.mo17829a())) {
            return false;
        }
        if (mo17834b() != null) {
            return mo17834b().equals(aVar.mo17834b());
        }
        if (aVar.mo17834b() == null) {
            return true;
        }
        return false;
    }

    public C4537a(C4525a aVar, V v, boolean z, EFieldUneditableReason eFieldUneditableReason) {
        boolean z2;
        this.f13355b = aVar;
        this.f13359f = v;
        if (!z || !aVar.mo17716i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f13357d = z2;
        this.f13358e = eFieldUneditableReason;
    }
}

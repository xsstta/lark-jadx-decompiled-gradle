package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2340f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.v */
class C2384v implements AbstractC2147d.AbstractC2148a<Object>, AbstractC2340f {

    /* renamed from: a */
    private final AbstractC2340f.AbstractC2341a f7901a;

    /* renamed from: b */
    private final C2342g<?> f7902b;

    /* renamed from: c */
    private int f7903c;

    /* renamed from: d */
    private int f7904d = -1;

    /* renamed from: e */
    private AbstractC2265c f7905e;

    /* renamed from: f */
    private List<AbstractC2233n<File, ?>> f7906f;

    /* renamed from: g */
    private int f7907g;

    /* renamed from: h */
    private volatile AbstractC2233n.C2234a<?> f7908h;

    /* renamed from: i */
    private File f7909i;

    /* renamed from: j */
    private C2385w f7910j;

    /* renamed from: c */
    private boolean m10112c() {
        if (this.f7907g < this.f7906f.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: b */
    public void mo10760b() {
        AbstractC2233n.C2234a<?> aVar = this.f7908h;
        if (aVar != null) {
            aVar.f7558c.mo10490c();
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: a */
    public boolean mo10759a() {
        List<AbstractC2265c> o = this.f7902b.mo10810o();
        boolean z = false;
        if (o.isEmpty()) {
            return false;
        }
        List<Class<?>> l = this.f7902b.mo10807l();
        if (!l.isEmpty()) {
            while (true) {
                if (this.f7906f == null || !m10112c()) {
                    int i = this.f7904d + 1;
                    this.f7904d = i;
                    if (i >= l.size()) {
                        int i2 = this.f7903c + 1;
                        this.f7903c = i2;
                        if (i2 >= o.size()) {
                            return false;
                        }
                        this.f7904d = 0;
                    }
                    AbstractC2265c cVar = o.get(this.f7903c);
                    Class<?> cls = l.get(this.f7904d);
                    this.f7910j = new C2385w(this.f7902b.mo10804i(), cVar, this.f7902b.mo10801f(), this.f7902b.mo10802g(), this.f7902b.mo10803h(), this.f7902b.mo10798c(cls), cls, this.f7902b.mo10800e());
                    File a = this.f7902b.mo10794b().mo10722a(this.f7910j);
                    this.f7909i = a;
                    if (a != null) {
                        this.f7905e = cVar;
                        this.f7906f = this.f7902b.mo10788a(a);
                        this.f7907g = 0;
                    }
                } else {
                    this.f7908h = null;
                    while (!z && m10112c()) {
                        List<AbstractC2233n<File, ?>> list = this.f7906f;
                        int i3 = this.f7907g;
                        this.f7907g = i3 + 1;
                        this.f7908h = list.get(i3).mo10534a(this.f7909i, this.f7902b.mo10802g(), this.f7902b.mo10803h(), this.f7902b.mo10800e());
                        if (this.f7908h != null && this.f7902b.mo10793a((Class<?>) this.f7908h.f7558c.mo10481a())) {
                            this.f7908h.f7558c.mo10488a(this.f7902b.mo10799d(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f7902b.mo10805j())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f7902b.mo10806k() + " to " + this.f7902b.mo10805j());
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
    /* renamed from: a */
    public void mo10502a(Exception exc) {
        this.f7901a.mo10784a(this.f7910j, exc, this.f7908h.f7558c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
    /* renamed from: a */
    public void mo10503a(Object obj) {
        this.f7901a.mo10785a(this.f7905e, obj, this.f7908h.f7558c, DataSource.RESOURCE_DISK_CACHE, this.f7910j);
    }

    C2384v(C2342g<?> gVar, AbstractC2340f.AbstractC2341a aVar) {
        this.f7902b = gVar;
        this.f7901a = aVar;
    }
}

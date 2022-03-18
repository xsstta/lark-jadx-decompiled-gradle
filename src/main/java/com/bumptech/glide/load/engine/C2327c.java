package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2340f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.c */
class C2327c implements AbstractC2147d.AbstractC2148a<Object>, AbstractC2340f {

    /* renamed from: a */
    private final List<AbstractC2265c> f7711a;

    /* renamed from: b */
    private final C2342g<?> f7712b;

    /* renamed from: c */
    private final AbstractC2340f.AbstractC2341a f7713c;

    /* renamed from: d */
    private int f7714d;

    /* renamed from: e */
    private AbstractC2265c f7715e;

    /* renamed from: f */
    private List<AbstractC2233n<File, ?>> f7716f;

    /* renamed from: g */
    private int f7717g;

    /* renamed from: h */
    private volatile AbstractC2233n.C2234a<?> f7718h;

    /* renamed from: i */
    private File f7719i;

    /* renamed from: c */
    private boolean m9908c() {
        if (this.f7717g < this.f7716f.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: b */
    public void mo10760b() {
        AbstractC2233n.C2234a<?> aVar = this.f7718h;
        if (aVar != null) {
            aVar.f7558c.mo10490c();
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: a */
    public boolean mo10759a() {
        while (true) {
            boolean z = false;
            if (this.f7716f == null || !m9908c()) {
                int i = this.f7714d + 1;
                this.f7714d = i;
                if (i >= this.f7711a.size()) {
                    return false;
                }
                AbstractC2265c cVar = this.f7711a.get(this.f7714d);
                File a = this.f7712b.mo10794b().mo10722a(new C2338d(cVar, this.f7712b.mo10801f()));
                this.f7719i = a;
                if (a != null) {
                    this.f7715e = cVar;
                    this.f7716f = this.f7712b.mo10788a(a);
                    this.f7717g = 0;
                }
            } else {
                this.f7718h = null;
                while (!z && m9908c()) {
                    List<AbstractC2233n<File, ?>> list = this.f7716f;
                    int i2 = this.f7717g;
                    this.f7717g = i2 + 1;
                    this.f7718h = list.get(i2).mo10534a(this.f7719i, this.f7712b.mo10802g(), this.f7712b.mo10803h(), this.f7712b.mo10800e());
                    if (this.f7718h != null && this.f7712b.mo10793a((Class<?>) this.f7718h.f7558c.mo10481a())) {
                        this.f7718h.f7558c.mo10488a(this.f7712b.mo10799d(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
    /* renamed from: a */
    public void mo10502a(Exception exc) {
        this.f7713c.mo10784a(this.f7715e, exc, this.f7718h.f7558c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
    /* renamed from: a */
    public void mo10503a(Object obj) {
        this.f7713c.mo10785a(this.f7715e, obj, this.f7718h.f7558c, DataSource.DATA_DISK_CACHE, this.f7715e);
    }

    C2327c(C2342g<?> gVar, AbstractC2340f.AbstractC2341a aVar) {
        this(gVar.mo10810o(), gVar, aVar);
    }

    C2327c(List<AbstractC2265c> list, C2342g<?> gVar, AbstractC2340f.AbstractC2341a aVar) {
        this.f7714d = -1;
        this.f7711a = list;
        this.f7712b = gVar;
        this.f7713c = aVar;
    }
}

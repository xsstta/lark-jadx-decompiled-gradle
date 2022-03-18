package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2136a;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2340f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.util.C2563f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.y */
class C2388y implements AbstractC2340f, AbstractC2340f.AbstractC2341a {

    /* renamed from: a */
    private final C2342g<?> f7922a;

    /* renamed from: b */
    private final AbstractC2340f.AbstractC2341a f7923b;

    /* renamed from: c */
    private int f7924c;

    /* renamed from: d */
    private C2327c f7925d;

    /* renamed from: e */
    private Object f7926e;

    /* renamed from: f */
    private volatile AbstractC2233n.C2234a<?> f7927f;

    /* renamed from: g */
    private C2338d f7928g;

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: c */
    public void mo10786c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: b */
    public void mo10760b() {
        AbstractC2233n.C2234a<?> aVar = this.f7927f;
        if (aVar != null) {
            aVar.f7558c.mo10490c();
        }
    }

    /* renamed from: d */
    private boolean m10122d() {
        if (this.f7924c < this.f7922a.mo10809n().size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f
    /* renamed from: a */
    public boolean mo10759a() {
        Object obj = this.f7926e;
        if (obj != null) {
            this.f7926e = null;
            m10120a(obj);
        }
        C2327c cVar = this.f7925d;
        if (cVar != null && cVar.mo10759a()) {
            return true;
        }
        this.f7925d = null;
        this.f7927f = null;
        boolean z = false;
        while (!z && m10122d()) {
            List<AbstractC2233n.C2234a<?>> n = this.f7922a.mo10809n();
            int i = this.f7924c;
            this.f7924c = i + 1;
            this.f7927f = n.get(i);
            if (this.f7927f != null && (this.f7922a.mo10797c().mo10835a(this.f7927f.f7558c.mo10491d()) || this.f7922a.mo10793a((Class<?>) this.f7927f.f7558c.mo10481a()))) {
                m10121b(this.f7927f);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m10121b(final AbstractC2233n.C2234a<?> aVar) {
        this.f7927f.f7558c.mo10488a(this.f7922a.mo10799d(), new AbstractC2147d.AbstractC2148a<Object>() {
            /* class com.bumptech.glide.load.engine.C2388y.C23891 */

            @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
            /* renamed from: a */
            public void mo10502a(Exception exc) {
                if (C2388y.this.mo10898a(aVar)) {
                    C2388y.this.mo10896a(aVar, exc);
                }
            }

            @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
            /* renamed from: a */
            public void mo10503a(Object obj) {
                if (C2388y.this.mo10898a(aVar)) {
                    C2388y.this.mo10897a(aVar, obj);
                }
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m10120a(Object obj) {
        long a = C2563f.m10880a();
        try {
            AbstractC2136a<X> a2 = this.f7922a.mo10787a(obj);
            C2339e eVar = new C2339e(a2, obj, this.f7922a.mo10800e());
            this.f7928g = new C2338d(this.f7927f.f7556a, this.f7922a.mo10801f());
            this.f7922a.mo10794b().mo10723a(this.f7928g, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f7928g + ", data: " + obj + ", encoder: " + a2 + ", duration: " + C2563f.m10879a(a));
            }
            this.f7927f.f7558c.mo10489b();
            this.f7925d = new C2327c(Collections.singletonList(this.f7927f.f7556a), this.f7922a, this);
        } catch (Throwable th) {
            this.f7927f.f7558c.mo10489b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10898a(AbstractC2233n.C2234a<?> aVar) {
        AbstractC2233n.C2234a<?> aVar2 = this.f7927f;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    C2388y(C2342g<?> gVar, AbstractC2340f.AbstractC2341a aVar) {
        this.f7922a = gVar;
        this.f7923b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10896a(AbstractC2233n.C2234a<?> aVar, Exception exc) {
        this.f7923b.mo10784a(this.f7928g, exc, aVar.f7558c, aVar.f7558c.mo10491d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10897a(AbstractC2233n.C2234a<?> aVar, Object obj) {
        AbstractC2354j c = this.f7922a.mo10797c();
        if (obj == null || !c.mo10835a(aVar.f7558c.mo10491d())) {
            this.f7923b.mo10785a(aVar.f7556a, obj, aVar.f7558c, aVar.f7558c.mo10491d(), this.f7928g);
            return;
        }
        this.f7926e = obj;
        this.f7923b.mo10786c();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: a */
    public void mo10784a(AbstractC2265c cVar, Exception exc, AbstractC2147d<?> dVar, DataSource dataSource) {
        this.f7923b.mo10784a(cVar, exc, dVar, this.f7927f.f7558c.mo10491d());
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2340f.AbstractC2341a
    /* renamed from: a */
    public void mo10785a(AbstractC2265c cVar, Object obj, AbstractC2147d<?> dVar, DataSource dataSource, AbstractC2265c cVar2) {
        this.f7923b.mo10785a(cVar, obj, dVar, this.f7927f.f7558c.mo10491d(), cVar);
    }
}

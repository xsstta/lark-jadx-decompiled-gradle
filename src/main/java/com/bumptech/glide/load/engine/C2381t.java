package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.p097a.AbstractC2554c;
import com.bumptech.glide.util.p097a.C2545a;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.t */
public final class C2381t<Z> implements AbstractC2383u<Z>, C2545a.AbstractC2551c {

    /* renamed from: a */
    private static final Pools.AbstractC0839a<C2381t<?>> f7896a = C2545a.m10851a(20, new C2545a.AbstractC2549a<C2381t<?>>() {
        /* class com.bumptech.glide.load.engine.C2381t.C23821 */

        /* renamed from: a */
        public C2381t<?> mo10754b() {
            return new C2381t<>();
        }
    });

    /* renamed from: b */
    private final AbstractC2554c f7897b = AbstractC2554c.m10866a();

    /* renamed from: c */
    private AbstractC2383u<Z> f7898c;

    /* renamed from: d */
    private boolean f7899d;

    /* renamed from: e */
    private boolean f7900e;

    @Override // com.bumptech.glide.util.p097a.C2545a.AbstractC2551c
    public AbstractC2554c e_() {
        return this.f7897b;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<Z> mo10877c() {
        return this.f7898c.mo10877c();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: d */
    public Z mo10878d() {
        return this.f7898c.mo10878d();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return this.f7898c.mo10879e();
    }

    C2381t() {
    }

    /* renamed from: b */
    private void m10099b() {
        this.f7898c = null;
        f7896a.release(this);
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public synchronized void mo10880f() {
        this.f7897b.mo11228b();
        this.f7900e = true;
        if (!this.f7899d) {
            this.f7898c.mo10880f();
            m10099b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10890a() {
        this.f7897b.mo11228b();
        if (this.f7899d) {
            this.f7899d = false;
            if (this.f7900e) {
                mo10880f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: a */
    static <Z> C2381t<Z> m10098a(AbstractC2383u<Z> uVar) {
        C2381t<Z> tVar = (C2381t) C2567j.m10894a(f7896a.acquire());
        tVar.m10100b(uVar);
        return tVar;
    }

    /* renamed from: b */
    private void m10100b(AbstractC2383u<Z> uVar) {
        this.f7900e = false;
        this.f7899d = true;
        this.f7898c = uVar;
    }
}

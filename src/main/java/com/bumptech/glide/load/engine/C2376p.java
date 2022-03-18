package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.util.C2567j;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.p */
public class C2376p<Z> implements AbstractC2383u<Z> {

    /* renamed from: a */
    private final boolean f7883a;

    /* renamed from: b */
    private final boolean f7884b;

    /* renamed from: c */
    private final AbstractC2383u<Z> f7885c;

    /* renamed from: d */
    private final AbstractC2377a f7886d;

    /* renamed from: e */
    private final AbstractC2265c f7887e;

    /* renamed from: f */
    private int f7888f;

    /* renamed from: g */
    private boolean f7889g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.p$a */
    public interface AbstractC2377a {
        /* renamed from: a */
        void mo10839a(AbstractC2265c cVar, C2376p<?> pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC2383u<Z> mo10875a() {
        return this.f7885c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10876b() {
        return this.f7883a;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<Z> mo10877c() {
        return this.f7885c.mo10877c();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: d */
    public Z mo10878d() {
        return this.f7885c.mo10878d();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return this.f7885c.mo10879e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo10881g() {
        if (!this.f7889g) {
            this.f7888f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public synchronized void mo10880f() {
        if (this.f7888f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f7889g) {
            this.f7889g = true;
            if (this.f7884b) {
                this.f7885c.mo10880f();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10882h() {
        boolean z;
        synchronized (this) {
            int i = this.f7888f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f7888f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f7886d.mo10839a(this.f7887e, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7883a + ", listener=" + this.f7886d + ", key=" + this.f7887e + ", acquired=" + this.f7888f + ", isRecycled=" + this.f7889g + ", resource=" + this.f7885c + '}';
    }

    C2376p(AbstractC2383u<Z> uVar, boolean z, boolean z2, AbstractC2265c cVar, AbstractC2377a aVar) {
        this.f7885c = (AbstractC2383u) C2567j.m10894a(uVar);
        this.f7883a = z;
        this.f7884b = z2;
        this.f7887e = cVar;
        this.f7886d = (AbstractC2377a) C2567j.m10894a(aVar);
    }
}

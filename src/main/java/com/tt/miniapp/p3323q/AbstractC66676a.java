package com.tt.miniapp.p3323q;

/* renamed from: com.tt.miniapp.q.a */
public abstract class AbstractC66676a {

    /* renamed from: a */
    protected long f168323a;

    /* renamed from: b */
    protected long f168324b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo232429b();

    public AbstractC66676a() {
        this.f168323a = 30000;
    }

    /* renamed from: a */
    public void mo232428a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f168324b >= this.f168323a) {
            this.f168324b = currentTimeMillis;
            mo232429b();
        }
    }

    public AbstractC66676a(long j) {
        this.f168323a = j;
    }
}

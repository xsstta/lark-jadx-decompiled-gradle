package com.ss.android.vc.common.p3080d;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.vc.common.d.f */
public class C60721f extends AbstractC60711a {

    /* renamed from: b */
    private Handler f151876b;

    /* renamed from: c */
    private long f151877c;

    /* renamed from: d */
    private boolean f151878d;

    /* renamed from: a */
    public long mo208309a() {
        return this.f151877c;
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractC60720e
    /* renamed from: c */
    public void mo208315c() {
        this.f151876b.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m235917e() {
        this.f151865a.mo208311a("IntervalTrigger", "timeout trigger");
        this.f151865a.mo208342k();
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractC60720e
    /* renamed from: b */
    public void mo208314b() {
        if (this.f151878d) {
            this.f151876b.removeCallbacksAndMessages(null);
            this.f151876b.postDelayed(new Runnable() {
                /* class com.ss.android.vc.common.p3080d.$$Lambda$f$VCJ3iTzWcQGB2U_BwgaA74fWmE */

                public final void run() {
                    C60721f.this.m235917e();
                }
            }, mo208309a());
        }
    }

    public C60721f(AbstractRunnableC60727j jVar) {
        this(jVar, 0);
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractC60711a, com.ss.android.vc.common.p3080d.AbstractC60718c
    /* renamed from: a */
    public void mo208305a(boolean z) {
        super.mo208305a(z);
        this.f151878d = z;
        this.f151876b.removeCallbacksAndMessages(null);
    }

    public C60721f(AbstractRunnableC60727j jVar, long j) {
        super(jVar);
        this.f151876b = new Handler(Looper.getMainLooper());
        this.f151878d = false;
        this.f151877c = j;
    }
}

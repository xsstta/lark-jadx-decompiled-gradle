package com.bytedance.apm.battery.p132c;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.battery.p131b.C2803a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p153n.C3047b;

/* renamed from: com.bytedance.apm.battery.c.b */
public abstract class AbstractC2816b implements AbstractC2823h {

    /* renamed from: a */
    boolean f9008a = ActivityLifeObserver.getInstance().isForeground();

    /* renamed from: b */
    private String f9009b;

    /* renamed from: c */
    private boolean f9010c = C2785b.m11761e();

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: b */
    public void mo12167b() {
        this.f9008a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12182b(boolean z);

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: c */
    public void mo12168c() {
        this.f9008a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12181a() {
        return this.f9010c;
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    public void h_() {
        mo12179a(this.f9008a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12179a(final boolean z) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.battery.p132c.AbstractC2816b.RunnableC28171 */

            public void run() {
                AbstractC2816b.this.mo12182b(z);
            }
        });
    }

    AbstractC2816b(String str) {
        this.f9009b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12180a(boolean z, long j) {
        C2803a.m11844a().mo12133a(new C2878a(z, System.currentTimeMillis(), this.f9009b, j));
    }
}

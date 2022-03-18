package com.bytedance.apm.battery.p132c;

import com.bytedance.apm.battery.p131b.C2807b;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.util.C3112b;

/* renamed from: com.bytedance.apm.battery.c.e */
public class C2820e extends AbstractC2816b {

    /* renamed from: b */
    private long f9023b;

    public C2820e() {
        super("cpu_active_time");
    }

    /* renamed from: e */
    private long m11922e() {
        return C3112b.m12938a(100);
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2816b, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: b */
    public void mo12167b() {
        mo12179a(this.f9008a);
        super.mo12167b();
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2816b, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: c */
    public void mo12168c() {
        mo12179a(this.f9008a);
        super.mo12168c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2816b
    /* renamed from: b */
    public void mo12182b(boolean z) {
        long f = C3112b.m12952f();
        long j = f - this.f9023b;
        if (j > 0) {
            mo12180a(z, j);
            this.f9023b = f;
        }
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: a */
    public void mo12186a(C2807b bVar, C2878a aVar) {
        if (aVar.mo12338a()) {
            bVar.mo12157g((long) ((((double) aVar.mo12342c()) / ((double) m11922e())) * 1000.0d));
        } else {
            bVar.mo12146b((long) ((((double) aVar.mo12342c()) / ((double) m11922e())) * 1000.0d));
        }
    }
}

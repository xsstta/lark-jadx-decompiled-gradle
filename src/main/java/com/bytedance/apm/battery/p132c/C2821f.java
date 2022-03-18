package com.bytedance.apm.battery.p132c;

import com.bytedance.apm.battery.p131b.C2807b;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p143i.p147c.C2977g;

/* renamed from: com.bytedance.apm.battery.c.f */
public class C2821f extends AbstractC2816b {

    /* renamed from: b */
    private volatile boolean f9024b;

    /* renamed from: c */
    private long f9025c = -1;

    /* renamed from: d */
    private long f9026d = -1;

    /* renamed from: e */
    private C2977g f9027e = C2977g.m12520a();

    public C2821f() {
        super("traffic");
    }

    /* renamed from: e */
    private void m11927e() {
        if (!this.f9024b) {
            this.f9024b = true;
        }
        long c = this.f9027e.mo12716c();
        long b = this.f9027e.mo12715b();
        if (this.f9026d > -1) {
            long j = this.f9025c;
            if (j > -1) {
                mo12180a(true, c - j);
                mo12180a(false, b - this.f9026d);
            }
        }
        this.f9025c = c;
        this.f9026d = b;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2816b
    /* renamed from: b */
    public void mo12182b(boolean z) {
        if (mo12181a()) {
            try {
                m11927e();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: a */
    public void mo12186a(C2807b bVar, C2878a aVar) {
        if (aVar.mo12338a()) {
            bVar.mo12159i(aVar.mo12342c());
        } else {
            bVar.mo12152d(aVar.mo12342c());
        }
    }
}

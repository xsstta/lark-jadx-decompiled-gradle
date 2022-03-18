package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.StateType;

/* renamed from: com.bytedance.apm6.cpu.exception.a.g */
class C3254g extends AbstractC3246a {

    /* renamed from: c */
    private int f10425c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: d */
    public long mo13423d() {
        return 2000;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: b */
    public StateType mo13426b() {
        return StateType.PROCESS_DOUBLE_DETECT;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: e */
    public boolean mo13424e() {
        this.f10425c = 0;
        this.f10404a.mo13444c();
        return true;
    }

    public C3254g(C3262d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a, com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: a */
    public void mo13420a(boolean z) {
        if (z) {
            this.f10425c = 0;
        }
        super.mo13420a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: b */
    public boolean mo13421b(boolean z) {
        if (z) {
            this.f10425c++;
            mo13419a("over time: " + this.f10425c + " max over time: " + 2);
            if (this.f10425c < 2) {
                return false;
            }
            this.f10425c = 0;
            this.f10404a.mo13446e();
            return true;
        }
        this.f10425c = 0;
        this.f10404a.mo13444c();
        return true;
    }
}

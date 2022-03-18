package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.exception.C3259c;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.StateType;

/* renamed from: com.bytedance.apm6.cpu.exception.a.f */
class C3253f extends AbstractC3246a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: d */
    public long mo13423d() {
        return 2000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: e */
    public boolean mo13424e() {
        return false;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: b */
    public StateType mo13426b() {
        return StateType.PROCESS_DETECT;
    }

    public C3253f(C3262d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a
    /* renamed from: b */
    public boolean mo13421b(boolean z) {
        if (z) {
            C3223a.AbstractC3225b d = C3259c.m13617a().mo13438d();
            if (d != null && d.mo13341a()) {
                return false;
            }
            this.f10404a.mo13445d();
        }
        return z;
    }
}

package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.exception.AbstractC3245a;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.StateType;
import com.bytedance.apm6.cpu.p169a.C3229c;

/* renamed from: com.bytedance.apm6.cpu.exception.a.e */
public class C3252e extends AbstractC3245a {
    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13417a() {
        super.mo13417a();
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: b */
    public StateType mo13426b() {
        return StateType.IDLE;
    }

    public C3252e(C3262d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13420a(boolean z) {
        super.mo13420a(z);
        mo13419a("life cycle change when state is idle, lifecycle change to back?: " + z);
        this.f10404a.mo13444c();
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13418a(C3229c cVar, boolean z) {
        super.mo13418a(cVar, z);
        this.f10404a.mo13444c();
    }
}

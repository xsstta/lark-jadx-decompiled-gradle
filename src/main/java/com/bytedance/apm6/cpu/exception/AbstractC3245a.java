package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.p195b.C3350b;

/* renamed from: com.bytedance.apm6.cpu.exception.a */
public abstract class AbstractC3245a implements AbstractC3265g {

    /* renamed from: a */
    protected C3262d f10404a;

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: a */
    public void mo13417a() {
        if (C3318a.m13915u()) {
            C3350b.m13934b("APM-CPU", "stop detect when state is : " + mo13426b());
        }
    }

    public AbstractC3245a(C3262d dVar) {
        this.f10404a = dVar;
    }

    /* renamed from: a */
    public void mo13419a(String str) {
        if (C3318a.m13915u()) {
            C3350b.m13934b("APM-CPU", "[" + mo13426b() + "]: " + str);
        }
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: a */
    public void mo13420a(boolean z) {
        if (C3318a.m13915u()) {
            C3350b.m13934b("APM-CPU", "onLifeCycleChange when state is : " + mo13426b());
        }
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: a */
    public void mo13418a(C3229c cVar, boolean z) {
        if (C3318a.m13915u()) {
            C3350b.m13934b("APM-CPU", "enter : " + mo13426b());
        }
    }
}

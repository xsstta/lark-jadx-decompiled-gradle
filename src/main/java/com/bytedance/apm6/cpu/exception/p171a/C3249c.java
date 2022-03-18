package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.exception.AbstractC3245a;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.StateType;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;

/* renamed from: com.bytedance.apm6.cpu.exception.a.c */
class C3249c extends AbstractC3245a {

    /* renamed from: b */
    public volatile boolean f10414b;

    /* renamed from: c */
    private AbstractRunnableC3362a f10415c;

    /* renamed from: c */
    private long m13581c() {
        return 2000;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: b */
    public StateType mo13426b() {
        return StateType.COOL_DOWN;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13417a() {
        super.mo13417a();
        C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(this.f10415c);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13420a(boolean z) {
        super.mo13420a(z);
        this.f10414b = z;
    }

    public C3249c(final C3262d dVar) {
        super(dVar);
        this.f10415c = new AbstractRunnableC3362a(m13581c(), 0) {
            /* class com.bytedance.apm6.cpu.exception.p171a.C3249c.C32501 */

            public void run() {
                C3249c cVar = C3249c.this;
                cVar.mo13419a("cool down task run, is back?: " + C3249c.this.f10414b);
                dVar.mo13443b();
            }
        };
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13418a(C3229c cVar, boolean z) {
        super.mo13418a(cVar, z);
        C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10415c);
    }
}

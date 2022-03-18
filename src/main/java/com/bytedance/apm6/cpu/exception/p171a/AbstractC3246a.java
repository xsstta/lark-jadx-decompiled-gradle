package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.exception.AbstractC3245a;
import com.bytedance.apm6.cpu.exception.C3258b;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.C3263e;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;

/* renamed from: com.bytedance.apm6.cpu.exception.a.a */
public abstract class AbstractC3246a extends AbstractC3245a {

    /* renamed from: b */
    protected boolean f10405b;

    /* renamed from: c */
    private C3229c f10406c;

    /* renamed from: d */
    private AbstractRunnableC3362a f10407d = new AbstractRunnableC3362a(mo13423d(), mo13423d()) {
        /* class com.bytedance.apm6.cpu.exception.p171a.AbstractC3246a.C32471 */

        public void run() {
            AbstractC3246a.this.mo13422c();
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13421b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo13423d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo13424e();

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13417a() {
        super.mo13417a();
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10407d);
    }

    /* renamed from: c */
    public void mo13422c() {
        boolean z;
        if (!C3258b.m13613a()) {
            double a = C3263e.m13635a();
            AbstractC13853c g = this.f10404a.mo13448g();
            if (g != null) {
                z = g.mo51097a((float) a);
                if (z) {
                    z = C3258b.m13614a(this.f10406c, a, this.f10405b);
                }
            } else {
                z = C3258b.m13614a(this.f10406c, a, this.f10405b);
            }
            mo13419a("run judge process cpu usage task, is over max threshold?: " + z + " speed: " + a + ", back max speed: " + this.f10406c.mo13364e() + ", fore max speed: " + this.f10406c.mo13367h());
            if (mo13421b(z)) {
                C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10407d);
            }
        } else if (mo13424e()) {
            C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10407d);
        }
    }

    public AbstractC3246a(C3262d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13420a(boolean z) {
        super.mo13420a(z);
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10407d);
        this.f10404a.mo13443b();
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13418a(C3229c cVar, boolean z) {
        super.mo13418a(cVar, z);
        this.f10406c = cVar;
        this.f10405b = z;
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(this.f10407d);
    }
}

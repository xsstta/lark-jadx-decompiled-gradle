package com.lynx.tasm.behavior.p1223c.p1224a;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.p1223c.AbstractC26656j;
import com.lynx.tasm.behavior.p1223c.C26649c;
import com.lynx.tasm.behavior.p1223c.C26650d;
import com.lynx.tasm.utils.C26959m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.c.a.c */
public class C26640c extends AbstractC26638a {

    /* renamed from: b */
    protected final List<AbstractC26656j> f65941b = new ArrayList();

    /* renamed from: c */
    private final List<AbstractC26656j> f65942c = new ArrayList();

    /* renamed from: d */
    private Handler f65943d;

    /* renamed from: e */
    private final ConditionVariable f65944e = new ConditionVariable();

    /* renamed from: f */
    private final ConditionVariable f65945f = new ConditionVariable();

    /* renamed from: g */
    private int f65946g = 0;

    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: c */
    public void mo94626c() {
        if (C26959m.m97972a()) {
            m96558g();
        } else {
            m96557f();
        }
    }

    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: d */
    public void mo94627d() {
        this.f65946g = 0;
        this.f65945f.close();
        this.f65944e.close();
    }

    /* renamed from: h */
    private void m96559h() {
        if (this.f65943d == null && !C26959m.m97972a()) {
            this.f65943d = new Handler();
        }
    }

    /* renamed from: f */
    private void m96557f() {
        m96559h();
        synchronized (this.f65942c) {
            this.f65942c.addAll(this.f65941b);
            this.f65941b.clear();
        }
        int i = this.f65946g;
        if (i == 1) {
            this.f65945f.open();
        } else if (i == 2) {
            this.f65944e.open();
        }
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.behavior.p1223c.p1224a.C26640c.RunnableC266432 */

            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C26640c.this.mo94629e();
                C26640c.this.mo94628a(new AbstractC26911n.C26912a(false, currentTimeMillis, System.currentTimeMillis()));
            }
        });
    }

    /* renamed from: e */
    public void mo94629e() {
        TraceEvent.m96443a("UIOperationQueueAsyncRender.flush");
        ArrayList<AbstractC26656j> arrayList = new ArrayList();
        synchronized (this.f65942c) {
            arrayList.addAll(this.f65942c);
            this.f65942c.clear();
        }
        for (AbstractC26656j jVar : arrayList) {
            jVar.mo94634b(this.f65939a);
            if (jVar instanceof C26649c) {
                this.f65946g = 3;
            }
        }
        TraceEvent.m96444b("UIOperationQueueAsyncRender.flush");
    }

    /* renamed from: g */
    private void m96558g() {
        if (!mo94625b() && this.f65946g != 3) {
            long currentTimeMillis = System.currentTimeMillis();
            TraceEvent.m96443a("UIOperationQueueAsyncRender.flush.waitTASM");
            if (!this.f65945f.block(100)) {
                LLog.m96429e("UIOperationQueueAsyncRender", "flush on ui thread failed, wait tasm finish timeout");
            }
            TraceEvent.m96444b("UIOperationQueueAsyncRender.flush.waitTASM");
            mo94629e();
            TraceEvent.m96443a("UIOperationQueueAsyncRender.flush.waitLayout");
            if (!this.f65944e.block(100)) {
                LLog.m96429e("UIOperationQueueAsyncRender", "flush on ui thread failed, wait layout finish timeout");
            }
            TraceEvent.m96444b("UIOperationQueueAsyncRender.flush.waitLayout");
            mo94629e();
            mo94628a(new AbstractC26911n.C26912a(true, currentTimeMillis, System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public void mo94628a(AbstractC26911n.C26912a aVar) {
        this.f65939a.mo94761j().mo94678d().mo95736a(aVar);
    }

    public C26640c(C26690o oVar) {
        super(oVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: a */
    public void mo94621a(final AbstractC26656j jVar) {
        m96559h();
        if (this.f65943d.getLooper() == Looper.myLooper()) {
            this.f65941b.add(jVar);
            if (jVar instanceof C26650d) {
                this.f65946g = 1;
            } else if (jVar instanceof C26649c) {
                this.f65946g = 2;
            }
        } else {
            this.f65943d.post(new Runnable() {
                /* class com.lynx.tasm.behavior.p1223c.p1224a.C26640c.RunnableC266411 */

                public void run() {
                    C26640c.this.f65941b.add(jVar);
                    C26959m.m97969a(new Runnable() {
                        /* class com.lynx.tasm.behavior.p1223c.p1224a.C26640c.RunnableC266411.RunnableC266421 */

                        public void run() {
                            if (!C26640c.this.mo94625b()) {
                                jVar.mo94634b(C26640c.this.f65939a);
                            }
                        }
                    });
                }
            });
        }
    }
}

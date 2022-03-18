package com.lynx.tasm.behavior.p1223c.p1224a;

import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.p1223c.AbstractC26656j;
import com.lynx.tasm.utils.C26959m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.c.a.e */
public class C26646e extends AbstractC26638a {

    /* renamed from: b */
    private final List<AbstractC26656j> f65953b = new ArrayList();

    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: c */
    public void mo94626c() {
        C26959m.m97973b();
        if (!mo94625b()) {
            TraceEvent.m96443a("UIOperationQueuePartOnLayout.flush");
            for (AbstractC26656j jVar : this.f65953b) {
                jVar.mo94634b(this.f65939a);
            }
            this.f65953b.clear();
            TraceEvent.m96444b("UIOperationQueuePartOnLayout.flush");
        }
    }

    public C26646e(C26690o oVar) {
        super(oVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a
    /* renamed from: a */
    public void mo94621a(final AbstractC26656j jVar) {
        if (!C26959m.m97972a()) {
            C26959m.m97969a(new Runnable() {
                /* class com.lynx.tasm.behavior.p1223c.p1224a.C26646e.RunnableC266471 */

                public void run() {
                    if (!C26646e.this.mo94625b()) {
                        jVar.mo94634b(C26646e.this.f65939a);
                    }
                }
            });
        } else {
            this.f65953b.add(jVar);
        }
    }
}

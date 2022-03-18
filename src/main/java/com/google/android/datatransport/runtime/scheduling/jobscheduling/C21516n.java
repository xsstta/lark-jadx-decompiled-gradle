package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public class C21516n {

    /* renamed from: a */
    private final Executor f52200a;

    /* renamed from: b */
    private final AbstractC21461c f52201b;

    /* renamed from: c */
    private final AbstractC21520r f52202c;

    /* renamed from: d */
    private final AbstractC21521a f52203d;

    /* renamed from: a */
    public void mo72779a() {
        this.f52200a.execute(RunnableC21517o.m77819a(this));
    }

    /* renamed from: b */
    static /* synthetic */ Object m77817b(C21516n nVar) {
        for (AbstractC21439l lVar : nVar.f52201b.mo72728a()) {
            nVar.f52202c.mo72763a(lVar, 1);
        }
        return null;
    }

    @Inject
    C21516n(Executor executor, AbstractC21461c cVar, AbstractC21520r rVar, AbstractC21521a aVar) {
        this.f52200a = executor;
        this.f52201b = cVar;
        this.f52202c = rVar;
        this.f52203d = aVar;
    }
}

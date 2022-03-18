package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.AbstractC21395g;
import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.C21445q;
import com.google.android.datatransport.runtime.backends.AbstractC21412e;
import com.google.android.datatransport.runtime.backends.AbstractC21422m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a */
public class C21449a implements AbstractC21493e {

    /* renamed from: a */
    private static final Logger f52067a = Logger.getLogger(C21445q.class.getName());

    /* renamed from: b */
    private final AbstractC21520r f52068b;

    /* renamed from: c */
    private final Executor f52069c;

    /* renamed from: d */
    private final AbstractC21412e f52070d;

    /* renamed from: e */
    private final AbstractC21461c f52071e;

    /* renamed from: f */
    private final AbstractC21521a f52072f;

    /* renamed from: a */
    static /* synthetic */ Object m77599a(C21449a aVar, AbstractC21439l lVar, AbstractC21433h hVar) {
        aVar.f52071e.mo72727a(lVar, hVar);
        aVar.f52068b.mo72763a(lVar, 1);
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.AbstractC21493e
    /* renamed from: a */
    public void mo72699a(AbstractC21439l lVar, AbstractC21433h hVar, AbstractC21395g gVar) {
        this.f52069c.execute(RunnableC21490b.m77742a(this, lVar, gVar, hVar));
    }

    /* renamed from: a */
    static /* synthetic */ void m77600a(C21449a aVar, AbstractC21439l lVar, AbstractC21395g gVar, AbstractC21433h hVar) {
        try {
            AbstractC21422m a = aVar.f52070d.mo72656a(lVar.mo72661a());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", lVar.mo72661a());
                f52067a.warning(format);
                gVar.mo72603a(new IllegalArgumentException(format));
                return;
            }
            aVar.f52072f.mo72737a(C21491c.m77743a(aVar, lVar, a.mo72597a(hVar)));
            gVar.mo72603a(null);
        } catch (Exception e) {
            Logger logger = f52067a;
            logger.warning("Error scheduling event " + e.getMessage());
            gVar.mo72603a(e);
        }
    }

    @Inject
    public C21449a(Executor executor, AbstractC21412e eVar, AbstractC21520r rVar, AbstractC21461c cVar, AbstractC21521a aVar) {
        this.f52069c = executor;
        this.f52070d = eVar;
        this.f52068b = rVar;
        this.f52071e = cVar;
        this.f52072f = aVar;
    }
}

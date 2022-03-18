package com.bytedance.ee.bridge.p597a;

import com.bytedance.ee.bear.thread.C11674a;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.ee.bridge.a.l */
public class C12598l implements AbstractC12584d {

    /* renamed from: a */
    private Executor f33738a;

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12584d
    /* renamed from: a */
    public void mo47839a() {
        C13479a.m54764b("RnReceiveDispatch", "destroy");
        Executor executor = this.f33738a;
        if (executor instanceof ExecutorService) {
            ((ExecutorService) executor).shutdown();
        }
    }

    /* renamed from: b */
    private synchronized Executor m52301b() {
        if (this.f33738a == null) {
            this.f33738a = new C11674a().mo44759c("RnReceiveDispatch");
        }
        Executor executor = this.f33738a;
        if ((executor instanceof ExecutorService) && ((ExecutorService) executor).isShutdown()) {
            this.f33738a = new C11674a().mo44759c("RnReceiveDispatch");
        }
        return this.f33738a;
    }

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12584d
    /* renamed from: a */
    public void mo47840a(Runnable runnable) {
        try {
            m52301b().execute(runnable);
        } catch (Throwable th) {
            C13479a.m54762a("RnReceiveDispatch", th, true);
        }
    }
}

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.d */
public class C1927d implements AbstractC1939k {

    /* renamed from: a */
    private final Executor f6584a;

    /* access modifiers changed from: private */
    /* renamed from: com.android.volley.d$a */
    public static class RunnableC1929a implements Runnable {

        /* renamed from: a */
        private final Request f6587a;

        /* renamed from: b */
        private final C1936j f6588b;

        /* renamed from: c */
        private final Runnable f6589c;

        public void run() {
            if (this.f6587a.isCanceled()) {
                this.f6587a.finish("canceled-at-delivery");
                return;
            }
            if (this.f6588b.mo9814a()) {
                this.f6587a.deliverResponse(this.f6588b.f6613a);
            } else {
                this.f6587a.deliverError(this.f6588b.f6615c);
            }
            if (this.f6588b.f6616d) {
                this.f6587a.addMarker("intermediate-response");
            } else {
                this.f6587a.finish("done");
            }
            Runnable runnable = this.f6589c;
            if (runnable != null) {
                runnable.run();
            }
        }

        public RunnableC1929a(Request request, C1936j jVar, Runnable runnable) {
            this.f6587a = request;
            this.f6588b = jVar;
            this.f6589c = runnable;
        }
    }

    public C1927d(final Handler handler) {
        this.f6584a = new Executor() {
            /* class com.android.volley.C1927d.ExecutorC19281 */

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.android.volley.AbstractC1939k
    /* renamed from: a */
    public void mo9795a(Request<?> request, C1936j<?> jVar) {
        mo9796a(request, jVar, null);
    }

    @Override // com.android.volley.AbstractC1939k
    /* renamed from: a */
    public void mo9794a(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f6584a.execute(new RunnableC1929a(request, C1936j.m8593a(volleyError), null));
    }

    @Override // com.android.volley.AbstractC1939k
    /* renamed from: a */
    public void mo9796a(Request<?> request, C1936j<?> jVar, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f6584a.execute(new RunnableC1929a(request, jVar, runnable));
    }
}

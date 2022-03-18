package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.e */
public final class C22733e<ResultT> implements AbstractC22739k<ResultT> {

    /* renamed from: a */
    private final Executor f56250a;

    /* renamed from: b */
    private final Object f56251b = new Object();

    /* renamed from: c */
    private final AbstractC22729a<ResultT> f56252c;

    public C22733e(Executor executor, AbstractC22729a<ResultT> aVar) {
        this.f56250a = executor;
        this.f56252c = aVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC22739k
    /* renamed from: a */
    public final void mo79083a(Task<ResultT> task) {
        synchronized (this.f56251b) {
            if (this.f56252c != null) {
                this.f56250a.execute(new RunnableC22732d(this, task));
            }
        }
    }
}

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.n */
final class C22103n<TResult> implements AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53751a;

    /* renamed from: b */
    private final Object f53752b = new Object();

    /* renamed from: c */
    private AbstractC22091c f53753c;

    public C22103n(Executor executor, AbstractC22091c cVar) {
        this.f53751a = executor;
        this.f53753c = cVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task task) {
        if (task.isCanceled()) {
            synchronized (this.f53752b) {
                if (this.f53753c != null) {
                    this.f53751a.execute(new RunnableC22104o(this));
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        synchronized (this.f53752b) {
            this.f53753c = null;
        }
    }
}

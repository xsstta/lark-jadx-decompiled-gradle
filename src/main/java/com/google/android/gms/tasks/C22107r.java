package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.r */
final class C22107r<TResult> implements AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53760a;

    /* renamed from: b */
    private final Object f53761b = new Object();

    /* renamed from: c */
    private AbstractC22092d f53762c;

    public C22107r(Executor executor, AbstractC22092d dVar) {
        this.f53760a = executor;
        this.f53762c = dVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            synchronized (this.f53761b) {
                if (this.f53762c != null) {
                    this.f53760a.execute(new RunnableC22108s(this, task));
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        synchronized (this.f53761b) {
            this.f53762c = null;
        }
    }
}

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.t */
final class C22109t<TResult> implements AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53765a;

    /* renamed from: b */
    private final Object f53766b = new Object();

    /* renamed from: c */
    private AbstractC22093e<? super TResult> f53767c;

    public C22109t(Executor executor, AbstractC22093e<? super TResult> eVar) {
        this.f53765a = executor;
        this.f53767c = eVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.f53766b) {
                if (this.f53767c != null) {
                    this.f53765a.execute(new RunnableC22110u(this, task));
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        synchronized (this.f53766b) {
            this.f53767c = null;
        }
    }
}

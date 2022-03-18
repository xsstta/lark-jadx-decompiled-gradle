package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.p */
final class C22105p<TResult> implements AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53755a;

    /* renamed from: b */
    private final Object f53756b = new Object();

    /* renamed from: c */
    private OnCompleteListener<TResult> f53757c;

    public C22105p(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f53755a = executor;
        this.f53757c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        synchronized (this.f53756b) {
            if (this.f53757c != null) {
                this.f53755a.execute(new RunnableC22106q(this, task));
            }
        }
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        synchronized (this.f53756b) {
            this.f53757c = null;
        }
    }
}

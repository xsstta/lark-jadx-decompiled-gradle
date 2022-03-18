package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.j */
final class C22099j<TResult, TContinuationResult> implements AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53741a;

    /* renamed from: b */
    private final Continuation<TResult, TContinuationResult> f53742b;

    /* renamed from: c */
    private final C22085ab<TContinuationResult> f53743c;

    public C22099j(Executor executor, Continuation<TResult, TContinuationResult> continuation, C22085ab<TContinuationResult> abVar) {
        this.f53741a = executor;
        this.f53742b = continuation;
        this.f53743c = abVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        this.f53741a.execute(new RunnableC22100k(this, task));
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        throw new UnsupportedOperationException();
    }
}

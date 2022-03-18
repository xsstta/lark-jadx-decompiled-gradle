package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.l */
final class C22101l<TResult, TContinuationResult> implements AbstractC22091c, AbstractC22092d, AbstractC22093e<TContinuationResult>, AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53746a;

    /* renamed from: b */
    private final Continuation<TResult, Task<TContinuationResult>> f53747b;

    /* renamed from: c */
    private final C22085ab<TContinuationResult> f53748c;

    public C22101l(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, C22085ab<TContinuationResult> abVar) {
        this.f53746a = executor;
        this.f53747b = continuation;
        this.f53748c = abVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        this.f53746a.execute(new RunnableC22102m(this, task));
    }

    @Override // com.google.android.gms.tasks.AbstractC22093e
    /* renamed from: a */
    public final void mo75026a(TContinuationResult tcontinuationresult) {
        this.f53748c.mo75033a(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.AbstractC22092d
    /* renamed from: a */
    public final void mo75025a(Exception exc) {
        this.f53748c.mo75032a(exc);
    }

    @Override // com.google.android.gms.tasks.AbstractC22091c
    public final void V_() {
        this.f53748c.mo75034a();
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        throw new UnsupportedOperationException();
    }
}

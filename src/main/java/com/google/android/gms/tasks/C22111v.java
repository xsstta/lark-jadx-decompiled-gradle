package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.v */
final class C22111v<TResult, TContinuationResult> implements AbstractC22091c, AbstractC22092d, AbstractC22093e<TContinuationResult>, AbstractC22113x<TResult> {

    /* renamed from: a */
    private final Executor f53770a;

    /* renamed from: b */
    private final SuccessContinuation<TResult, TContinuationResult> f53771b;

    /* renamed from: c */
    private final C22085ab<TContinuationResult> f53772c;

    public C22111v(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation, C22085ab<TContinuationResult> abVar) {
        this.f53770a = executor;
        this.f53771b = successContinuation;
        this.f53772c = abVar;
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75045a(Task<TResult> task) {
        this.f53770a.execute(new RunnableC22112w(this, task));
    }

    @Override // com.google.android.gms.tasks.AbstractC22113x
    /* renamed from: a */
    public final void mo75044a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.AbstractC22093e
    /* renamed from: a */
    public final void mo75026a(TContinuationResult tcontinuationresult) {
        this.f53772c.mo75033a(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.AbstractC22092d
    /* renamed from: a */
    public final void mo75025a(Exception exc) {
        this.f53772c.mo75032a(exc);
    }

    @Override // com.google.android.gms.tasks.AbstractC22091c
    public final void V_() {
        this.f53772c.mo75034a();
    }
}

package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.AbstractC21667e;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.ab */
public final class C22085ab<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f53724a = new Object();

    /* renamed from: b */
    private final C22114y<TResult> f53725b = new C22114y<>();

    /* renamed from: c */
    private boolean f53726c;

    /* renamed from: d */
    private volatile boolean f53727d;

    /* renamed from: e */
    private TResult f53728e;

    /* renamed from: f */
    private Exception f53729f;

    C22085ab() {
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f53724a) {
            z = this.f53726c;
        }
        return z;
    }

    /* renamed from: com.google.android.gms.tasks.ab$a */
    private static class C22086a extends LifecycleCallback {

        /* renamed from: b */
        private final List<WeakReference<AbstractC22113x<?>>> f53730b = new ArrayList();

        /* renamed from: b */
        public static C22086a m79659b(Activity activity) {
            AbstractC21667e a = m78340a(activity);
            C22086a aVar = (C22086a) a.mo73471a("TaskOnStopCallback", C22086a.class);
            return aVar == null ? new C22086a(a) : aVar;
        }

        private C22086a(AbstractC21667e eVar) {
            super(eVar);
            this.f52619a.mo73472a("TaskOnStopCallback", this);
        }

        /* renamed from: a */
        public final <T> void mo75037a(AbstractC22113x<T> xVar) {
            synchronized (this.f53730b) {
                this.f53730b.add(new WeakReference<>(xVar));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        /* renamed from: d */
        public void mo73332d() {
            synchronized (this.f53730b) {
                for (WeakReference<AbstractC22113x<?>> weakReference : this.f53730b) {
                    AbstractC22113x<?> xVar = weakReference.get();
                    if (xVar != null) {
                        xVar.mo75044a();
                    }
                }
                this.f53730b.clear();
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f53727d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f53724a) {
            z = this.f53726c && !this.f53727d && this.f53729f == null;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f53724a) {
            m79650b();
            m79652d();
            if (this.f53729f == null) {
                tresult = this.f53728e;
            } else {
                throw new RuntimeExecutionException(this.f53729f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f53724a) {
            m79650b();
            m79652d();
            if (cls.isInstance(this.f53729f)) {
                throw cls.cast(this.f53729f);
            } else if (this.f53729f == null) {
                tresult = this.f53728e;
            } else {
                throw new RuntimeExecutionException(this.f53729f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f53724a) {
            exc = this.f53729f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(AbstractC22093e<? super TResult> eVar) {
        return addOnSuccessListener(C22095g.f53736a, eVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(Executor executor, AbstractC22093e<? super TResult> eVar) {
        this.f53725b.mo75054a(new C22109t(executor, eVar));
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(Activity activity, AbstractC22093e<? super TResult> eVar) {
        C22109t tVar = new C22109t(C22095g.f53736a, eVar);
        this.f53725b.mo75054a(tVar);
        C22086a.m79659b(activity).mo75037a(tVar);
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(AbstractC22092d dVar) {
        return addOnFailureListener(C22095g.f53736a, dVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(Executor executor, AbstractC22092d dVar) {
        this.f53725b.mo75054a(new C22107r(executor, dVar));
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(Activity activity, AbstractC22092d dVar) {
        C22107r rVar = new C22107r(C22095g.f53736a, dVar);
        this.f53725b.mo75054a(rVar);
        C22086a.m79659b(activity).mo75037a(rVar);
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(C22095g.f53736a, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f53725b.mo75054a(new C22105p(executor, onCompleteListener));
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        C22105p pVar = new C22105p(C22095g.f53736a, onCompleteListener);
        this.f53725b.mo75054a(pVar);
        C22086a.m79659b(activity).mo75037a(pVar);
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(C22095g.f53736a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        C22085ab abVar = new C22085ab();
        this.f53725b.mo75054a(new C22099j(executor, continuation, abVar));
        m79653e();
        return abVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(C22095g.f53736a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(AbstractC22091c cVar) {
        return addOnCanceledListener(C22095g.f53736a, cVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(Executor executor, AbstractC22091c cVar) {
        this.f53725b.mo75054a(new C22103n(executor, cVar));
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(Activity activity, AbstractC22091c cVar) {
        C22103n nVar = new C22103n(C22095g.f53736a, cVar);
        this.f53725b.mo75054a(nVar);
        C22086a.m79659b(activity).mo75037a(nVar);
        m79653e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        C22085ab abVar = new C22085ab();
        this.f53725b.mo75054a(new C22101l(executor, continuation, abVar));
        m79653e();
        return abVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        C22085ab abVar = new C22085ab();
        this.f53725b.mo75054a(new C22111v(executor, successContinuation, abVar));
        m79653e();
        return abVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return onSuccessTask(C22095g.f53736a, successContinuation);
    }

    /* renamed from: a */
    public final void mo75033a(TResult tresult) {
        synchronized (this.f53724a) {
            m79651c();
            this.f53726c = true;
            this.f53728e = tresult;
        }
        this.f53725b.mo75053a(this);
    }

    /* renamed from: b */
    public final boolean mo75036b(TResult tresult) {
        synchronized (this.f53724a) {
            if (this.f53726c) {
                return false;
            }
            this.f53726c = true;
            this.f53728e = tresult;
            this.f53725b.mo75053a(this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo75032a(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f53724a) {
            m79651c();
            this.f53726c = true;
            this.f53729f = exc;
        }
        this.f53725b.mo75053a(this);
    }

    /* renamed from: b */
    public final boolean mo75035b(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f53724a) {
            if (this.f53726c) {
                return false;
            }
            this.f53726c = true;
            this.f53729f = exc;
            this.f53725b.mo75053a(this);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo75034a() {
        synchronized (this.f53724a) {
            if (this.f53726c) {
                return false;
            }
            this.f53726c = true;
            this.f53727d = true;
            this.f53725b.mo75053a(this);
            return true;
        }
    }

    /* renamed from: b */
    private final void m79650b() {
        Preconditions.checkState(this.f53726c, "Task is not yet complete");
    }

    /* renamed from: c */
    private final void m79651c() {
        Preconditions.checkState(!this.f53726c, "Task is already complete");
    }

    /* renamed from: d */
    private final void m79652d() {
        if (this.f53727d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: e */
    private final void m79653e() {
        synchronized (this.f53724a) {
            if (this.f53726c) {
                this.f53725b.mo75053a(this);
            }
        }
    }
}

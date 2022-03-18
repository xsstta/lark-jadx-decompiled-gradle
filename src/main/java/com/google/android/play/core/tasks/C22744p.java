package com.google.android.play.core.tasks;

import com.google.android.play.core.splitcompat.C22679r;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.p */
public final class C22744p<ResultT> extends Task<ResultT> {

    /* renamed from: a */
    private final Object f56268a = new Object();

    /* renamed from: b */
    private final C22740l<ResultT> f56269b = new C22740l<>();

    /* renamed from: c */
    private boolean f56270c;

    /* renamed from: d */
    private ResultT f56271d;

    /* renamed from: e */
    private Exception f56272e;

    C22744p() {
    }

    /* renamed from: a */
    private final void m82699a() {
        C22679r.m82540a(this.f56270c, "Task is not yet complete");
    }

    /* renamed from: b */
    private final void m82700b() {
        C22679r.m82540a(!this.f56270c, "Task is already complete");
    }

    /* renamed from: c */
    private final void m82701c() {
        synchronized (this.f56268a) {
            if (this.f56270c) {
                this.f56269b.mo79086a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo79095a(Exception exc) {
        C22679r.m82539a(exc, "Exception must not be null");
        synchronized (this.f56268a) {
            m82700b();
            this.f56270c = true;
            this.f56272e = exc;
        }
        this.f56269b.mo79086a(this);
    }

    /* renamed from: a */
    public final void mo79096a(ResultT resultt) {
        synchronized (this.f56268a) {
            m82700b();
            this.f56270c = true;
            this.f56271d = resultt;
        }
        this.f56269b.mo79086a(this);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnCompleteListener(AbstractC22729a<ResultT> aVar) {
        this.f56269b.mo79087a(new C22733e(C22730b.f56246a, aVar));
        m82701c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnCompleteListener(Executor executor, AbstractC22729a<ResultT> aVar) {
        this.f56269b.mo79087a(new C22733e(executor, aVar));
        m82701c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(C22730b.f56246a, onFailureListener);
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.f56269b.mo79087a(new C22735g(executor, onFailureListener));
        m82701c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        addOnSuccessListener(C22730b.f56246a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f56269b.mo79087a(new C22737i(executor, onSuccessListener));
        m82701c();
        return this;
    }

    /* renamed from: b */
    public final boolean mo79097b(Exception exc) {
        C22679r.m82539a(exc, "Exception must not be null");
        synchronized (this.f56268a) {
            if (this.f56270c) {
                return false;
            }
            this.f56270c = true;
            this.f56272e = exc;
            this.f56269b.mo79086a(this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo79098b(ResultT resultt) {
        synchronized (this.f56268a) {
            if (this.f56270c) {
                return false;
            }
            this.f56270c = true;
            this.f56271d = resultt;
            this.f56269b.mo79086a(this);
            return true;
        }
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f56268a) {
            exc = this.f56272e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final ResultT getResult() {
        ResultT resultt;
        synchronized (this.f56268a) {
            m82699a();
            Exception exc = this.f56272e;
            if (exc == null) {
                resultt = this.f56271d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable {
        ResultT resultt;
        synchronized (this.f56268a) {
            m82699a();
            if (!cls.isInstance(this.f56272e)) {
                Exception exc = this.f56272e;
                if (exc == null) {
                    resultt = this.f56271d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f56272e);
            }
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f56268a) {
            z = this.f56270c;
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f56268a) {
            z = false;
            if (this.f56270c && this.f56272e == null) {
                z = true;
            }
        }
        return z;
    }
}

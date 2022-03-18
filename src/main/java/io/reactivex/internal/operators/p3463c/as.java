package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.as */
public final class as extends Single<Long> {

    /* renamed from: a */
    final long f171819a;

    /* renamed from: b */
    final TimeUnit f171820b;

    /* renamed from: c */
    final Scheduler f171821c;

    /* renamed from: io.reactivex.internal.operators.c.as$a */
    static final class RunnableC68458a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final AbstractC69012t<? super Long> downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void run() {
            this.downstream.onSuccess(0L);
        }

        /* access modifiers changed from: package-private */
        public void setFuture(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        RunnableC68458a(AbstractC69012t<? super Long> tVar) {
            this.downstream = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Long> tVar) {
        RunnableC68458a aVar = new RunnableC68458a(tVar);
        tVar.onSubscribe(aVar);
        aVar.setFuture(this.f171821c.scheduleDirect(aVar, this.f171819a, this.f171820b));
    }

    public as(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f171819a = j;
        this.f171820b = timeUnit;
        this.f171821c = scheduler;
    }
}

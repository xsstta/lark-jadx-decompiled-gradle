package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class dw extends Observable<Long> {

    /* renamed from: a */
    final Scheduler f172593a;

    /* renamed from: b */
    final long f172594b;

    /* renamed from: c */
    final TimeUnit f172595c;

    /* renamed from: io.reactivex.internal.operators.observable.dw$a */
    static final class RunnableC68834a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final AbstractC69009q<? super Long> downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void run() {
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }

        RunnableC68834a(AbstractC69009q<? super Long> qVar) {
            this.downstream = qVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Long> qVar) {
        RunnableC68834a aVar = new RunnableC68834a(qVar);
        qVar.onSubscribe(aVar);
        aVar.setResource(this.f172593a.scheduleDirect(aVar, this.f172594b, this.f172595c));
    }

    public dw(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f172594b = j;
        this.f172595c = timeUnit;
        this.f172593a = scheduler;
    }
}

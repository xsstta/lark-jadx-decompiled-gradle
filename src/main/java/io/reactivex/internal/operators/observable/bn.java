package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.C68962m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bn extends Observable<Long> {

    /* renamed from: a */
    final Scheduler f172325a;

    /* renamed from: b */
    final long f172326b;

    /* renamed from: c */
    final long f172327c;

    /* renamed from: d */
    final TimeUnit f172328d;

    /* renamed from: io.reactivex.internal.operators.observable.bn$a */
    static final class RunnableC68727a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
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
            if (get() != DisposableHelper.DISPOSED) {
                AbstractC69009q<? super Long> qVar = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                qVar.onNext(Long.valueOf(j));
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        RunnableC68727a(AbstractC69009q<? super Long> qVar) {
            this.downstream = qVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Long> qVar) {
        RunnableC68727a aVar = new RunnableC68727a(qVar);
        qVar.onSubscribe(aVar);
        Scheduler scheduler = this.f172325a;
        if (scheduler instanceof C68962m) {
            Scheduler.AbstractC68257c createWorker = scheduler.createWorker();
            aVar.setResource(createWorker);
            createWorker.mo237796a(aVar, this.f172326b, this.f172327c, this.f172328d);
            return;
        }
        aVar.setResource(scheduler.schedulePeriodicallyDirect(aVar, this.f172326b, this.f172327c, this.f172328d));
    }

    public bn(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f172326b = j;
        this.f172327c = j2;
        this.f172328d = timeUnit;
        this.f172325a = scheduler;
    }
}

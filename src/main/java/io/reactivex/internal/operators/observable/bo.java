package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.C68962m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bo extends Observable<Long> {

    /* renamed from: a */
    final Scheduler f172329a;

    /* renamed from: b */
    final long f172330b;

    /* renamed from: c */
    final long f172331c;

    /* renamed from: d */
    final long f172332d;

    /* renamed from: e */
    final long f172333e;

    /* renamed from: f */
    final TimeUnit f172334f;

    /* renamed from: io.reactivex.internal.operators.observable.bo$a */
    static final class RunnableC68728a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final AbstractC69009q<? super Long> downstream;
        final long end;

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
                long j = this.count;
                this.downstream.onNext(Long.valueOf(j));
                if (j == this.end) {
                    DisposableHelper.dispose(this);
                    this.downstream.onComplete();
                    return;
                }
                this.count = j + 1;
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        RunnableC68728a(AbstractC69009q<? super Long> qVar, long j, long j2) {
            this.downstream = qVar;
            this.count = j;
            this.end = j2;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Long> qVar) {
        RunnableC68728a aVar = new RunnableC68728a(qVar, this.f172330b, this.f172331c);
        qVar.onSubscribe(aVar);
        Scheduler scheduler = this.f172329a;
        if (scheduler instanceof C68962m) {
            Scheduler.AbstractC68257c createWorker = scheduler.createWorker();
            aVar.setResource(createWorker);
            createWorker.mo237796a(aVar, this.f172332d, this.f172333e, this.f172334f);
            return;
        }
        aVar.setResource(scheduler.schedulePeriodicallyDirect(aVar, this.f172332d, this.f172333e, this.f172334f));
    }

    public bo(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.f172332d = j3;
        this.f172333e = j4;
        this.f172334f = timeUnit;
        this.f172329a = scheduler;
        this.f172330b = j;
        this.f172331c = j2;
    }
}

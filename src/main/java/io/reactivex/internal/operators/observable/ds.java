package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ds<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172571b;

    /* renamed from: c */
    final TimeUnit f172572c;

    /* renamed from: d */
    final Scheduler f172573d;

    /* renamed from: e */
    final boolean f172574e;

    /* renamed from: io.reactivex.internal.operators.observable.ds$a */
    static final class RunnableC68823a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final AbstractC69009q<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        Disposable upstream;
        final Scheduler.AbstractC68257c worker;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void run() {
            this.timerFired = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                AbstractC69009q<? super T> qVar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    boolean z2 = this.done;
                    if (!z2 || this.error == null) {
                        if (atomicReference.get() == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2) {
                            T andSet = atomicReference.getAndSet(null);
                            if (!z && this.emitLast) {
                                qVar.onNext(andSet);
                            }
                            qVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        if (z) {
                            if (this.timerFired) {
                                this.timerRunning = false;
                                this.timerFired = false;
                            }
                        } else if (!this.timerRunning || this.timerFired) {
                            qVar.onNext(atomicReference.getAndSet(null));
                            this.timerFired = false;
                            this.timerRunning = true;
                            this.worker.mo44779a(this, this.timeout, this.unit);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet(null);
                        qVar.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.latest.set(t);
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        RunnableC68823a(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar, boolean z) {
            this.downstream = qVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.emitLast = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new RunnableC68823a(qVar, this.f172571b, this.f172572c, this.f172573d.createWorker(), this.f172574e));
    }

    public ds(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observable);
        this.f172571b = j;
        this.f172572c = timeUnit;
        this.f172573d = scheduler;
        this.f172574e = z;
    }
}

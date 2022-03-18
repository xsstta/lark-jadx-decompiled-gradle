package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C68926b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class de<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172510b;

    /* renamed from: c */
    final TimeUnit f172511c;

    /* renamed from: d */
    final Scheduler f172512d;

    /* renamed from: e */
    final int f172513e;

    /* renamed from: f */
    final boolean f172514f;

    /* renamed from: io.reactivex.internal.operators.observable.de$a */
    static final class C68803a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final AbstractC69009q<? super T> downstream;
        Throwable error;
        final C68926b<Object> queue;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super T> qVar = this.downstream;
                C68926b<Object> bVar = this.queue;
                boolean z2 = this.delayError;
                TimeUnit timeUnit = this.unit;
                Scheduler scheduler2 = this.scheduler;
                long j = this.time;
                int i = 1;
                while (!this.cancelled) {
                    boolean z3 = this.done;
                    Long l = (Long) bVar.mo238626a();
                    if (l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long now = scheduler2.now(timeUnit);
                    if (!z && l.longValue() > now - j) {
                        z = true;
                    }
                    if (z3) {
                        if (!z2) {
                            Throwable th = this.error;
                            if (th != null) {
                                this.queue.clear();
                                qVar.onError(th);
                                return;
                            } else if (z) {
                                qVar.onComplete();
                                return;
                            }
                        } else if (z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                qVar.onError(th2);
                                return;
                            } else {
                                qVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        bVar.poll();
                        qVar.onNext(bVar.poll());
                    }
                }
                this.queue.clear();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.queue.mo238627a(Long.valueOf(this.scheduler.now(this.unit)), t);
            drain();
        }

        C68803a(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler scheduler2, int i, boolean z) {
            this.downstream = qVar;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.queue = new C68926b<>(i);
            this.delayError = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68803a(qVar, this.f172510b, this.f172511c, this.f172512d, this.f172513e, this.f172514f));
    }

    public de(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(observableSource);
        this.f172510b = j;
        this.f172511c = timeUnit;
        this.f172512d = scheduler;
        this.f172513e = i;
        this.f172514f = z;
    }
}

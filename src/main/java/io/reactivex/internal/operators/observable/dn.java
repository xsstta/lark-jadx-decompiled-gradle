package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C68926b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dn<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172551b;

    /* renamed from: c */
    final long f172552c;

    /* renamed from: d */
    final TimeUnit f172553d;

    /* renamed from: e */
    final Scheduler f172554e;

    /* renamed from: f */
    final int f172555f;

    /* renamed from: g */
    final boolean f172556g;

    /* renamed from: io.reactivex.internal.operators.observable.dn$a */
    static final class C68816a<T> extends AtomicBoolean implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
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
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            Throwable th;
            if (compareAndSet(false, true)) {
                AbstractC69009q<? super T> qVar = this.downstream;
                C68926b<Object> bVar = this.queue;
                boolean z2 = this.delayError;
                while (!this.cancelled) {
                    if (z2 || (th = this.error) == null) {
                        Object poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                qVar.onError(th2);
                                return;
                            } else {
                                qVar.onComplete();
                                return;
                            }
                        } else {
                            Object poll2 = bVar.poll();
                            if (((Long) poll).longValue() >= this.scheduler.now(this.unit) - this.time) {
                                qVar.onNext(poll2);
                            }
                        }
                    } else {
                        bVar.clear();
                        qVar.onError(th);
                        return;
                    }
                }
                bVar.clear();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.error = th;
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
            boolean z;
            C68926b<Object> bVar = this.queue;
            long now = this.scheduler.now(this.unit);
            long j = this.time;
            long j2 = this.count;
            if (j2 == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo238627a(Long.valueOf(now), t);
            while (!bVar.isEmpty()) {
                if (((Long) bVar.mo238626a()).longValue() <= now - j || (!z && ((long) (bVar.mo238628b() >> 1)) > j2)) {
                    bVar.poll();
                    bVar.poll();
                } else {
                    return;
                }
            }
        }

        C68816a(AbstractC69009q<? super T> qVar, long j, long j2, TimeUnit timeUnit, Scheduler scheduler2, int i, boolean z) {
            this.downstream = qVar;
            this.count = j;
            this.time = j2;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.queue = new C68926b<>(i);
            this.delayError = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68816a(qVar, this.f172551b, this.f172552c, this.f172553d, this.f172554e, this.f172555f, this.f172556g));
    }

    public dn(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(observableSource);
        this.f172551b = j;
        this.f172552c = j2;
        this.f172553d = timeUnit;
        this.f172554e = scheduler;
        this.f172555f = i;
        this.f172556g = z;
    }
}

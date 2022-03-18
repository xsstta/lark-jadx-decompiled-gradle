package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ct<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172450b;

    /* renamed from: c */
    final TimeUnit f172451c;

    /* renamed from: d */
    final Scheduler f172452d;

    /* renamed from: e */
    final boolean f172453e;

    /* renamed from: io.reactivex.internal.operators.observable.ct$b */
    static final class C68783b<T> extends AbstractRunnableC68784c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public void run() {
            emit();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.ct.AbstractRunnableC68784c
        public void complete() {
            this.downstream.onComplete();
        }

        C68783b(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(qVar, j, timeUnit, scheduler);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ct$c */
    static abstract class AbstractRunnableC68784c<T> extends AtomicReference<T> implements Disposable, AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final AbstractC69009q<? super T> downstream;
        final long period;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer = new AtomicReference<>();
        final TimeUnit unit;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        public abstract void complete();

        /* access modifiers changed from: package-private */
        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                Scheduler scheduler2 = this.scheduler;
                long j = this.period;
                DisposableHelper.replace(this.timer, scheduler2.schedulePeriodicallyDirect(this, j, j, this.unit));
            }
        }

        AbstractRunnableC68784c(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.downstream = qVar;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ct$a */
    static final class C68782a<T> extends AbstractRunnableC68784c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.ct.AbstractRunnableC68784c
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        C68782a(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(qVar, j, timeUnit, scheduler);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C69004d dVar = new C69004d(qVar);
        if (this.f172453e) {
            this.f172123a.subscribe(new C68782a(dVar, this.f172450b, this.f172451c, this.f172452d));
        } else {
            this.f172123a.subscribe(new C68783b(dVar, this.f172450b, this.f172451c, this.f172452d));
        }
    }

    public ct(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.f172450b = j;
        this.f172451c = timeUnit;
        this.f172452d = scheduler;
        this.f172453e = z;
    }
}

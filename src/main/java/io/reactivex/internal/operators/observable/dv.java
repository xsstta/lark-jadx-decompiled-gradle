package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class dv<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172585b;

    /* renamed from: c */
    final TimeUnit f172586c;

    /* renamed from: d */
    final Scheduler f172587d;

    /* renamed from: e */
    final ObservableSource<? extends T> f172588e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.dv$d */
    public interface AbstractC68832d {
        void onTimeout(long j);
    }

    /* renamed from: io.reactivex.internal.operators.observable.dv$a */
    static final class C68829a<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172589a;

        /* renamed from: b */
        final AtomicReference<Disposable> f172590b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172589a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172589a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172589a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f172590b, disposable);
        }

        C68829a(AbstractC69009q<? super T> qVar, AtomicReference<Disposable> atomicReference) {
            this.f172589a = qVar;
            this.f172590b = atomicReference;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.dv$e */
    public static final class RunnableC68833e implements Runnable {

        /* renamed from: a */
        final AbstractC68832d f172591a;

        /* renamed from: b */
        final long f172592b;

        public void run() {
            this.f172591a.onTimeout(this.f172592b);
        }

        RunnableC68833e(long j, AbstractC68832d dVar) {
            this.f172592b = j;
            this.f172591a = dVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.dv$b */
    static final class C68830b<T> extends AtomicReference<Disposable> implements Disposable, AbstractC68832d, AbstractC69009q<T> {
        private static final long serialVersionUID = 3764492702657003550L;
        final AbstractC69009q<? super T> downstream;
        ObservableSource<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final Scheduler.AbstractC68257c worker;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        /* access modifiers changed from: package-private */
        public void startTimeout(long j) {
            this.task.replace(this.worker.mo44779a(new RunnableC68833e(j, this), this.timeout, this.unit));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.dv.AbstractC68832d
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new C68829a(this.downstream, this));
                this.worker.dispose();
            }
        }

        C68830b(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = observableSource;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.dv$c */
    static final class C68831c<T> extends AtomicLong implements Disposable, AbstractC68832d, AbstractC69009q<T> {
        private static final long serialVersionUID = 3764492702657003550L;
        final AbstractC69009q<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final Scheduler.AbstractC68257c worker;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        /* access modifiers changed from: package-private */
        public void startTimeout(long j) {
            this.task.replace(this.worker.mo44779a(new RunnableC68833e(j, this), this.timeout, this.unit));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.dv.AbstractC68832d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(C68981f.m265558a(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        C68831c(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar) {
            this.downstream = qVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        if (this.f172588e == null) {
            C68831c cVar = new C68831c(qVar, this.f172585b, this.f172586c, this.f172587d.createWorker());
            qVar.onSubscribe(cVar);
            cVar.startTimeout(0);
            this.f172123a.subscribe(cVar);
            return;
        }
        C68830b bVar = new C68830b(qVar, this.f172585b, this.f172586c, this.f172587d.createWorker(), this.f172588e);
        qVar.onSubscribe(bVar);
        bVar.startTimeout(0);
        this.f172123a.subscribe(bVar);
    }

    public dv(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        super(observable);
        this.f172585b = j;
        this.f172586c = timeUnit;
        this.f172587d = scheduler;
        this.f172588e = observableSource;
    }
}

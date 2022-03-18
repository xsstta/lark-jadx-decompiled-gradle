package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dz<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Scheduler f172605b;

    /* renamed from: io.reactivex.internal.operators.observable.dz$a */
    static final class C68837a<T> extends AtomicBoolean implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 1015244841293359600L;
        final AbstractC69009q<? super T> downstream;
        final Scheduler scheduler;
        Disposable upstream;

        /* renamed from: io.reactivex.internal.operators.observable.dz$a$a */
        final class RunnableC68838a implements Runnable {
            public void run() {
                C68837a.this.upstream.dispose();
            }

            RunnableC68838a() {
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.scheduleDirect(new RunnableC68838a());
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        C68837a(AbstractC69009q<? super T> qVar, Scheduler scheduler2) {
            this.downstream = qVar;
            this.scheduler = scheduler2;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68837a(qVar, this.f172605b));
    }

    public dz(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f172605b = scheduler;
    }
}

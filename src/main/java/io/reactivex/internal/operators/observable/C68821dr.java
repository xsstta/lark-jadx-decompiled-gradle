package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.dr */
public final class C68821dr<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172568b;

    /* renamed from: c */
    final TimeUnit f172569c;

    /* renamed from: d */
    final Scheduler f172570d;

    /* renamed from: io.reactivex.internal.operators.observable.dr$a */
    static final class RunnableC68822a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final AbstractC69009q<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        Disposable upstream;
        final Scheduler.AbstractC68257c worker;

        public void run() {
            this.gate = false;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext(t);
                Disposable disposable = (Disposable) get();
                if (disposable != null) {
                    disposable.dispose();
                }
                DisposableHelper.replace(this, this.worker.mo44779a(this, this.timeout, this.unit));
            }
        }

        RunnableC68822a(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar) {
            this.downstream = qVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new RunnableC68822a(new C69004d(qVar), this.f172568b, this.f172569c, this.f172570d.createWorker()));
    }

    public C68821dr(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f172568b = j;
        this.f172569c = timeUnit;
        this.f172570d = scheduler;
    }
}

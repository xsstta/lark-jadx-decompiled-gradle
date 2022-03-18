package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class dh<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Scheduler f172531b;

    /* renamed from: io.reactivex.internal.operators.observable.dh$a */
    static final class C68807a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 8094547886072529208L;
        final AbstractC69009q<? super T> downstream;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* access modifiers changed from: package-private */
        public void setDisposable(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        C68807a(AbstractC69009q<? super T> qVar) {
            this.downstream = qVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.dh$b */
    final class RunnableC68808b implements Runnable {

        /* renamed from: b */
        private final C68807a<T> f172533b;

        public void run() {
            dh.this.f172123a.subscribe(this.f172533b);
        }

        RunnableC68808b(C68807a<T> aVar) {
            this.f172533b = aVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68807a aVar = new C68807a(qVar);
        qVar.onSubscribe(aVar);
        aVar.setDisposable(this.f172531b.scheduleDirect(new RunnableC68808b(aVar)));
    }

    public dh(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f172531b = scheduler;
    }
}

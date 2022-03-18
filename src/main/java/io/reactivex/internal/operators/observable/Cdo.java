package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68983g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.do  reason: invalid class name */
public final class Cdo<T, U> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final ObservableSource<? extends U> f172557b;

    /* renamed from: io.reactivex.internal.operators.observable.do$a */
    static final class C68817a<T, U> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 1418547743690811973L;
        final AbstractC69009q<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final C68817a<T, U>.C68818a otherObserver = new C68818a();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.do$a$a */
        final class C68818a extends AtomicReference<Disposable> implements AbstractC69009q<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                C68817a.this.otherComplete();
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68818a() {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                C68817a.this.otherError(th);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(U u) {
                DisposableHelper.dispose(this);
                C68817a.this.otherComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            C68983g.m265564a(this.downstream, this, this.error);
        }

        /* access modifiers changed from: package-private */
        public void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            C68983g.m265564a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68983g.m265562a((AbstractC69009q) this.downstream, (Object) t, (AtomicInteger) this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        /* access modifiers changed from: package-private */
        public void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        C68817a(AbstractC69009q<? super T> qVar) {
            this.downstream = qVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68817a aVar = new C68817a(qVar);
        qVar.onSubscribe(aVar);
        this.f172557b.subscribe(aVar.otherObserver);
        this.f172123a.subscribe(aVar);
    }

    public Cdo(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f172557b = observableSource2;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.p3457e.C68296b;
import java.util.concurrent.atomic.AtomicReference;

public final class cf<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super Observable<T>, ? extends ObservableSource<R>> f172396b;

    /* renamed from: io.reactivex.internal.operators.observable.cf$a */
    static final class C68750a<T, R> implements AbstractC69009q<T> {

        /* renamed from: a */
        final C68296b<T> f172397a;

        /* renamed from: b */
        final AtomicReference<Disposable> f172398b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172397a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172397a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172397a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f172398b, disposable);
        }

        C68750a(C68296b<T> bVar, AtomicReference<Disposable> atomicReference) {
            this.f172397a = bVar;
            this.f172398b = atomicReference;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cf$b */
    static final class C68751b<T, R> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<R> {
        private static final long serialVersionUID = 854110278590336484L;
        final AbstractC69009q<? super R> downstream;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }

        C68751b(AbstractC69009q<? super R> qVar) {
            this.downstream = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        C68296b a = C68296b.m265052a();
        try {
            ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172396b.apply(a), "The selector returned a null ObservableSource");
            C68751b bVar = new C68751b(qVar);
            observableSource.subscribe(bVar);
            this.f172123a.subscribe(new C68750a(a, bVar));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public cf(ObservableSource<T> observableSource, Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        super(observableSource);
        this.f172396b = function;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class dx<T, U extends Collection<? super T>> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Callable<U> f172596b;

    /* renamed from: io.reactivex.internal.operators.observable.dx$a */
    static final class C68835a<T, U extends Collection<? super T>> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super U> f172597a;

        /* renamed from: b */
        Disposable f172598b;

        /* renamed from: c */
        U f172599c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172598b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172598b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            U u = this.f172599c;
            this.f172599c = null;
            this.f172597a.onNext(u);
            this.f172597a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172599c.add(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172599c = null;
            this.f172597a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172598b, disposable)) {
                this.f172598b = disposable;
                this.f172597a.onSubscribe(this);
            }
        }

        C68835a(AbstractC69009q<? super U> qVar, U u) {
            this.f172597a = qVar;
            this.f172599c = u;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        try {
            this.f172123a.subscribe(new C68835a(qVar, (Collection) C68362b.m265229a((Object) this.f172596b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public dx(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f172596b = callable;
    }

    public dx(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f172596b = C68326a.m265191a(i);
    }
}

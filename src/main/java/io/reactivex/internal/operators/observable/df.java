package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;

public final class df<T, U> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final ObservableSource<U> f172515b;

    /* renamed from: io.reactivex.internal.operators.observable.df$a */
    final class C68804a implements AbstractC69009q<U> {

        /* renamed from: a */
        final ArrayCompositeDisposable f172516a;

        /* renamed from: b */
        final C68805b<T> f172517b;

        /* renamed from: c */
        final C69004d<T> f172518c;

        /* renamed from: d */
        Disposable f172519d;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172517b.f172524d = true;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172516a.dispose();
            this.f172518c.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(U u) {
            this.f172519d.dispose();
            this.f172517b.f172524d = true;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172519d, disposable)) {
                this.f172519d = disposable;
                this.f172516a.setResource(1, disposable);
            }
        }

        C68804a(ArrayCompositeDisposable arrayCompositeDisposable, C68805b<T> bVar, C69004d<T> dVar) {
            this.f172516a = arrayCompositeDisposable;
            this.f172517b = bVar;
            this.f172518c = dVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.df$b */
    static final class C68805b<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172521a;

        /* renamed from: b */
        final ArrayCompositeDisposable f172522b;

        /* renamed from: c */
        Disposable f172523c;

        /* renamed from: d */
        volatile boolean f172524d;

        /* renamed from: e */
        boolean f172525e;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172522b.dispose();
            this.f172521a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172522b.dispose();
            this.f172521a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.f172525e) {
                this.f172521a.onNext(t);
            } else if (this.f172524d) {
                this.f172525e = true;
                this.f172521a.onNext(t);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172523c, disposable)) {
                this.f172523c = disposable;
                this.f172522b.setResource(0, disposable);
            }
        }

        C68805b(AbstractC69009q<? super T> qVar, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f172521a = qVar;
            this.f172522b = arrayCompositeDisposable;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C69004d dVar = new C69004d(qVar);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        dVar.onSubscribe(arrayCompositeDisposable);
        C68805b bVar = new C68805b(dVar, arrayCompositeDisposable);
        this.f172515b.subscribe(new C68804a(arrayCompositeDisposable, bVar, dVar));
        this.f172123a.subscribe(bVar);
    }

    public df(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f172515b = observableSource2;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;

public final class dg<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172526b;

    /* renamed from: io.reactivex.internal.operators.observable.dg$a */
    static final class C68806a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172527a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172528b;

        /* renamed from: c */
        Disposable f172529c;

        /* renamed from: d */
        boolean f172530d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172529c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172529c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172527a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172527a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172529c, disposable)) {
                this.f172529c = disposable;
                this.f172527a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.f172530d) {
                this.f172527a.onNext(t);
                return;
            }
            try {
                if (!this.f172528b.test(t)) {
                    this.f172530d = true;
                    this.f172527a.onNext(t);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172529c.dispose();
                this.f172527a.onError(th);
            }
        }

        C68806a(AbstractC69009q<? super T> qVar, AbstractC68322n<? super T> nVar) {
            this.f172527a = qVar;
            this.f172528b = nVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68806a(qVar, this.f172526b));
    }

    public dg(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172526b = nVar;
    }
}

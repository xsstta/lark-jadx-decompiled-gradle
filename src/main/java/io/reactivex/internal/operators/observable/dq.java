package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class dq<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172563b;

    /* renamed from: io.reactivex.internal.operators.observable.dq$a */
    static final class C68820a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172564a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172565b;

        /* renamed from: c */
        Disposable f172566c;

        /* renamed from: d */
        boolean f172567d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172566c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172566c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172567d) {
                this.f172567d = true;
                this.f172564a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172566c, disposable)) {
                this.f172566c = disposable;
                this.f172564a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172567d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172567d = true;
            this.f172564a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172567d) {
                try {
                    if (!this.f172565b.test(t)) {
                        this.f172567d = true;
                        this.f172566c.dispose();
                        this.f172564a.onComplete();
                        return;
                    }
                    this.f172564a.onNext(t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172566c.dispose();
                    onError(th);
                }
            }
        }

        C68820a(AbstractC69009q<? super T> qVar, AbstractC68322n<? super T> nVar) {
            this.f172564a = qVar;
            this.f172565b = nVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68820a(qVar, this.f172563b));
    }

    public dq(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172563b = nVar;
    }
}

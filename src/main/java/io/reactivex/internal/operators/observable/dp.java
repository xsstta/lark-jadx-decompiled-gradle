package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class dp<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172558b;

    /* renamed from: io.reactivex.internal.operators.observable.dp$a */
    static final class C68819a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172559a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172560b;

        /* renamed from: c */
        Disposable f172561c;

        /* renamed from: d */
        boolean f172562d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172561c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172561c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172562d) {
                this.f172562d = true;
                this.f172559a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172561c, disposable)) {
                this.f172561c = disposable;
                this.f172559a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.f172562d) {
                this.f172562d = true;
                this.f172559a.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172562d) {
                this.f172559a.onNext(t);
                try {
                    if (this.f172560b.test(t)) {
                        this.f172562d = true;
                        this.f172561c.dispose();
                        this.f172559a.onComplete();
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172561c.dispose();
                    onError(th);
                }
            }
        }

        C68819a(AbstractC69009q<? super T> qVar, AbstractC68322n<? super T> nVar) {
            this.f172559a = qVar;
            this.f172560b = nVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68819a(qVar, this.f172558b));
    }

    public dp(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172558b = nVar;
    }
}

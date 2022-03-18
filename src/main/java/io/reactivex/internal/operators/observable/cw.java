package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class cw<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final BiFunction<R, ? super T, R> f172463b;

    /* renamed from: c */
    final Callable<R> f172464c;

    /* renamed from: io.reactivex.internal.operators.observable.cw$a */
    static final class C68790a<T, R> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super R> f172465a;

        /* renamed from: b */
        final BiFunction<R, ? super T, R> f172466b;

        /* renamed from: c */
        R f172467c;

        /* renamed from: d */
        Disposable f172468d;

        /* renamed from: e */
        boolean f172469e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172468d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172468d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172469e) {
                this.f172469e = true;
                this.f172465a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172469e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172469e = true;
            this.f172465a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172468d, disposable)) {
                this.f172468d = disposable;
                this.f172465a.onSubscribe(this);
                this.f172465a.onNext(this.f172467c);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172469e) {
                try {
                    R r = (R) C68362b.m265229a((Object) this.f172466b.apply(this.f172467c, t), "The accumulator returned a null value");
                    this.f172467c = r;
                    this.f172465a.onNext(r);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172468d.dispose();
                    onError(th);
                }
            }
        }

        C68790a(AbstractC69009q<? super R> qVar, BiFunction<R, ? super T, R> biFunction, R r) {
            this.f172465a = qVar;
            this.f172466b = biFunction;
            this.f172467c = r;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        try {
            this.f172123a.subscribe(new C68790a(qVar, this.f172463b, C68362b.m265229a((Object) this.f172464c.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public cw(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f172463b = biFunction;
        this.f172464c = callable;
    }
}

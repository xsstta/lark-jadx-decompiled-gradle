package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

public final class bv<T, R> extends AbstractC68651a<T, ObservableSource<? extends R>> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f172353b;

    /* renamed from: c */
    final Function<? super Throwable, ? extends ObservableSource<? extends R>> f172354c;

    /* renamed from: d */
    final Callable<? extends ObservableSource<? extends R>> f172355d;

    /* renamed from: io.reactivex.internal.operators.observable.bv$a */
    static final class C68733a<T, R> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super ObservableSource<? extends R>> f172356a;

        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f172357b;

        /* renamed from: c */
        final Function<? super Throwable, ? extends ObservableSource<? extends R>> f172358c;

        /* renamed from: d */
        final Callable<? extends ObservableSource<? extends R>> f172359d;

        /* renamed from: e */
        Disposable f172360e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172360e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172360e.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            try {
                this.f172356a.onNext((ObservableSource) C68362b.m265229a(this.f172359d.call(), "The onComplete ObservableSource returned is null"));
                this.f172356a.onComplete();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172356a.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172360e, disposable)) {
                this.f172360e = disposable;
                this.f172356a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            try {
                this.f172356a.onNext((ObservableSource) C68362b.m265229a(this.f172357b.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172356a.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            try {
                this.f172356a.onNext((ObservableSource) C68362b.m265229a(this.f172358c.apply(th), "The onError ObservableSource returned is null"));
                this.f172356a.onComplete();
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.f172356a.onError(new CompositeException(th, th2));
            }
        }

        C68733a(AbstractC69009q<? super ObservableSource<? extends R>> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
            this.f172356a = qVar;
            this.f172357b = function;
            this.f172358c = function2;
            this.f172359d = callable;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super ObservableSource<? extends R>> qVar) {
        this.f172123a.subscribe(new C68733a(qVar, this.f172353b, this.f172354c, this.f172355d));
    }

    public bv(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.f172353b = function;
        this.f172354c = function2;
        this.f172355d = callable;
    }
}

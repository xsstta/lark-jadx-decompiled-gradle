package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class cc<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super Throwable, ? extends ObservableSource<? extends T>> f172374b;

    /* renamed from: c */
    final boolean f172375c;

    /* renamed from: io.reactivex.internal.operators.observable.cc$a */
    static final class C68745a<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172376a;

        /* renamed from: b */
        final Function<? super Throwable, ? extends ObservableSource<? extends T>> f172377b;

        /* renamed from: c */
        final boolean f172378c;

        /* renamed from: d */
        final SequentialDisposable f172379d = new SequentialDisposable();

        /* renamed from: e */
        boolean f172380e;

        /* renamed from: f */
        boolean f172381f;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172381f) {
                this.f172381f = true;
                this.f172380e = true;
                this.f172376a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172379d.replace(disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172381f) {
                this.f172376a.onNext(t);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.f172380e) {
                this.f172380e = true;
                if (!this.f172378c || (th instanceof Exception)) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.f172377b.apply(th);
                        if (observableSource == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f172376a.onError(nullPointerException);
                            return;
                        }
                        observableSource.subscribe(this);
                    } catch (Throwable th2) {
                        C68306a.m265071b(th2);
                        this.f172376a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f172376a.onError(th);
                }
            } else if (this.f172381f) {
                RxJavaPlugins.onError(th);
            } else {
                this.f172376a.onError(th);
            }
        }

        C68745a(AbstractC69009q<? super T> qVar, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.f172376a = qVar;
            this.f172377b = function;
            this.f172378c = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68745a aVar = new C68745a(qVar, this.f172374b, this.f172375c);
        qVar.onSubscribe(aVar.f172379d);
        this.f172123a.subscribe(aVar);
    }

    public cc(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f172374b = function;
        this.f172375c = z;
    }
}

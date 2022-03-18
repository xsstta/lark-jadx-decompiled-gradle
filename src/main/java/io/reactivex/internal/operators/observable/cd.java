package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

public final class cd<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super Throwable, ? extends T> f172382b;

    /* renamed from: io.reactivex.internal.operators.observable.cd$a */
    static final class C68746a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172383a;

        /* renamed from: b */
        final Function<? super Throwable, ? extends T> f172384b;

        /* renamed from: c */
        Disposable f172385c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172385c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172385c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172383a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172383a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172385c, disposable)) {
                this.f172385c = disposable;
                this.f172383a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            try {
                Object apply = this.f172384b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f172383a.onError(nullPointerException);
                    return;
                }
                this.f172383a.onNext(apply);
                this.f172383a.onComplete();
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.f172383a.onError(new CompositeException(th, th2));
            }
        }

        C68746a(AbstractC69009q<? super T> qVar, Function<? super Throwable, ? extends T> function) {
            this.f172383a = qVar;
            this.f172384b = function;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68746a(qVar, this.f172382b));
    }

    public cd(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f172382b = function;
    }
}

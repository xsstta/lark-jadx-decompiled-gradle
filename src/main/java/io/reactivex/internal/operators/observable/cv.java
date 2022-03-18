package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

public final class cv<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final BiFunction<T, T, T> f172457b;

    /* renamed from: io.reactivex.internal.operators.observable.cv$a */
    static final class C68789a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172458a;

        /* renamed from: b */
        final BiFunction<T, T, T> f172459b;

        /* renamed from: c */
        Disposable f172460c;

        /* renamed from: d */
        T f172461d;

        /* renamed from: e */
        boolean f172462e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172460c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172460c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172462e) {
                this.f172462e = true;
                this.f172458a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172460c, disposable)) {
                this.f172460c = disposable;
                this.f172458a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172462e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172462e = true;
            this.f172458a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172462e) {
                AbstractC69009q<? super T> qVar = this.f172458a;
                T t2 = this.f172461d;
                if (t2 == null) {
                    this.f172461d = t;
                    qVar.onNext(t);
                    return;
                }
                try {
                    T t3 = (T) C68362b.m265229a((Object) this.f172459b.apply(t2, t), "The value returned by the accumulator is null");
                    this.f172461d = t3;
                    qVar.onNext(t3);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172460c.dispose();
                    onError(th);
                }
            }
        }

        C68789a(AbstractC69009q<? super T> qVar, BiFunction<T, T, T> biFunction) {
            this.f172458a = qVar;
            this.f172459b = biFunction;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68789a(qVar, this.f172457b));
    }

    public cv(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f172457b = biFunction;
    }
}

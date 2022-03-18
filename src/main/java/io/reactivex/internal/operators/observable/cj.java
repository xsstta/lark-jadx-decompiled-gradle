package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

public final class cj<T, R> extends Single<R> {

    /* renamed from: a */
    final ObservableSource<T> f172410a;

    /* renamed from: b */
    final R f172411b;

    /* renamed from: c */
    final BiFunction<R, ? super T, R> f172412c;

    /* renamed from: io.reactivex.internal.operators.observable.cj$a */
    static final class C68755a<T, R> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super R> f172413a;

        /* renamed from: b */
        final BiFunction<R, ? super T, R> f172414b;

        /* renamed from: c */
        R f172415c;

        /* renamed from: d */
        Disposable f172416d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172416d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172416d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            R r = this.f172415c;
            if (r != null) {
                this.f172415c = null;
                this.f172413a.onSuccess(r);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172416d, disposable)) {
                this.f172416d = disposable;
                this.f172413a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172415c != null) {
                this.f172415c = null;
                this.f172413a.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            R r = this.f172415c;
            if (r != null) {
                try {
                    this.f172415c = (R) C68362b.m265229a((Object) this.f172414b.apply(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172416d.dispose();
                    onError(th);
                }
            }
        }

        C68755a(AbstractC69012t<? super R> tVar, BiFunction<R, ? super T, R> biFunction, R r) {
            this.f172413a = tVar;
            this.f172415c = r;
            this.f172414b = biFunction;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        this.f172410a.subscribe(new C68755a(tVar, this.f172412c, this.f172411b));
    }

    public cj(ObservableSource<T> observableSource, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f172410a = observableSource;
        this.f172411b = r;
        this.f172412c = biFunction;
    }
}

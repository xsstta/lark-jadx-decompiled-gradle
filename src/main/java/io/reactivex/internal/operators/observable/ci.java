package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

public final class ci<T> extends AbstractC68988j<T> {

    /* renamed from: a */
    final ObservableSource<T> f172403a;

    /* renamed from: b */
    final BiFunction<T, T, T> f172404b;

    /* renamed from: io.reactivex.internal.operators.observable.ci$a */
    static final class C68754a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172405a;

        /* renamed from: b */
        final BiFunction<T, T, T> f172406b;

        /* renamed from: c */
        boolean f172407c;

        /* renamed from: d */
        T f172408d;

        /* renamed from: e */
        Disposable f172409e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172409e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172409e.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172407c) {
                this.f172407c = true;
                T t = this.f172408d;
                this.f172408d = null;
                if (t != null) {
                    this.f172405a.onSuccess(t);
                } else {
                    this.f172405a.onComplete();
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172409e, disposable)) {
                this.f172409e = disposable;
                this.f172405a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172407c) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172407c = true;
            this.f172408d = null;
            this.f172405a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172407c) {
                T t2 = this.f172408d;
                if (t2 == null) {
                    this.f172408d = t;
                    return;
                }
                try {
                    this.f172408d = (T) C68362b.m265229a((Object) this.f172406b.apply(t2, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172409e.dispose();
                    onError(th);
                }
            }
        }

        C68754a(AbstractC68989k<? super T> kVar, BiFunction<T, T, T> biFunction) {
            this.f172405a = kVar;
            this.f172406b = biFunction;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172403a.subscribe(new C68754a(kVar, this.f172404b));
    }

    public ci(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f172403a = observableSource;
        this.f172404b = biFunction;
    }
}

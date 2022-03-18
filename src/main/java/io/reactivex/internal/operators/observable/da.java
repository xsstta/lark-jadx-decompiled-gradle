package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class da<T> extends AbstractC68988j<T> {

    /* renamed from: a */
    final ObservableSource<T> f172493a;

    /* renamed from: io.reactivex.internal.operators.observable.da$a */
    static final class C68798a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172494a;

        /* renamed from: b */
        Disposable f172495b;

        /* renamed from: c */
        T f172496c;

        /* renamed from: d */
        boolean f172497d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172495b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172495b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172497d) {
                this.f172497d = true;
                T t = this.f172496c;
                this.f172496c = null;
                if (t == null) {
                    this.f172494a.onComplete();
                } else {
                    this.f172494a.onSuccess(t);
                }
            }
        }

        C68798a(AbstractC68989k<? super T> kVar) {
            this.f172494a = kVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172495b, disposable)) {
                this.f172495b = disposable;
                this.f172494a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172497d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172497d = true;
            this.f172494a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172497d) {
                if (this.f172496c != null) {
                    this.f172497d = true;
                    this.f172495b.dispose();
                    this.f172494a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f172496c = t;
            }
        }
    }

    public da(ObservableSource<T> observableSource) {
        this.f172493a = observableSource;
    }

    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172493a.subscribe(new C68798a(kVar));
    }
}

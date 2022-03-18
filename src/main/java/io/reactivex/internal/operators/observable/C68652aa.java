package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.aa */
public final class C68652aa<T> extends Single<Long> implements AbstractC68367d<Long> {

    /* renamed from: a */
    final ObservableSource<T> f172124a;

    /* renamed from: io.reactivex.internal.operators.observable.aa$a */
    static final class C68653a implements Disposable, AbstractC69009q<Object> {

        /* renamed from: a */
        final AbstractC69012t<? super Long> f172125a;

        /* renamed from: b */
        Disposable f172126b;

        /* renamed from: c */
        long f172127c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172126b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172126b.dispose();
            this.f172126b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172126b = DisposableHelper.DISPOSED;
            this.f172125a.onSuccess(Long.valueOf(this.f172127c));
        }

        C68653a(AbstractC69012t<? super Long> tVar) {
            this.f172125a = tVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            this.f172127c++;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172126b = DisposableHelper.DISPOSED;
            this.f172125a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172126b, disposable)) {
                this.f172126b = disposable;
                this.f172125a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<Long> cE_() {
        return RxJavaPlugins.onAssembly(new C68922z(this.f172124a));
    }

    public C68652aa(ObservableSource<T> observableSource) {
        this.f172124a = observableSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Long> tVar) {
        this.f172124a.subscribe(new C68653a(tVar));
    }
}

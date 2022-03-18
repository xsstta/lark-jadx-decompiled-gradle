package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* renamed from: io.reactivex.internal.operators.maybe.f */
public final class C68644f<T> extends Observable<T> {

    /* renamed from: a */
    final AbstractC68990l<T> f172110a;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.maybe.f$a */
    public static final class C68645a<T> extends DeferredScalarDisposable<T> implements AbstractC68989k<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        Disposable upstream;

        @Override // io.reactivex.AbstractC68989k
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.disposables.Disposable, io.reactivex.internal.observers.DeferredScalarDisposable
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        C68645a(AbstractC69009q<? super T> qVar) {
            super(qVar);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    /* renamed from: a */
    public static <T> AbstractC68989k<T> m265355a(AbstractC69009q<? super T> qVar) {
        return new C68645a(qVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172110a.mo238772a(m265355a(qVar));
    }
}

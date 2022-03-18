package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* renamed from: io.reactivex.internal.operators.c.au */
public final class au<T> extends Observable<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171823a;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.au$a */
    public static final class C68461a<T> extends DeferredScalarDisposable<T> implements AbstractC69012t<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable, io.reactivex.internal.observers.DeferredScalarDisposable
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        C68461a(AbstractC69009q<? super T> qVar) {
            super(qVar);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public au(AbstractC69015w<? extends T> wVar) {
        this.f171823a = wVar;
    }

    /* renamed from: a */
    public static <T> AbstractC69012t<T> m265282a(AbstractC69009q<? super T> qVar) {
        return new C68461a(qVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f171823a.subscribe(m265282a(qVar));
    }
}

package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.c.af */
public final class C68441af<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171786a;

    /* renamed from: io.reactivex.internal.operators.c.af$a */
    static final class C68442a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171787a;

        /* renamed from: b */
        Disposable f171788b;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171788b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171788b.isDisposed();
        }

        C68442a(AbstractC69012t<? super T> tVar) {
            this.f171787a = tVar;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171787a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171787a.onSuccess(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171788b, disposable)) {
                this.f171788b = disposable;
                this.f171787a.onSubscribe(this);
            }
        }
    }

    public C68441af(AbstractC69015w<? extends T> wVar) {
        this.f171786a = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171786a.subscribe(new C68442a(tVar));
    }
}

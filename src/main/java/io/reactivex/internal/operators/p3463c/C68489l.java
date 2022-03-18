package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.c.l */
public final class C68489l<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171875a;

    /* renamed from: io.reactivex.internal.operators.c.l$a */
    static final class C68490a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        AbstractC69012t<? super T> f171876a;

        /* renamed from: b */
        Disposable f171877b;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171877b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171876a = null;
            this.f171877b.dispose();
            this.f171877b = DisposableHelper.DISPOSED;
        }

        C68490a(AbstractC69012t<? super T> tVar) {
            this.f171876a = tVar;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171877b = DisposableHelper.DISPOSED;
            AbstractC69012t<? super T> tVar = this.f171876a;
            if (tVar != null) {
                this.f171876a = null;
                tVar.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171877b, disposable)) {
                this.f171877b = disposable;
                this.f171876a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171877b = DisposableHelper.DISPOSED;
            AbstractC69012t<? super T> tVar = this.f171876a;
            if (tVar != null) {
                this.f171876a = null;
                tVar.onSuccess(t);
            }
        }
    }

    public C68489l(AbstractC69015w<T> wVar) {
        this.f171875a = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171875a.subscribe(new C68490a(tVar));
    }
}

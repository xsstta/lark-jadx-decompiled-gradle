package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.c */
public final class C68638c<T> extends AbstractC68988j<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f172102a;

    /* renamed from: io.reactivex.internal.operators.maybe.c$a */
    static final class C68639a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172103a;

        /* renamed from: b */
        Disposable f172104b;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172104b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172104b.dispose();
            this.f172104b = DisposableHelper.DISPOSED;
        }

        C68639a(AbstractC68989k<? super T> kVar) {
            this.f172103a = kVar;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f172104b = DisposableHelper.DISPOSED;
            this.f172103a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172104b, disposable)) {
                this.f172104b = disposable;
                this.f172103a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f172104b = DisposableHelper.DISPOSED;
            this.f172103a.onSuccess(t);
        }
    }

    public C68638c(AbstractC69015w<T> wVar) {
        this.f172102a = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172102a.subscribe(new C68639a(kVar));
    }
}

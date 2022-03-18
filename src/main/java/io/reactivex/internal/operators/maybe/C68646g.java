package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.maybe.g */
public final class C68646g<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC68990l<T> f172111a;

    /* renamed from: b */
    final T f172112b;

    /* renamed from: io.reactivex.internal.operators.maybe.g$a */
    static final class C68647a<T> implements Disposable, AbstractC68989k<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f172113a;

        /* renamed from: b */
        final T f172114b;

        /* renamed from: c */
        Disposable f172115c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172115c.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172115c.dispose();
            this.f172115c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.AbstractC68989k
        public void onComplete() {
            this.f172115c = DisposableHelper.DISPOSED;
            T t = this.f172114b;
            if (t != null) {
                this.f172113a.onSuccess(t);
            } else {
                this.f172113a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.AbstractC68989k
        public void onError(Throwable th) {
            this.f172115c = DisposableHelper.DISPOSED;
            this.f172113a.onError(th);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172115c, disposable)) {
                this.f172115c = disposable;
                this.f172113a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(T t) {
            this.f172115c = DisposableHelper.DISPOSED;
            this.f172113a.onSuccess(t);
        }

        C68647a(AbstractC69012t<? super T> tVar, T t) {
            this.f172113a = tVar;
            this.f172114b = t;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f172111a.mo238772a(new C68647a(tVar, this.f172112b));
    }

    public C68646g(AbstractC68990l<T> lVar, T t) {
        this.f172111a = lVar;
        this.f172112b = t;
    }
}

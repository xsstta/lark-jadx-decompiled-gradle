package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.b */
public final class C68636b<T> extends AbstractC68988j<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f172097a;

    /* renamed from: b */
    final AbstractC68322n<? super T> f172098b;

    /* renamed from: io.reactivex.internal.operators.maybe.b$a */
    static final class C68637a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172099a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172100b;

        /* renamed from: c */
        Disposable f172101c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172101c.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f172101c;
            this.f172101c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f172099a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172101c, disposable)) {
                this.f172101c = disposable;
                this.f172099a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                if (this.f172100b.test(t)) {
                    this.f172099a.onSuccess(t);
                } else {
                    this.f172099a.onComplete();
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172099a.onError(th);
            }
        }

        C68637a(AbstractC68989k<? super T> kVar, AbstractC68322n<? super T> nVar) {
            this.f172099a = kVar;
            this.f172100b = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172097a.subscribe(new C68637a(kVar, this.f172098b));
    }

    public C68636b(AbstractC69015w<T> wVar, AbstractC68322n<? super T> nVar) {
        this.f172097a = wVar;
        this.f172098b = nVar;
    }
}

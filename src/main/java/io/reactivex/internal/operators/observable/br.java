package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class br<T> extends AbstractC68988j<T> {

    /* renamed from: a */
    final ObservableSource<T> f172340a;

    /* renamed from: io.reactivex.internal.operators.observable.br$a */
    static final class C68730a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172341a;

        /* renamed from: b */
        Disposable f172342b;

        /* renamed from: c */
        T f172343c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172342b.dispose();
            this.f172342b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172342b == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172342b = DisposableHelper.DISPOSED;
            T t = this.f172343c;
            if (t != null) {
                this.f172343c = null;
                this.f172341a.onSuccess(t);
                return;
            }
            this.f172341a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172343c = t;
        }

        C68730a(AbstractC68989k<? super T> kVar) {
            this.f172341a = kVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172342b = DisposableHelper.DISPOSED;
            this.f172343c = null;
            this.f172341a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172342b, disposable)) {
                this.f172342b = disposable;
                this.f172341a.onSubscribe(this);
            }
        }
    }

    public br(ObservableSource<T> observableSource) {
        this.f172340a = observableSource;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172340a.subscribe(new C68730a(kVar));
    }
}

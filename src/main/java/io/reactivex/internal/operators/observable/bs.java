package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

public final class bs<T> extends Single<T> {

    /* renamed from: a */
    final ObservableSource<T> f172344a;

    /* renamed from: b */
    final T f172345b;

    /* renamed from: io.reactivex.internal.operators.observable.bs$a */
    static final class C68731a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f172346a;

        /* renamed from: b */
        final T f172347b;

        /* renamed from: c */
        Disposable f172348c;

        /* renamed from: d */
        T f172349d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172348c.dispose();
            this.f172348c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172348c == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172348c = DisposableHelper.DISPOSED;
            T t = this.f172349d;
            if (t != null) {
                this.f172349d = null;
                this.f172346a.onSuccess(t);
                return;
            }
            T t2 = this.f172347b;
            if (t2 != null) {
                this.f172346a.onSuccess(t2);
            } else {
                this.f172346a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172349d = t;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172348c = DisposableHelper.DISPOSED;
            this.f172349d = null;
            this.f172346a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172348c, disposable)) {
                this.f172348c = disposable;
                this.f172346a.onSubscribe(this);
            }
        }

        C68731a(AbstractC69012t<? super T> tVar, T t) {
            this.f172346a = tVar;
            this.f172347b = t;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f172344a.subscribe(new C68731a(tVar, this.f172345b));
    }

    public bs(ObservableSource<T> observableSource, T t) {
        this.f172344a = observableSource;
        this.f172345b = t;
    }
}

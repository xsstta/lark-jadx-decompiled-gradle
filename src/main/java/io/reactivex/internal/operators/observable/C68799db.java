package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.observable.db */
public final class C68799db<T> extends Single<T> {

    /* renamed from: a */
    final ObservableSource<? extends T> f172498a;

    /* renamed from: b */
    final T f172499b;

    /* renamed from: io.reactivex.internal.operators.observable.db$a */
    static final class C68800a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f172500a;

        /* renamed from: b */
        final T f172501b;

        /* renamed from: c */
        Disposable f172502c;

        /* renamed from: d */
        T f172503d;

        /* renamed from: e */
        boolean f172504e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172502c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172502c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172504e) {
                this.f172504e = true;
                T t = this.f172503d;
                this.f172503d = null;
                if (t == null) {
                    t = this.f172501b;
                }
                if (t != null) {
                    this.f172500a.onSuccess(t);
                } else {
                    this.f172500a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172502c, disposable)) {
                this.f172502c = disposable;
                this.f172500a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172504e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172504e = true;
            this.f172500a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172504e) {
                if (this.f172503d != null) {
                    this.f172504e = true;
                    this.f172502c.dispose();
                    this.f172500a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f172503d = t;
            }
        }

        C68800a(AbstractC69012t<? super T> tVar, T t) {
            this.f172500a = tVar;
            this.f172501b = t;
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f172498a.subscribe(new C68800a(tVar, this.f172499b));
    }

    public C68799db(ObservableSource<? extends T> observableSource, T t) {
        this.f172498a = observableSource;
        this.f172499b = t;
    }
}

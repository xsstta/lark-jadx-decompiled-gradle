package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class dk<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172542b;

    /* renamed from: io.reactivex.internal.operators.observable.dk$a */
    static final class C68813a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172543a;

        /* renamed from: b */
        boolean f172544b;

        /* renamed from: c */
        Disposable f172545c;

        /* renamed from: d */
        long f172546d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172545c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172545c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172544b) {
                this.f172544b = true;
                this.f172545c.dispose();
                this.f172543a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172544b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172544b = true;
            this.f172545c.dispose();
            this.f172543a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            boolean z;
            if (!this.f172544b) {
                long j = this.f172546d;
                long j2 = j - 1;
                this.f172546d = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f172543a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172545c, disposable)) {
                this.f172545c = disposable;
                if (this.f172546d == 0) {
                    this.f172544b = true;
                    disposable.dispose();
                    EmptyDisposable.complete(this.f172543a);
                    return;
                }
                this.f172543a.onSubscribe(this);
            }
        }

        C68813a(AbstractC69009q<? super T> qVar, long j) {
            this.f172543a = qVar;
            this.f172546d = j;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68813a(qVar, this.f172542b));
    }

    public dk(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f172542b = j;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class ap<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172208b;

    /* renamed from: c */
    final T f172209c;

    /* renamed from: d */
    final boolean f172210d;

    /* renamed from: io.reactivex.internal.operators.observable.ap$a */
    static final class C68681a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172211a;

        /* renamed from: b */
        final long f172212b;

        /* renamed from: c */
        final T f172213c;

        /* renamed from: d */
        final boolean f172214d;

        /* renamed from: e */
        Disposable f172215e;

        /* renamed from: f */
        long f172216f;

        /* renamed from: g */
        boolean f172217g;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172215e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172215e.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172217g) {
                this.f172217g = true;
                T t = this.f172213c;
                if (t != null || !this.f172214d) {
                    if (t != null) {
                        this.f172211a.onNext(t);
                    }
                    this.f172211a.onComplete();
                    return;
                }
                this.f172211a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172215e, disposable)) {
                this.f172215e = disposable;
                this.f172211a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172217g) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172217g = true;
            this.f172211a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172217g) {
                long j = this.f172216f;
                if (j == this.f172212b) {
                    this.f172217g = true;
                    this.f172215e.dispose();
                    this.f172211a.onNext(t);
                    this.f172211a.onComplete();
                    return;
                }
                this.f172216f = j + 1;
            }
        }

        C68681a(AbstractC69009q<? super T> qVar, long j, T t, boolean z) {
            this.f172211a = qVar;
            this.f172212b = j;
            this.f172213c = t;
            this.f172214d = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68681a(qVar, this.f172208b, this.f172209c, this.f172210d));
    }

    public ap(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f172208b = j;
        this.f172209c = t;
        this.f172210d = z;
    }
}

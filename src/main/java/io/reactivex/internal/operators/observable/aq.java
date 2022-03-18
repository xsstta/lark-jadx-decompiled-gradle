package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;

public final class aq<T> extends AbstractC68988j<T> implements AbstractC68367d<T> {

    /* renamed from: a */
    final ObservableSource<T> f172218a;

    /* renamed from: b */
    final long f172219b;

    /* renamed from: io.reactivex.internal.operators.observable.aq$a */
    static final class C68682a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC68989k<? super T> f172220a;

        /* renamed from: b */
        final long f172221b;

        /* renamed from: c */
        Disposable f172222c;

        /* renamed from: d */
        long f172223d;

        /* renamed from: e */
        boolean f172224e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172222c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172222c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172224e) {
                this.f172224e = true;
                this.f172220a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172222c, disposable)) {
                this.f172222c = disposable;
                this.f172220a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172224e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172224e = true;
            this.f172220a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172224e) {
                long j = this.f172223d;
                if (j == this.f172221b) {
                    this.f172224e = true;
                    this.f172222c.dispose();
                    this.f172220a.onSuccess(t);
                    return;
                }
                this.f172223d = j + 1;
            }
        }

        C68682a(AbstractC68989k<? super T> kVar, long j) {
            this.f172220a = kVar;
            this.f172221b = j;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<T> cE_() {
        return RxJavaPlugins.onAssembly(new ap(this.f172218a, this.f172219b, null, false));
    }

    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super T> kVar) {
        this.f172218a.subscribe(new C68682a(kVar, this.f172219b));
    }

    public aq(ObservableSource<T> observableSource, long j) {
        this.f172218a = observableSource;
        this.f172219b = j;
    }
}

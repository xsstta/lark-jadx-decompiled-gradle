package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class ar<T> extends Single<T> implements AbstractC68367d<T> {

    /* renamed from: a */
    final ObservableSource<T> f172225a;

    /* renamed from: b */
    final long f172226b;

    /* renamed from: c */
    final T f172227c;

    /* renamed from: io.reactivex.internal.operators.observable.ar$a */
    static final class C68683a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f172228a;

        /* renamed from: b */
        final long f172229b;

        /* renamed from: c */
        final T f172230c;

        /* renamed from: d */
        Disposable f172231d;

        /* renamed from: e */
        long f172232e;

        /* renamed from: f */
        boolean f172233f;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172231d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172231d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172233f) {
                this.f172233f = true;
                T t = this.f172230c;
                if (t != null) {
                    this.f172228a.onSuccess(t);
                } else {
                    this.f172228a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172231d, disposable)) {
                this.f172231d = disposable;
                this.f172228a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172233f) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172233f = true;
            this.f172228a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172233f) {
                long j = this.f172232e;
                if (j == this.f172229b) {
                    this.f172233f = true;
                    this.f172231d.dispose();
                    this.f172228a.onSuccess(t);
                    return;
                }
                this.f172232e = j + 1;
            }
        }

        C68683a(AbstractC69012t<? super T> tVar, long j, T t) {
            this.f172228a = tVar;
            this.f172229b = j;
            this.f172230c = t;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<T> cE_() {
        return RxJavaPlugins.onAssembly(new ap(this.f172225a, this.f172226b, this.f172227c, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f172225a.subscribe(new C68683a(tVar, this.f172226b, this.f172227c));
    }

    public ar(ObservableSource<T> observableSource, long j, T t) {
        this.f172225a = observableSource;
        this.f172226b = j;
        this.f172227c = t;
    }
}

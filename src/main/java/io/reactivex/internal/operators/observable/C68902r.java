package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.r */
public final class C68902r<T, U> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Callable<? extends U> f172823b;

    /* renamed from: c */
    final AbstractC68310b<? super U, ? super T> f172824c;

    /* renamed from: io.reactivex.internal.operators.observable.r$a */
    static final class C68903a<T, U> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super U> f172825a;

        /* renamed from: b */
        final AbstractC68310b<? super U, ? super T> f172826b;

        /* renamed from: c */
        final U f172827c;

        /* renamed from: d */
        Disposable f172828d;

        /* renamed from: e */
        boolean f172829e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172828d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172828d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172829e) {
                this.f172829e = true;
                this.f172825a.onNext(this.f172827c);
                this.f172825a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172828d, disposable)) {
                this.f172828d = disposable;
                this.f172825a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172829e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172829e = true;
            this.f172825a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172829e) {
                try {
                    this.f172826b.accept(this.f172827c, t);
                } catch (Throwable th) {
                    this.f172828d.dispose();
                    onError(th);
                }
            }
        }

        C68903a(AbstractC69009q<? super U> qVar, U u, AbstractC68310b<? super U, ? super T> bVar) {
            this.f172825a = qVar;
            this.f172826b = bVar;
            this.f172827c = u;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        try {
            this.f172123a.subscribe(new C68903a(qVar, C68362b.m265229a(this.f172823b.call(), "The initialSupplier returned a null value"), this.f172824c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, qVar);
        }
    }

    public C68902r(ObservableSource<T> observableSource, Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        super(observableSource);
        this.f172823b = callable;
        this.f172824c = bVar;
    }
}

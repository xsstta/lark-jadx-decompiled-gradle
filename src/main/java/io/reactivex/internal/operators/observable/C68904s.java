package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.s */
public final class C68904s<T, U> extends Single<U> implements AbstractC68367d<U> {

    /* renamed from: a */
    final ObservableSource<T> f172830a;

    /* renamed from: b */
    final Callable<? extends U> f172831b;

    /* renamed from: c */
    final AbstractC68310b<? super U, ? super T> f172832c;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    static final class C68905a<T, U> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super U> f172833a;

        /* renamed from: b */
        final AbstractC68310b<? super U, ? super T> f172834b;

        /* renamed from: c */
        final U f172835c;

        /* renamed from: d */
        Disposable f172836d;

        /* renamed from: e */
        boolean f172837e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172836d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172836d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172837e) {
                this.f172837e = true;
                this.f172833a.onSuccess(this.f172835c);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172836d, disposable)) {
                this.f172836d = disposable;
                this.f172833a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172837e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172837e = true;
            this.f172833a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172837e) {
                try {
                    this.f172834b.accept(this.f172835c, t);
                } catch (Throwable th) {
                    this.f172836d.dispose();
                    onError(th);
                }
            }
        }

        C68905a(AbstractC69012t<? super U> tVar, U u, AbstractC68310b<? super U, ? super T> bVar) {
            this.f172833a = tVar;
            this.f172834b = bVar;
            this.f172835c = u;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<U> cE_() {
        return RxJavaPlugins.onAssembly(new C68902r(this.f172830a, this.f172831b, this.f172832c));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super U> tVar) {
        try {
            this.f172830a.subscribe(new C68905a(tVar, C68362b.m265229a(this.f172831b.call(), "The initialSupplier returned a null value"), this.f172832c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, tVar);
        }
    }

    public C68904s(ObservableSource<T> observableSource, Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        this.f172830a = observableSource;
        this.f172831b = callable;
        this.f172832c = bVar;
    }
}

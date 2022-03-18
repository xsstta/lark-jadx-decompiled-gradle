package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class dy<T, U extends Collection<? super T>> extends Single<U> implements AbstractC68367d<U> {

    /* renamed from: a */
    final ObservableSource<T> f172600a;

    /* renamed from: b */
    final Callable<U> f172601b;

    /* renamed from: io.reactivex.internal.operators.observable.dy$a */
    static final class C68836a<T, U extends Collection<? super T>> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super U> f172602a;

        /* renamed from: b */
        U f172603b;

        /* renamed from: c */
        Disposable f172604c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172604c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172604c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            U u = this.f172603b;
            this.f172603b = null;
            this.f172602a.onSuccess(u);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172603b.add(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172603b = null;
            this.f172602a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172604c, disposable)) {
                this.f172604c = disposable;
                this.f172602a.onSubscribe(this);
            }
        }

        C68836a(AbstractC69012t<? super U> tVar, U u) {
            this.f172602a = tVar;
            this.f172603b = u;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<U> cE_() {
        return RxJavaPlugins.onAssembly(new dx(this.f172600a, this.f172601b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super U> tVar) {
        try {
            this.f172600a.subscribe(new C68836a(tVar, (Collection) C68362b.m265229a((Object) this.f172601b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, tVar);
        }
    }

    public dy(ObservableSource<T> observableSource, Callable<U> callable) {
        this.f172600a = observableSource;
        this.f172601b = callable;
    }

    public dy(ObservableSource<T> observableSource, int i) {
        this.f172600a = observableSource;
        this.f172601b = C68326a.m265191a(i);
    }
}

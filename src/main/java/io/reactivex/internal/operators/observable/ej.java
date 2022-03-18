package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

public final class ej<T, U, V> extends Observable<V> {

    /* renamed from: a */
    final Observable<? extends T> f172710a;

    /* renamed from: b */
    final Iterable<U> f172711b;

    /* renamed from: c */
    final BiFunction<? super T, ? super U, ? extends V> f172712c;

    /* renamed from: io.reactivex.internal.operators.observable.ej$a */
    static final class C68867a<T, U, V> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super V> f172713a;

        /* renamed from: b */
        final Iterator<U> f172714b;

        /* renamed from: c */
        final BiFunction<? super T, ? super U, ? extends V> f172715c;

        /* renamed from: d */
        Disposable f172716d;

        /* renamed from: e */
        boolean f172717e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172716d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172716d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172717e) {
                this.f172717e = true;
                this.f172713a.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238568a(Throwable th) {
            this.f172717e = true;
            this.f172716d.dispose();
            this.f172713a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172716d, disposable)) {
                this.f172716d = disposable;
                this.f172713a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172717e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172717e = true;
            this.f172713a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172717e) {
                try {
                    try {
                        this.f172713a.onNext(C68362b.m265229a(this.f172715c.apply(t, C68362b.m265229a((Object) this.f172714b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.f172714b.hasNext()) {
                                this.f172717e = true;
                                this.f172716d.dispose();
                                this.f172713a.onComplete();
                            }
                        } catch (Throwable th) {
                            C68306a.m265071b(th);
                            mo238568a(th);
                        }
                    } catch (Throwable th2) {
                        C68306a.m265071b(th2);
                        mo238568a(th2);
                    }
                } catch (Throwable th3) {
                    C68306a.m265071b(th3);
                    mo238568a(th3);
                }
            }
        }

        C68867a(AbstractC69009q<? super V> qVar, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f172713a = qVar;
            this.f172714b = it;
            this.f172715c = biFunction;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super V> qVar) {
        try {
            Iterator it = (Iterator) C68362b.m265229a((Object) this.f172711b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(qVar);
                } else {
                    this.f172710a.subscribe(new C68867a(qVar, it, this.f172712c));
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, qVar);
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            EmptyDisposable.error(th2, qVar);
        }
    }

    public ej(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f172710a = observable;
        this.f172711b = iterable;
        this.f172712c = biFunction;
    }
}

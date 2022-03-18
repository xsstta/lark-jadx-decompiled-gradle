package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

public final class ba<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends Iterable<? extends R>> f172253b;

    /* renamed from: io.reactivex.internal.operators.observable.ba$a */
    static final class C68698a<T, R> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super R> f172254a;

        /* renamed from: b */
        final Function<? super T, ? extends Iterable<? extends R>> f172255b;

        /* renamed from: c */
        Disposable f172256c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172256c.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172256c.dispose();
            this.f172256c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.f172256c != DisposableHelper.DISPOSED) {
                this.f172256c = DisposableHelper.DISPOSED;
                this.f172254a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172256c, disposable)) {
                this.f172256c = disposable;
                this.f172254a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172256c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172256c = DisposableHelper.DISPOSED;
            this.f172254a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.f172256c != DisposableHelper.DISPOSED) {
                try {
                    AbstractC69009q<? super R> qVar = this.f172254a;
                    for (T t2 : (Iterable) this.f172255b.apply(t)) {
                        try {
                            try {
                                qVar.onNext((Object) C68362b.m265229a((Object) t2, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C68306a.m265071b(th);
                                this.f172256c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            this.f172256c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C68306a.m265071b(th3);
                    this.f172256c.dispose();
                    onError(th3);
                }
            }
        }

        C68698a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f172254a = qVar;
            this.f172255b = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        this.f172123a.subscribe(new C68698a(qVar, this.f172253b));
    }

    public ba(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f172253b = function;
    }
}

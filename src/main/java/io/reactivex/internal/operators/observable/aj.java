package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.AbstractC68377a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class aj<T, K> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super T, K> f172182b;

    /* renamed from: c */
    final Callable<? extends Collection<? super K>> f172183c;

    /* renamed from: io.reactivex.internal.operators.observable.aj$a */
    static final class C68676a<T, K> extends AbstractC68377a<T, T> {

        /* renamed from: f */
        final Collection<? super K> f172184f;

        /* renamed from: g */
        final Function<? super T, K> f172185g;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j, io.reactivex.internal.observers.AbstractC68377a
        public void clear() {
            this.f172184f.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.AbstractC68377a, io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f171686d) {
                this.f171686d = true;
                this.f172184f.clear();
                this.f171683a.onComplete();
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T t;
            do {
                t = (T) this.f171685c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f172184f.add((Object) C68362b.m265229a((Object) this.f172185g.apply(t), "The keySelector returned a null key")));
            return t;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238104a(i);
        }

        @Override // io.reactivex.internal.observers.AbstractC68377a, io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f171686d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171686d = true;
            this.f172184f.clear();
            this.f171683a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f171686d) {
                if (this.f171687e == 0) {
                    try {
                        if (this.f172184f.add(C68362b.m265229a((Object) this.f172185g.apply(t), "The keySelector returned a null key"))) {
                            this.f171683a.onNext(t);
                        }
                    } catch (Throwable th) {
                        mo238105a(th);
                    }
                } else {
                    this.f171683a.onNext(null);
                }
            }
        }

        C68676a(AbstractC69009q<? super T> qVar, Function<? super T, K> function, Collection<? super K> collection) {
            super(qVar);
            this.f172185g = function;
            this.f172184f = collection;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        try {
            this.f172123a.subscribe(new C68676a(qVar, this.f172182b, (Collection) C68362b.m265229a(this.f172183c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public aj(ObservableSource<T> observableSource, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(observableSource);
        this.f172182b = function;
        this.f172183c = callable;
    }
}

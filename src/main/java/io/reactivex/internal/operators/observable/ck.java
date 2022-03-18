package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69012t;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.cj;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

public final class ck<T, R> extends Single<R> {

    /* renamed from: a */
    final ObservableSource<T> f172417a;

    /* renamed from: b */
    final Callable<R> f172418b;

    /* renamed from: c */
    final BiFunction<R, ? super T, R> f172419c;

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        try {
            this.f172417a.subscribe(new cj.C68755a(tVar, this.f172419c, C68362b.m265229a((Object) this.f172418b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, tVar);
        }
    }

    public ck(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f172417a = observableSource;
        this.f172418b = callable;
        this.f172419c = biFunction;
    }
}

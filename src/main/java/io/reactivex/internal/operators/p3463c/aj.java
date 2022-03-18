package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;

/* renamed from: io.reactivex.internal.operators.c.aj */
public final class aj<T, R> extends Single<R> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171795a;

    /* renamed from: b */
    final Function<? super T, ? extends R> f171796b;

    /* renamed from: io.reactivex.internal.operators.c.aj$a */
    static final class C68449a<T, R> implements AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super R> f171797a;

        /* renamed from: b */
        final Function<? super T, ? extends R> f171798b;

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171797a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171797a.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                this.f171797a.onSuccess(C68362b.m265229a(this.f171798b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                onError(th);
            }
        }

        C68449a(AbstractC69012t<? super R> tVar, Function<? super T, ? extends R> function) {
            this.f171797a = tVar;
            this.f171798b = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        this.f171795a.subscribe(new C68449a(tVar, this.f171796b));
    }

    public aj(AbstractC69015w<? extends T> wVar, Function<? super T, ? extends R> function) {
        this.f171795a = wVar;
        this.f171796b = function;
    }
}

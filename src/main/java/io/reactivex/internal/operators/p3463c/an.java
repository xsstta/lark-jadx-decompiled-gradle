package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;

/* renamed from: io.reactivex.internal.operators.c.an */
public final class an<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171803a;

    /* renamed from: b */
    final Function<? super Throwable, ? extends T> f171804b;

    /* renamed from: c */
    final T f171805c;

    /* renamed from: io.reactivex.internal.operators.c.an$a */
    final class C68451a implements AbstractC69012t<T> {

        /* renamed from: b */
        private final AbstractC69012t<? super T> f171807b;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171807b.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171807b.onSuccess(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            T t;
            if (an.this.f171804b != null) {
                try {
                    t = (Object) an.this.f171804b.apply(th);
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    this.f171807b.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = an.this.f171805c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f171807b.onError(nullPointerException);
                return;
            }
            this.f171807b.onSuccess(t);
        }

        C68451a(AbstractC69012t<? super T> tVar) {
            this.f171807b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171803a.subscribe(new C68451a(tVar));
    }

    public an(AbstractC69015w<? extends T> wVar, Function<? super Throwable, ? extends T> function, T t) {
        this.f171803a = wVar;
        this.f171804b = function;
        this.f171805c = t;
    }
}

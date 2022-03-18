package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.c.q */
public final class C68499q<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171892a;

    /* renamed from: b */
    final Consumer<? super Throwable> f171893b;

    /* renamed from: io.reactivex.internal.operators.c.q$a */
    final class C68500a implements AbstractC69012t<T> {

        /* renamed from: b */
        private final AbstractC69012t<? super T> f171895b;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171895b.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171895b.onSuccess(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            try {
                C68499q.this.f171893b.accept(th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                th = new CompositeException(th, th2);
            }
            this.f171895b.onError(th);
        }

        C68500a(AbstractC69012t<? super T> tVar) {
            this.f171895b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171892a.subscribe(new C68500a(tVar));
    }

    public C68499q(AbstractC69015w<T> wVar, Consumer<? super Throwable> consumer) {
        this.f171892a = wVar;
        this.f171893b = consumer;
    }
}

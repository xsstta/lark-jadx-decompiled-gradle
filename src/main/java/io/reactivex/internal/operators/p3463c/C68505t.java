package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.c.t */
public final class C68505t<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171905a;

    /* renamed from: b */
    final Consumer<? super T> f171906b;

    /* renamed from: io.reactivex.internal.operators.c.t$a */
    final class C68506a implements AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171907a;

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171907a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171907a.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                C68505t.this.f171906b.accept(t);
                this.f171907a.onSuccess(t);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171907a.onError(th);
            }
        }

        C68506a(AbstractC69012t<? super T> tVar) {
            this.f171907a = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171905a.subscribe(new C68506a(tVar));
    }

    public C68505t(AbstractC69015w<T> wVar, Consumer<? super T> consumer) {
        this.f171905a = wVar;
        this.f171906b = consumer;
    }
}

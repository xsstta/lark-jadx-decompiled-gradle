package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68310b;

/* renamed from: io.reactivex.internal.operators.c.r */
public final class C68501r<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171896a;

    /* renamed from: b */
    final AbstractC68310b<? super T, ? super Throwable> f171897b;

    /* renamed from: io.reactivex.internal.operators.c.r$a */
    final class C68502a implements AbstractC69012t<T> {

        /* renamed from: b */
        private final AbstractC69012t<? super T> f171899b;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171899b.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                C68501r.this.f171897b.accept(t, null);
                this.f171899b.onSuccess(t);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171899b.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            try {
                C68501r.this.f171897b.accept(null, th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                th = new CompositeException(th, th2);
            }
            this.f171899b.onError(th);
        }

        C68502a(AbstractC69012t<? super T> tVar) {
            this.f171899b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171896a.subscribe(new C68502a(tVar));
    }

    public C68501r(AbstractC69015w<T> wVar, AbstractC68310b<? super T, ? super Throwable> bVar) {
        this.f171896a = wVar;
        this.f171897b = bVar;
    }
}

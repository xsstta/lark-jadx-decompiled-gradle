package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68311c;

/* renamed from: io.reactivex.internal.operators.c.c */
public final class C68470c<T> extends Single<Boolean> {

    /* renamed from: a */
    final AbstractC69015w<T> f171843a;

    /* renamed from: b */
    final Object f171844b;

    /* renamed from: c */
    final AbstractC68311c<Object, Object> f171845c;

    /* renamed from: io.reactivex.internal.operators.c.c$a */
    final class C68471a implements AbstractC69012t<T> {

        /* renamed from: b */
        private final AbstractC69012t<? super Boolean> f171847b;

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171847b.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171847b.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                this.f171847b.onSuccess(Boolean.valueOf(C68470c.this.f171845c.mo238039a(t, C68470c.this.f171844b)));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171847b.onError(th);
            }
        }

        C68471a(AbstractC69012t<? super Boolean> tVar) {
            this.f171847b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Boolean> tVar) {
        this.f171843a.subscribe(new C68471a(tVar));
    }

    public C68470c(AbstractC69015w<T> wVar, Object obj, AbstractC68311c<Object, Object> cVar) {
        this.f171843a = wVar;
        this.f171844b = obj;
        this.f171845c = cVar;
    }
}

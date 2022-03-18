package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.c.u */
public final class C68507u<T> extends Single<Boolean> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171909a;

    /* renamed from: b */
    final AbstractC69015w<? extends T> f171910b;

    /* renamed from: io.reactivex.internal.operators.c.u$a */
    static class C68508a<T> implements AbstractC69012t<T> {

        /* renamed from: a */
        final int f171911a;

        /* renamed from: b */
        final C68289a f171912b;

        /* renamed from: c */
        final Object[] f171913c;

        /* renamed from: d */
        final AbstractC69012t<? super Boolean> f171914d;

        /* renamed from: e */
        final AtomicInteger f171915e;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171912b.mo237937a(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            int i;
            do {
                i = this.f171915e.get();
                if (i >= 2) {
                    RxJavaPlugins.onError(th);
                    return;
                }
            } while (!this.f171915e.compareAndSet(i, 2));
            this.f171912b.dispose();
            this.f171914d.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171913c[this.f171911a] = t;
            if (this.f171915e.incrementAndGet() == 2) {
                AbstractC69012t<? super Boolean> tVar = this.f171914d;
                Object[] objArr = this.f171913c;
                tVar.onSuccess(Boolean.valueOf(C68362b.m265230a(objArr[0], objArr[1])));
            }
        }

        C68508a(int i, C68289a aVar, Object[] objArr, AbstractC69012t<? super Boolean> tVar, AtomicInteger atomicInteger) {
            this.f171911a = i;
            this.f171912b = aVar;
            this.f171913c = objArr;
            this.f171914d = tVar;
            this.f171915e = atomicInteger;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Boolean> tVar) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        C68289a aVar = new C68289a();
        tVar.onSubscribe(aVar);
        this.f171909a.subscribe(new C68508a(0, aVar, objArr, tVar, atomicInteger));
        this.f171910b.subscribe(new C68508a(1, aVar, objArr, tVar, atomicInteger));
    }

    public C68507u(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2) {
        this.f171909a = wVar;
        this.f171910b = wVar2;
    }
}

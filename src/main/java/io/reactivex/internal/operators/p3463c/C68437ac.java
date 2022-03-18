package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.C68290b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.c.ac */
public final class C68437ac<T> extends Single<T> {

    /* renamed from: a */
    final Callable<? extends T> f171778a;

    public C68437ac(Callable<? extends T> callable) {
        this.f171778a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        Disposable a = C68290b.m265039a();
        tVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object obj = (Object) C68362b.m265229a(this.f171778a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    tVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                if (!a.isDisposed()) {
                    tVar.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}

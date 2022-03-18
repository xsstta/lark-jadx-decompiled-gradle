package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.p */
public final class C68497p<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171890a;

    /* renamed from: b */
    final AbstractC68309a f171891b;

    /* renamed from: io.reactivex.internal.operators.c.p$a */
    static final class C68498a<T> extends AtomicReference<AbstractC68309a> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -8583764624474935784L;
        final AbstractC69012t<? super T> downstream;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            AbstractC68309a aVar = (AbstractC68309a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        C68498a(AbstractC69012t<? super T> tVar, AbstractC68309a aVar) {
            this.downstream = tVar;
            lazySet(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171890a.subscribe(new C68498a(tVar, this.f171891b));
    }

    public C68497p(AbstractC69015w<T> wVar, AbstractC68309a aVar) {
        this.f171890a = wVar;
        this.f171891b = aVar;
    }
}

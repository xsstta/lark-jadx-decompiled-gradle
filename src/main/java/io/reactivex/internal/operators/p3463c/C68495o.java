package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.c.o */
public final class C68495o<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171888a;

    /* renamed from: b */
    final AbstractC68309a f171889b;

    /* renamed from: io.reactivex.internal.operators.c.o$a */
    static final class C68496a<T> extends AtomicInteger implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final AbstractC69012t<? super T> downstream;
        final AbstractC68309a onFinally;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            runFinally();
        }

        C68496a(AbstractC69012t<? super T> tVar, AbstractC68309a aVar) {
            this.downstream = tVar;
            this.onFinally = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171888a.subscribe(new C68496a(tVar, this.f171889b));
    }

    public C68495o(AbstractC69015w<T> wVar, AbstractC68309a aVar) {
        this.f171888a = wVar;
        this.f171889b = aVar;
    }
}

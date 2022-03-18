package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C68391o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.c.i */
public final class C68483i<T, U> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171866a;

    /* renamed from: b */
    final AbstractC70020b<U> f171867b;

    /* renamed from: io.reactivex.internal.operators.c.i$a */
    static final class C68484a<T, U> extends AtomicReference<Disposable> implements Disposable, AbstractC68325i<U> {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final AbstractC69012t<? super T> downstream;
        final AbstractC69015w<T> source;
        AbstractC70022d upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.source.subscribe(new C68391o(this, this.downstream));
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(U u) {
            this.upstream.cancel();
            onComplete();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        C68484a(AbstractC69012t<? super T> tVar, AbstractC69015w<T> wVar) {
            this.downstream = tVar;
            this.source = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171867b.subscribe(new C68484a(tVar, this.f171866a));
    }

    public C68483i(AbstractC69015w<T> wVar, AbstractC70020b<U> bVar) {
        this.f171866a = wVar;
        this.f171867b = bVar;
    }
}

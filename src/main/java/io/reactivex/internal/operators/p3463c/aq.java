package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.c.aq */
public final class aq<T, U> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171812a;

    /* renamed from: b */
    final AbstractC70020b<U> f171813b;

    /* renamed from: io.reactivex.internal.operators.c.aq$b */
    static final class C68455b extends AtomicReference<AbstractC70022d> implements AbstractC68325i<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final C68454a<?> parent;

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (get() != SubscriptionHelper.CANCELLED) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.otherError(new CancellationException());
            }
        }

        C68455b(C68454a<?> aVar) {
            this.parent = aVar;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.otherError(new CancellationException());
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.c.aq$a */
    static final class C68454a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -622603812305745221L;
        final AbstractC69012t<? super T> downstream;
        final C68455b other = new C68455b(this);

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            this.other.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        C68454a(AbstractC69012t<? super T> tVar) {
            this.downstream = tVar;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.other.dispose();
            if (((Disposable) getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.other.dispose();
            if (((Disposable) get()) == DisposableHelper.DISPOSED || ((Disposable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void otherError(Throwable th) {
            Disposable disposable;
            if (((Disposable) get()) == DisposableHelper.DISPOSED || (disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            this.downstream.onError(th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        C68454a aVar = new C68454a(tVar);
        tVar.onSubscribe(aVar);
        this.f171813b.subscribe(aVar.other);
        this.f171812a.subscribe(aVar);
    }

    public aq(AbstractC69015w<T> wVar, AbstractC70020b<U> bVar) {
        this.f171812a = wVar;
        this.f171813b = bVar;
    }
}

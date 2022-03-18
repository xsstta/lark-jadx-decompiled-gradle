package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.ar */
public final class ar<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171814a;

    /* renamed from: b */
    final long f171815b;

    /* renamed from: c */
    final TimeUnit f171816c;

    /* renamed from: d */
    final Scheduler f171817d;

    /* renamed from: e */
    final AbstractC69015w<? extends T> f171818e;

    /* renamed from: io.reactivex.internal.operators.c.ar$a */
    static final class RunnableC68456a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T>, Runnable {
        private static final long serialVersionUID = 37497744973048446L;
        final AbstractC69012t<? super T> downstream;
        final C68457a<T> fallback;
        AbstractC69015w<? extends T> other;
        final AtomicReference<Disposable> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.task);
            C68457a<T> aVar = this.fallback;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void run() {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                if (disposable != null) {
                    disposable.dispose();
                }
                AbstractC69015w<? extends T> wVar = this.other;
                if (wVar == null) {
                    this.downstream.onError(new TimeoutException(C68981f.m265558a(this.timeout, this.unit)));
                    return;
                }
                this.other = null;
                wVar.subscribe(this.fallback);
            }
        }

        /* renamed from: io.reactivex.internal.operators.c.ar$a$a */
        static final class C68457a<T> extends AtomicReference<Disposable> implements AbstractC69012t<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final AbstractC69012t<? super T> downstream;

            @Override // io.reactivex.AbstractC69012t
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68457a(AbstractC69012t<? super T> tVar) {
                this.downstream = tVar;
            }

            @Override // io.reactivex.AbstractC69012t
            public void onError(Throwable th) {
                this.downstream.onError(th);
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                DisposableHelper.dispose(this.task);
                this.downstream.onSuccess(t);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            Disposable disposable = (Disposable) get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, DisposableHelper.DISPOSED)) {
                RxJavaPlugins.onError(th);
                return;
            }
            DisposableHelper.dispose(this.task);
            this.downstream.onError(th);
        }

        RunnableC68456a(AbstractC69012t<? super T> tVar, AbstractC69015w<? extends T> wVar, long j, TimeUnit timeUnit) {
            this.downstream = tVar;
            this.other = wVar;
            this.timeout = j;
            this.unit = timeUnit;
            if (wVar != null) {
                this.fallback = new C68457a<>(tVar);
            } else {
                this.fallback = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        RunnableC68456a aVar = new RunnableC68456a(tVar, this.f171818e, this.f171815b, this.f171816c);
        tVar.onSubscribe(aVar);
        DisposableHelper.replace(aVar.task, this.f171817d.scheduleDirect(aVar, this.f171815b, this.f171816c));
        this.f171814a.subscribe(aVar);
    }

    public ar(AbstractC69015w<T> wVar, long j, TimeUnit timeUnit, Scheduler scheduler, AbstractC69015w<? extends T> wVar2) {
        this.f171814a = wVar;
        this.f171815b = j;
        this.f171816c = timeUnit;
        this.f171817d = scheduler;
        this.f171818e = wVar2;
    }
}

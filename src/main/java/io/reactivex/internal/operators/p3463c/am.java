package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.am */
public final class am<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171801a;

    /* renamed from: b */
    final Scheduler f171802b;

    /* renamed from: io.reactivex.internal.operators.c.am$a */
    static final class RunnableC68450a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T>, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final AbstractC69012t<? super T> downstream;
        Throwable error;
        final Scheduler scheduler;
        T value;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        RunnableC68450a(AbstractC69012t<? super T> tVar, Scheduler scheduler2) {
            this.downstream = tVar;
            this.scheduler = scheduler2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171801a.subscribe(new RunnableC68450a(tVar, this.f171802b));
    }

    public am(AbstractC69015w<T> wVar, Scheduler scheduler) {
        this.f171801a = wVar;
        this.f171802b = scheduler;
    }
}

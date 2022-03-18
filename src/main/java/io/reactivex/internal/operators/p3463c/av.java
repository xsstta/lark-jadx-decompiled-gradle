package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.av */
public final class av<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171824a;

    /* renamed from: b */
    final Scheduler f171825b;

    /* renamed from: io.reactivex.internal.operators.c.av$a */
    static final class RunnableC68462a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T>, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final AbstractC69012t<? super T> downstream;
        Disposable ds;
        final Scheduler scheduler;

        public void run() {
            this.ds.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
            if (disposable != DisposableHelper.DISPOSED) {
                this.ds = disposable;
                this.scheduler.scheduleDirect(this);
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
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        RunnableC68462a(AbstractC69012t<? super T> tVar, Scheduler scheduler2) {
            this.downstream = tVar;
            this.scheduler = scheduler2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171824a.subscribe(new RunnableC68462a(tVar, this.f171825b));
    }

    public av(AbstractC69015w<T> wVar, Scheduler scheduler) {
        this.f171824a = wVar;
        this.f171825b = scheduler;
    }
}

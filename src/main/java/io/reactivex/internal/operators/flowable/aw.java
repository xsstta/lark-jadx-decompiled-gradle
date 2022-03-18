package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class aw extends AbstractC68307f<Long> {

    /* renamed from: b */
    final Scheduler f171990b;

    /* renamed from: c */
    final long f171991c;

    /* renamed from: d */
    final TimeUnit f171992d;

    /* renamed from: io.reactivex.internal.operators.flowable.aw$a */
    static final class RunnableC68564a extends AtomicReference<Disposable> implements Runnable, AbstractC70022d {
        private static final long serialVersionUID = -2809475196591179431L;
        final AbstractC70021c<? super Long> downstream;
        volatile boolean requested;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }

        RunnableC68564a(AbstractC70021c<? super Long> cVar) {
            this.downstream = cVar;
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super Long> cVar) {
        RunnableC68564a aVar = new RunnableC68564a(cVar);
        cVar.onSubscribe(aVar);
        aVar.setResource(this.f171990b.scheduleDirect(aVar, this.f171991c, this.f171992d));
    }

    public aw(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f171991c = j;
        this.f171992d = timeUnit;
        this.f171990b = scheduler;
    }
}

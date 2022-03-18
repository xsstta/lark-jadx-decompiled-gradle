package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.C68962m;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.z */
public final class C68633z extends AbstractC68307f<Long> {

    /* renamed from: b */
    final Scheduler f172092b;

    /* renamed from: c */
    final long f172093c;

    /* renamed from: d */
    final long f172094d;

    /* renamed from: e */
    final TimeUnit f172095e;

    /* renamed from: io.reactivex.internal.operators.flowable.z$a */
    static final class RunnableC68634a extends AtomicLong implements Runnable, AbstractC70022d {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final AbstractC70021c<? super Long> downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        public void run() {
            if (this.resource.get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (get() != 0) {
                AbstractC70021c<? super Long> cVar = this.downstream;
                long j = this.count;
                this.count = j + 1;
                cVar.onNext(Long.valueOf(j));
                C68977b.m265549b(this, 1);
                return;
            }
            AbstractC70021c<? super Long> cVar2 = this.downstream;
            cVar2.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
            DisposableHelper.dispose(this.resource);
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }

        RunnableC68634a(AbstractC70021c<? super Long> cVar) {
            this.downstream = cVar;
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this, j);
            }
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super Long> cVar) {
        RunnableC68634a aVar = new RunnableC68634a(cVar);
        cVar.onSubscribe(aVar);
        Scheduler scheduler = this.f172092b;
        if (scheduler instanceof C68962m) {
            Scheduler.AbstractC68257c createWorker = scheduler.createWorker();
            aVar.setResource(createWorker);
            createWorker.mo237796a(aVar, this.f172093c, this.f172094d, this.f172095e);
            return;
        }
        aVar.setResource(scheduler.schedulePeriodicallyDirect(aVar, this.f172093c, this.f172094d, this.f172095e));
    }

    public C68633z(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f172093c = j;
        this.f172094d = j2;
        this.f172095e = timeUnit;
        this.f172092b = scheduler;
    }
}

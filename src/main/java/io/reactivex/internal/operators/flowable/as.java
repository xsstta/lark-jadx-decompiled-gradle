package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class as<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Scheduler f171968c;

    /* renamed from: d */
    final boolean f171969d;

    /* renamed from: io.reactivex.internal.operators.flowable.as$a */
    static final class RunnableC68554a<T> extends AtomicReference<Thread> implements AbstractC68325i<T>, Runnable, AbstractC70022d {
        private static final long serialVersionUID = 8094547886072529208L;
        final AbstractC70021c<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        AbstractC70020b<T> source;
        final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();
        final Scheduler.AbstractC68257c worker;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.flowable.as$a$a */
        public static final class RunnableC68555a implements Runnable {

            /* renamed from: a */
            final AbstractC70022d f171970a;

            /* renamed from: b */
            final long f171971b;

            public void run() {
                this.f171970a.request(this.f171971b);
            }

            RunnableC68555a(AbstractC70022d dVar, long j) {
                this.f171970a = dVar;
                this.f171971b = j;
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public void run() {
            lazySet(Thread.currentThread());
            AbstractC70020b<T> bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    requestUpstream(andSet, dVar);
                }
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                AbstractC70022d dVar = this.upstream.get();
                if (dVar != null) {
                    requestUpstream(j, dVar);
                    return;
                }
                C68977b.m265548a(this.requested, j);
                AbstractC70022d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        requestUpstream(andSet, dVar2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void requestUpstream(long j, AbstractC70022d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.worker.mo237795a(new RunnableC68555a(dVar, j));
            }
        }

        RunnableC68554a(AbstractC70021c<? super T> cVar, Scheduler.AbstractC68257c cVar2, AbstractC70020b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = cVar2;
            this.source = bVar;
            this.nonScheduledRequests = !z;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        Scheduler.AbstractC68257c createWorker = this.f171968c.createWorker();
        RunnableC68554a aVar = new RunnableC68554a(cVar, createWorker, this.f171934b, this.f171969d);
        cVar.onSubscribe(aVar);
        createWorker.mo237795a(aVar);
    }

    public as(AbstractC68307f<T> fVar, Scheduler scheduler, boolean z) {
        super(fVar);
        this.f171968c = scheduler;
        this.f171969d = z;
    }
}

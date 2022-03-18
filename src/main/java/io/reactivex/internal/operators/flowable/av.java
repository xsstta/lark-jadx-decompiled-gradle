package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class av<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final long f171982c;

    /* renamed from: d */
    final TimeUnit f171983d;

    /* renamed from: e */
    final Scheduler f171984e;

    /* renamed from: f */
    final AbstractC70020b<? extends T> f171985f;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.av$d */
    public interface AbstractC68562d {
        void onTimeout(long j);
    }

    /* renamed from: io.reactivex.internal.operators.flowable.av$a */
    static final class C68559a<T> implements AbstractC68325i<T> {

        /* renamed from: a */
        final AbstractC70021c<? super T> f171986a;

        /* renamed from: b */
        final SubscriptionArbiter f171987b;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.f171986a.onComplete();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.f171986a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.f171986a.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            this.f171987b.setSubscription(dVar);
        }

        C68559a(AbstractC70021c<? super T> cVar, SubscriptionArbiter subscriptionArbiter) {
            this.f171986a = cVar;
            this.f171987b = subscriptionArbiter;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.av$e */
    public static final class RunnableC68563e implements Runnable {

        /* renamed from: a */
        final AbstractC68562d f171988a;

        /* renamed from: b */
        final long f171989b;

        public void run() {
            this.f171988a.onTimeout(this.f171989b);
        }

        RunnableC68563e(long j, AbstractC68562d dVar) {
            this.f171989b = j;
            this.f171988a = dVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.av$b */
    static final class C68560b<T> extends SubscriptionArbiter implements AbstractC68325i<T>, AbstractC68562d {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final AbstractC70021c<? super T> downstream;
        AbstractC70020b<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();
        final Scheduler.AbstractC68257c worker;

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.p3511d.AbstractC70022d
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                setSubscription(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void startTimeout(long j) {
            this.task.replace(this.worker.mo44779a(new RunnableC68563e(j, this), this.timeout, this.unit));
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.av.AbstractC68562d
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    produced(j2);
                }
                AbstractC70020b<? extends T> bVar = this.fallback;
                this.fallback = null;
                bVar.subscribe(new C68559a(this.downstream, this));
                this.worker.dispose();
            }
        }

        C68560b(AbstractC70021c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar2, AbstractC70020b<? extends T> bVar) {
            super(true);
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
            this.fallback = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.av$c */
    static final class C68561c<T> extends AtomicLong implements AbstractC68325i<T>, AbstractC68562d, AbstractC70022d {
        private static final long serialVersionUID = 3764492702657003550L;
        final AbstractC70021c<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();
        final Scheduler.AbstractC68257c worker;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        /* access modifiers changed from: package-private */
        public void startTimeout(long j) {
            this.task.replace(this.worker.mo44779a(new RunnableC68563e(j, this), this.timeout, this.unit));
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.av.AbstractC68562d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(C68981f.m265558a(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        C68561c(AbstractC70021c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar2) {
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (this.f171985f == null) {
            C68561c cVar2 = new C68561c(cVar, this.f171982c, this.f171983d, this.f171984e.createWorker());
            cVar.onSubscribe(cVar2);
            cVar2.startTimeout(0);
            this.f171934b.mo238000a((AbstractC68325i) cVar2);
            return;
        }
        C68560b bVar = new C68560b(cVar, this.f171982c, this.f171983d, this.f171984e.createWorker(), this.f171985f);
        cVar.onSubscribe(bVar);
        bVar.startTimeout(0);
        this.f171934b.mo238000a((AbstractC68325i) bVar);
    }

    public av(AbstractC68307f<T> fVar, long j, TimeUnit timeUnit, Scheduler scheduler, AbstractC70020b<? extends T> bVar) {
        super(fVar);
        this.f171982c = j;
        this.f171983d = timeUnit;
        this.f171984e = scheduler;
        this.f171985f = bVar;
    }
}

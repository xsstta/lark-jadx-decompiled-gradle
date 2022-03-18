package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class an<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68322n<? super Throwable> f171954c;

    /* renamed from: d */
    final long f171955d;

    /* renamed from: io.reactivex.internal.operators.flowable.an$a */
    static final class C68549a<T> extends AtomicInteger implements AbstractC68325i<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC70021c<? super T> downstream;
        final AbstractC68322n<? super Throwable> predicate;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final AbstractC70020b<? extends T> source;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.sa.produced(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            this.sa.setSubscription(dVar);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68549a(AbstractC70021c<? super T> cVar, long j, AbstractC68322n<? super Throwable> nVar, SubscriptionArbiter subscriptionArbiter, AbstractC70020b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = nVar;
            this.remaining = j;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new C68549a(cVar, this.f171955d, this.f171954c, subscriptionArbiter, this.f171934b).subscribeNext();
    }

    public an(AbstractC68307f<T> fVar, long j, AbstractC68322n<? super Throwable> nVar) {
        super(fVar);
        this.f171954c = nVar;
        this.f171955d = j;
    }
}

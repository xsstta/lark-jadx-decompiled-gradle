package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class aj<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final long f171950c;

    /* renamed from: io.reactivex.internal.operators.flowable.aj$a */
    static final class C68543a<T> extends AtomicInteger implements AbstractC68325i<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC70021c<? super T> downstream;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final AbstractC70020b<? extends T> source;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
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

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.downstream.onError(th);
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

        C68543a(AbstractC70021c<? super T> cVar, long j, SubscriptionArbiter subscriptionArbiter, AbstractC70020b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.remaining = j;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        long j = this.f171950c;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C68543a(cVar, j2, subscriptionArbiter, this.f171934b).subscribeNext();
    }

    public aj(AbstractC68307f<T> fVar, long j) {
        super(fVar);
        this.f171950c = j;
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68312d;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class ak<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68312d f171951c;

    /* renamed from: io.reactivex.internal.operators.flowable.ak$a */
    static final class C68544a<T> extends AtomicInteger implements AbstractC68325i<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC70021c<? super T> downstream;
        long produced;
        final SubscriptionArbiter sa;
        final AbstractC70020b<? extends T> source;
        final AbstractC68312d stop;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            try {
                if (this.stop.mo238040a()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
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

        C68544a(AbstractC70021c<? super T> cVar, AbstractC68312d dVar, SubscriptionArbiter subscriptionArbiter, AbstractC70020b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.stop = dVar;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new C68544a(cVar, this.f171951c, subscriptionArbiter, this.f171934b).subscribeNext();
    }

    public ak(AbstractC68307f<T> fVar, AbstractC68312d dVar) {
        super(fVar);
        this.f171951c = dVar;
    }
}

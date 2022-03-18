package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class am<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68311c<? super Integer, ? super Throwable> f171953c;

    /* renamed from: io.reactivex.internal.operators.flowable.am$a */
    static final class C68548a<T> extends AtomicInteger implements AbstractC68325i<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC70021c<? super T> downstream;
        final AbstractC68311c<? super Integer, ? super Throwable> predicate;
        long produced;
        int retries;
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
            try {
                AbstractC68311c<? super Integer, ? super Throwable> cVar = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (!cVar.mo238039a(Integer.valueOf(i), th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68548a(AbstractC70021c<? super T> cVar, AbstractC68311c<? super Integer, ? super Throwable> cVar2, SubscriptionArbiter subscriptionArbiter, AbstractC70020b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = cVar2;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new C68548a(cVar, this.f171953c, subscriptionArbiter, this.f171934b).subscribeNext();
    }

    public am(AbstractC68307f<T> fVar, AbstractC68311c<? super Integer, ? super Throwable> cVar) {
        super(fVar);
        this.f171953c = cVar;
    }
}

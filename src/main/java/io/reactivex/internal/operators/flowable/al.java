package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p3455c.AbstractC68274a;
import io.reactivex.p3455c.C68276c;
import io.reactivex.p3458f.C68308a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class al<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Function<? super AbstractC68307f<Object>, ? extends AbstractC70020b<?>> f171952c;

    /* renamed from: io.reactivex.internal.operators.flowable.al$b */
    static final class C68546b<T, U> extends AtomicInteger implements AbstractC68325i<Object>, AbstractC70022d {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final AbstractC70020b<T> source;
        AbstractC68547c<T, U> subscriber;
        final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        C68546b(AbstractC70020b<T> bVar) {
            this.source = bVar;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.al$a */
    static final class C68545a<T> extends AbstractC68547c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            again(0);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }

        C68545a(AbstractC70021c<? super T> cVar, AbstractC68274a<Object> aVar, AbstractC70022d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.al$c */
    public static abstract class AbstractC68547c<T, U> extends SubscriptionArbiter implements AbstractC68325i<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final AbstractC70021c<? super T> downstream;
        protected final AbstractC68274a<U> processor;
        private long produced;
        protected final AbstractC70022d receiver;

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.p3511d.AbstractC70022d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public final void onSubscribe(AbstractC70022d dVar) {
            setSubscription(dVar);
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        /* access modifiers changed from: protected */
        public final void again(U u) {
            setSubscription(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.receiver.request(1);
            this.processor.onNext(u);
        }

        AbstractC68547c(AbstractC70021c<? super T> cVar, AbstractC68274a<U> aVar, AbstractC70022d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = aVar;
            this.receiver = dVar;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        C68308a aVar = new C68308a(cVar);
        AbstractC68274a<T> l = C68276c.m265012a(8).mo237904l();
        try {
            AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.f171952c.apply(l), "handler returned a null Publisher");
            C68546b bVar2 = new C68546b(this.f171934b);
            C68545a aVar2 = new C68545a(aVar, l, bVar2);
            bVar2.subscriber = aVar2;
            cVar.onSubscribe(aVar2);
            bVar.subscribe(bVar2);
            bVar2.onNext(0);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public al(AbstractC68307f<T> fVar, Function<? super AbstractC68307f<Object>, ? extends AbstractC70020b<?>> function) {
        super(fVar);
        this.f171952c = function;
    }
}

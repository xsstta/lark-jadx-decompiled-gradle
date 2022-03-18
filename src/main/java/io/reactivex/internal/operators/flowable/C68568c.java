package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.c */
public final class C68568c<T, U> extends AbstractC68522a<T, U> {

    /* renamed from: c */
    final Callable<? extends U> f171998c;

    /* renamed from: d */
    final AbstractC68310b<? super U, ? super T> f171999d;

    /* renamed from: io.reactivex.internal.operators.flowable.c$a */
    static final class C68569a<T, U> extends DeferredScalarSubscription<U> implements AbstractC68325i<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final AbstractC68310b<? super U, ? super T> collector;
        boolean done;

        /* renamed from: u */
        final U f172000u;
        AbstractC70022d upstream;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.p3511d.AbstractC70022d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                complete(this.f172000u);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.done) {
                try {
                    this.collector.accept(this.f172000u, t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        C68569a(AbstractC70021c<? super U> cVar, U u, AbstractC68310b<? super U, ? super T> bVar) {
            super(cVar);
            this.collector = bVar;
            this.f172000u = u;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super U> cVar) {
        try {
            this.f171934b.mo238000a((AbstractC68325i) new C68569a(cVar, C68362b.m265229a(this.f171998c.call(), "The initial value supplied is null"), this.f171999d));
        } catch (Throwable th) {
            EmptySubscription.error(th, cVar);
        }
    }

    public C68568c(AbstractC68307f<T> fVar, Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        super(fVar);
        this.f171998c = callable;
        this.f171999d = bVar;
    }
}

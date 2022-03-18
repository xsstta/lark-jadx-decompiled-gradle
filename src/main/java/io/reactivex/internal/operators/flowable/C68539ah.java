package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.ah */
public final class C68539ah<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Function<? super Throwable, ? extends AbstractC70020b<? extends T>> f171947c;

    /* renamed from: d */
    final boolean f171948d;

    /* renamed from: io.reactivex.internal.operators.flowable.ah$a */
    static final class C68540a<T> extends SubscriptionArbiter implements AbstractC68325i<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final AbstractC70021c<? super T> downstream;
        final Function<? super Throwable, ? extends AbstractC70020b<? extends T>> nextSupplier;
        boolean once;
        long produced;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.once = true;
                this.downstream.onComplete();
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            setSubscription(dVar);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.done) {
                if (!this.once) {
                    this.produced++;
                }
                this.downstream.onNext(t);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (!this.once) {
                this.once = true;
                if (!this.allowFatal || (th instanceof Exception)) {
                    try {
                        AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
                        long j = this.produced;
                        if (j != 0) {
                            produced(j);
                        }
                        bVar.subscribe(this);
                    } catch (Throwable th2) {
                        C68306a.m265071b(th2);
                        this.downstream.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.downstream.onError(th);
                }
            } else if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        C68540a(AbstractC70021c<? super T> cVar, Function<? super Throwable, ? extends AbstractC70020b<? extends T>> function, boolean z) {
            super(false);
            this.downstream = cVar;
            this.nextSupplier = function;
            this.allowFatal = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        C68540a aVar = new C68540a(cVar, this.f171947c, this.f171948d);
        cVar.onSubscribe(aVar);
        this.f171934b.mo238000a((AbstractC68325i) aVar);
    }

    public C68539ah(AbstractC68307f<T> fVar, Function<? super Throwable, ? extends AbstractC70020b<? extends T>> function, boolean z) {
        super(fVar);
        this.f171947c = function;
        this.f171948d = z;
    }
}

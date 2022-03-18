package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.af */
public final class C68535af<T> extends AbstractC68522a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.af$a */
    static final class C68536a<T> extends AtomicLong implements AbstractC68325i<T>, AbstractC70022d {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final AbstractC70021c<? super T> downstream;
        AbstractC70022d upstream;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        C68536a(AbstractC70021c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this, j);
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

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    C68977b.m265549b(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }
    }

    public C68535af(AbstractC68307f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68536a(cVar));
    }
}

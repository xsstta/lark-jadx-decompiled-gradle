package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class aq<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final T f171959c;

    /* renamed from: d */
    final boolean f171960d;

    /* renamed from: io.reactivex.internal.operators.flowable.aq$a */
    static final class C68552a<T> extends DeferredScalarSubscription<T> implements AbstractC68325i<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
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
                T t = (T) this.value;
                this.value = null;
                if (t == null) {
                    t = this.defaultValue;
                }
                if (t != null) {
                    complete(t);
                } else if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
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
                if (this.value != null) {
                    this.done = true;
                    this.upstream.cancel();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        C68552a(AbstractC70021c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.defaultValue = t;
            this.failOnEmpty = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68552a(cVar, this.f171959c, this.f171960d));
    }

    public aq(AbstractC68307f<T> fVar, T t, boolean z) {
        super(fVar);
        this.f171959c = t;
        this.f171960d = z;
    }
}

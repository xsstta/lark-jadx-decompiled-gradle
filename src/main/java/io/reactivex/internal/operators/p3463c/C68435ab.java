package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.c.ab */
public final class C68435ab<T, R> extends AbstractC68307f<R> {

    /* renamed from: b */
    final AbstractC69015w<T> f171776b;

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends R>> f171777c;

    /* renamed from: io.reactivex.internal.operators.c.ab$a */
    static final class C68436a<S, T> extends AtomicLong implements AbstractC68325i<T>, AbstractC69012t<S>, AbstractC70022d {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final AbstractC70021c<? super T> downstream;
        final Function<? super S, ? extends AbstractC70020b<? extends T>> mapper;
        final AtomicReference<AbstractC70022d> parent = new AtomicReference<>();

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable2) {
            this.disposable = disposable2;
            this.downstream.onSubscribe(this);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.parent, this, j);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, dVar);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(S s) {
            try {
                ((AbstractC70020b) C68362b.m265229a(this.mapper.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
            }
        }

        C68436a(AbstractC70021c<? super T> cVar, Function<? super S, ? extends AbstractC70020b<? extends T>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        this.f171776b.subscribe(new C68436a(cVar, this.f171777c));
    }

    public C68435ab(AbstractC69015w<T> wVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        this.f171776b = wVar;
        this.f171777c = function;
    }
}

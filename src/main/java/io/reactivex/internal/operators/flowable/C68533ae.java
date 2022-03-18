package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.ae */
public final class C68533ae<T> extends AbstractC68522a<T, T> implements Consumer<T> {

    /* renamed from: c */
    final Consumer<? super T> f171946c = this;

    @Override // io.reactivex.functions.Consumer
    public void accept(T t) {
    }

    /* renamed from: io.reactivex.internal.operators.flowable.ae$a */
    static final class C68534a<T> extends AtomicLong implements AbstractC68325i<T>, AbstractC70022d {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final AbstractC70021c<? super T> downstream;
        final Consumer<? super T> onDrop;
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
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        C68534a(AbstractC70021c<? super T> cVar, Consumer<? super T> consumer) {
            this.downstream = cVar;
            this.onDrop = consumer;
        }
    }

    public C68533ae(AbstractC68307f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68534a(cVar, this.f171946c));
    }
}

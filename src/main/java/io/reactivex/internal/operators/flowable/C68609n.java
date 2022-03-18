package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68321m;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.n */
public final class C68609n<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    private final Consumer<? super AbstractC70022d> f172060c;

    /* renamed from: d */
    private final AbstractC68321m f172061d;

    /* renamed from: e */
    private final AbstractC68309a f172062e;

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    static final class C68610a<T> implements AbstractC68325i<T>, AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f172063a;

        /* renamed from: b */
        final Consumer<? super AbstractC70022d> f172064b;

        /* renamed from: c */
        final AbstractC68321m f172065c;

        /* renamed from: d */
        final AbstractC68309a f172066d;

        /* renamed from: e */
        AbstractC70022d f172067e;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (this.f172067e != SubscriptionHelper.CANCELLED) {
                this.f172063a.onComplete();
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            AbstractC70022d dVar = this.f172067e;
            if (dVar != SubscriptionHelper.CANCELLED) {
                this.f172067e = SubscriptionHelper.CANCELLED;
                try {
                    this.f172066d.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
                dVar.cancel();
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.f172063a.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.f172067e != SubscriptionHelper.CANCELLED) {
                this.f172063a.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            try {
                this.f172065c.mo238045a(j);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
            this.f172067e.request(j);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            try {
                this.f172064b.accept(dVar);
                if (SubscriptionHelper.validate(this.f172067e, dVar)) {
                    this.f172067e = dVar;
                    this.f172063a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                dVar.cancel();
                this.f172067e = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.f172063a);
            }
        }

        C68610a(AbstractC70021c<? super T> cVar, Consumer<? super AbstractC70022d> consumer, AbstractC68321m mVar, AbstractC68309a aVar) {
            this.f172063a = cVar;
            this.f172064b = consumer;
            this.f172066d = aVar;
            this.f172065c = mVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68610a(cVar, this.f172060c, this.f172061d, this.f172062e));
    }

    public C68609n(AbstractC68307f<T> fVar, Consumer<? super AbstractC70022d> consumer, AbstractC68321m mVar, AbstractC68309a aVar) {
        super(fVar);
        this.f172060c = consumer;
        this.f172061d = mVar;
        this.f172062e = aVar;
    }
}

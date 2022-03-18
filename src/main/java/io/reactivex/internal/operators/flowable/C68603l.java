package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.l */
public final class C68603l<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68309a f172047c;

    /* renamed from: io.reactivex.internal.operators.flowable.l$a */
    static final class C68604a<T> extends BasicIntQueueSubscription<T> implements AbstractC68364a<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final AbstractC68364a<? super T> downstream;
        final AbstractC68309a onFinally;
        AbstractC68370g<T> qs;
        boolean syncFused;
        AbstractC70022d upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68364a
        public boolean tryOnNext(T t) {
            return this.downstream.tryOnNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof AbstractC68370g) {
                    this.qs = (AbstractC68370g) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            AbstractC68370g<T> gVar = this.qs;
            boolean z = false;
            if (gVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = gVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        C68604a(AbstractC68364a<? super T> aVar, AbstractC68309a aVar2) {
            this.downstream = aVar;
            this.onFinally = aVar2;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.l$b */
    static final class C68605b<T> extends BasicIntQueueSubscription<T> implements AbstractC68325i<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final AbstractC70021c<? super T> downstream;
        final AbstractC68309a onFinally;
        AbstractC68370g<T> qs;
        boolean syncFused;
        AbstractC70022d upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof AbstractC68370g) {
                    this.qs = (AbstractC68370g) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            AbstractC68370g<T> gVar = this.qs;
            boolean z = false;
            if (gVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = gVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        C68605b(AbstractC70021c<? super T> cVar, AbstractC68309a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (cVar instanceof AbstractC68364a) {
            this.f171934b.mo238000a((AbstractC68325i) new C68604a((AbstractC68364a) cVar, this.f172047c));
        } else {
            this.f171934b.mo238000a((AbstractC68325i) new C68605b(cVar, this.f172047c));
        }
    }

    public C68603l(AbstractC68307f<T> fVar, AbstractC68309a aVar) {
        super(fVar);
        this.f172047c = aVar;
    }
}

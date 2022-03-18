package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p3458f.C68308a;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.k */
public final class C68598k<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final long f172032c;

    /* renamed from: d */
    final TimeUnit f172033d;

    /* renamed from: e */
    final Scheduler f172034e;

    /* renamed from: f */
    final boolean f172035f;

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    static final class C68599a<T> implements AbstractC68325i<T>, AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f172036a;

        /* renamed from: b */
        final long f172037b;

        /* renamed from: c */
        final TimeUnit f172038c;

        /* renamed from: d */
        final Scheduler.AbstractC68257c f172039d;

        /* renamed from: e */
        final boolean f172040e;

        /* renamed from: f */
        AbstractC70022d f172041f;

        /* renamed from: io.reactivex.internal.operators.flowable.k$a$c */
        final class RunnableC68602c implements Runnable {

            /* renamed from: b */
            private final T f172046b;

            public void run() {
                C68599a.this.f172036a.onNext(this.f172046b);
            }

            RunnableC68602c(T t) {
                this.f172046b = t;
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.f172041f.cancel();
            this.f172039d.dispose();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.f172039d.mo44779a(new RunnableC68600a(), this.f172037b, this.f172038c);
        }

        /* renamed from: io.reactivex.internal.operators.flowable.k$a$a */
        final class RunnableC68600a implements Runnable {
            public void run() {
                try {
                    C68599a.this.f172036a.onComplete();
                } finally {
                    C68599a.this.f172039d.dispose();
                }
            }

            RunnableC68600a() {
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.k$a$b */
        final class RunnableC68601b implements Runnable {

            /* renamed from: b */
            private final Throwable f172044b;

            public void run() {
                try {
                    C68599a.this.f172036a.onError(this.f172044b);
                } finally {
                    C68599a.this.f172039d.dispose();
                }
            }

            RunnableC68601b(Throwable th) {
                this.f172044b = th;
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.f172041f.request(j);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.f172039d.mo44779a(new RunnableC68602c(t), this.f172037b, this.f172038c);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f172041f, dVar)) {
                this.f172041f = dVar;
                this.f172036a.onSubscribe(this);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            long j;
            Scheduler.AbstractC68257c cVar = this.f172039d;
            RunnableC68601b bVar = new RunnableC68601b(th);
            if (this.f172040e) {
                j = this.f172037b;
            } else {
                j = 0;
            }
            cVar.mo44779a(bVar, j, this.f172038c);
        }

        C68599a(AbstractC70021c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar2, boolean z) {
            this.f172036a = cVar;
            this.f172037b = j;
            this.f172038c = timeUnit;
            this.f172039d = cVar2;
            this.f172040e = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        C68308a aVar;
        if (this.f172035f) {
            aVar = cVar;
        } else {
            aVar = new C68308a(cVar);
        }
        this.f171934b.mo238000a((AbstractC68325i) new C68599a(aVar, this.f172032c, this.f172033d, this.f172034e.createWorker(), this.f172035f));
    }

    public C68598k(AbstractC68307f<T> fVar, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(fVar);
        this.f172032c = j;
        this.f172033d = timeUnit;
        this.f172034e = scheduler;
        this.f172035f = z;
    }
}

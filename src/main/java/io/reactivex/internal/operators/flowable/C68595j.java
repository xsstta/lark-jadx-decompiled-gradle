package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.p3458f.C68308a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.j */
public final class C68595j<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final long f172029c;

    /* renamed from: d */
    final TimeUnit f172030d;

    /* renamed from: e */
    final Scheduler f172031e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.j$a */
    public static final class RunnableC68596a<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final C68597b<T> parent;
        final T value;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void run() {
            emit();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.emit(this.idx, this.value, this);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        RunnableC68596a(T t, long j, C68597b<T> bVar) {
            this.value = t;
            this.idx = j;
            this.parent = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.j$b */
    public static final class C68597b<T> extends AtomicLong implements AbstractC68325i<T>, AbstractC70022d {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final AbstractC70021c<? super T> downstream;
        volatile long index;
        final long timeout;
        Disposable timer;
        final TimeUnit unit;
        AbstractC70022d upstream;
        final Scheduler.AbstractC68257c worker;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                Disposable disposable = this.timer;
                if (disposable != null) {
                    disposable.dispose();
                }
                RunnableC68596a aVar = (RunnableC68596a) disposable;
                if (aVar != null) {
                    aVar.emit();
                }
                this.downstream.onComplete();
                this.worker.dispose();
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
            Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            this.downstream.onError(th);
            this.worker.dispose();
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
                long j = this.index + 1;
                this.index = j;
                Disposable disposable = this.timer;
                if (disposable != null) {
                    disposable.dispose();
                }
                RunnableC68596a aVar = new RunnableC68596a(t, j, this);
                this.timer = aVar;
                aVar.setResource(this.worker.mo44779a(aVar, this.timeout, this.unit));
            }
        }

        /* access modifiers changed from: package-private */
        public void emit(long j, T t, RunnableC68596a<T> aVar) {
            if (j != this.index) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                C68977b.m265549b(this, 1);
                aVar.dispose();
                return;
            }
            cancel();
            this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }

        C68597b(AbstractC70021c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar2) {
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68597b(new C68308a(cVar), this.f172029c, this.f172030d, this.f172031e.createWorker()));
    }

    public C68595j(AbstractC68307f<T> fVar, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(fVar);
        this.f172029c = j;
        this.f172030d = timeUnit;
        this.f172031e = scheduler;
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.f */
public final class C68574f<T, R> extends AbstractC68522a<T, R> {

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends R>> f172011c;

    /* renamed from: d */
    final int f172012d;

    /* renamed from: e */
    final ErrorMode f172013e;

    /* renamed from: io.reactivex.internal.operators.flowable.f$e */
    interface AbstractC68580e<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    /* renamed from: io.reactivex.internal.operators.flowable.f$a */
    static abstract class AbstractC68576a<T, R> extends AtomicInteger implements AbstractC68325i<T>, AbstractC68580e<R>, AbstractC70022d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final AtomicThrowable errors = new AtomicThrowable();
        final C68579d<R> inner = new C68579d<>(this);
        final int limit;
        final Function<? super T, ? extends AbstractC70020b<? extends R>> mapper;
        final int prefetch;
        AbstractC68373j<T> queue;
        int sourceMode;
        AbstractC70022d upstream;

        /* access modifiers changed from: package-private */
        public abstract void drain();

        /* access modifiers changed from: package-private */
        public abstract void subscribeActual();

        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68580e
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public final void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof AbstractC68370g) {
                    AbstractC68370g gVar = (AbstractC68370g) dVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = gVar;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = gVar;
                        subscribeActual();
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                dVar.request((long) this.prefetch);
            }
        }

        AbstractC68576a(Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i) {
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.f$b */
    public static final class C68577b<T, R> extends AbstractC68576a<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final AbstractC70021c<? super R> downstream;
        final boolean veryEnd;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68576a
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: io.reactivex.functions.Function */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68576a
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        if (!z2 || this.veryEnd || ((Throwable) this.errors.get()) == null) {
                            try {
                                Object poll = this.queue.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    Throwable terminate = this.errors.terminate();
                                    if (terminate != null) {
                                        this.downstream.onError(terminate);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                        if (this.sourceMode != 1) {
                                            int i = this.consumed + 1;
                                            if (i == this.limit) {
                                                this.consumed = 0;
                                                this.upstream.request((long) i);
                                            } else {
                                                this.consumed = i;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) bVar).call();
                                                if (call == null) {
                                                    continue;
                                                } else if (this.inner.isUnbounded()) {
                                                    this.downstream.onNext(call);
                                                } else {
                                                    this.active = true;
                                                    this.inner.setSubscription(new C68581f(call, this.inner));
                                                }
                                            } catch (Throwable th) {
                                                C68306a.m265071b(th);
                                                this.upstream.cancel();
                                                this.errors.addThrowable(th);
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                        } else {
                                            this.active = true;
                                            bVar.subscribe(this.inner);
                                        }
                                    } catch (Throwable th2) {
                                        C68306a.m265071b(th2);
                                        this.upstream.cancel();
                                        this.errors.addThrowable(th2);
                                        this.downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C68306a.m265071b(th3);
                                this.upstream.cancel();
                                this.errors.addThrowable(th3);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        } else {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68580e
        public void innerNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68580e
        public void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68577b(AbstractC70021c<? super R> cVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.downstream = cVar;
            this.veryEnd = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.f$c */
    public static final class C68578c<T, R> extends AbstractC68576a<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final AbstractC70021c<? super R> downstream;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68576a
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: io.reactivex.functions.Function */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68576a
        public void drain() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            Object poll = this.queue.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.downstream.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request((long) i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) bVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                this.inner.setSubscription(new C68581f(call, this.inner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.onNext(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(this.errors.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C68306a.m265071b(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        bVar.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    C68306a.m265071b(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C68306a.m265071b(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68580e
        public void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.C68574f.AbstractC68580e
        public void innerNext(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r);
                if (!compareAndSet(1, 0)) {
                    this.downstream.onError(this.errors.terminate());
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68578c(AbstractC70021c<? super R> cVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i) {
            super(function, i);
            this.downstream = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.f$1 */
    public static /* synthetic */ class C685751 {

        /* renamed from: a */
        static final /* synthetic */ int[] f172014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.reactivex.internal.util.ErrorMode[] r0 = io.reactivex.internal.util.ErrorMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.C68574f.C685751.f172014a = r0
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.BOUNDARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = io.reactivex.internal.operators.flowable.C68574f.C685751.f172014a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.C68574f.C685751.<clinit>():void");
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.f$d */
    static final class C68579d<R> extends SubscriptionArbiter implements AbstractC68325i<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final AbstractC68580e<R> parent;
        long produced;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.parent.innerComplete();
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            setSubscription(dVar);
        }

        C68579d(AbstractC68580e<R> eVar) {
            super(false);
            this.parent = eVar;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(R r) {
            this.produced++;
            this.parent.innerNext(r);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.parent.innerError(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.f$f */
    public static final class C68581f<T> implements AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f172015a;

        /* renamed from: b */
        final T f172016b;

        /* renamed from: c */
        boolean f172017c;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (j > 0 && !this.f172017c) {
                this.f172017c = true;
                AbstractC70021c<? super T> cVar = this.f172015a;
                cVar.onNext(this.f172016b);
                cVar.onComplete();
            }
        }

        C68581f(T t, AbstractC70021c<? super T> cVar) {
            this.f172016b = t;
            this.f172015a = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        if (!ap.m265312a(this.f171934b, cVar, this.f172011c)) {
            this.f171934b.subscribe(m265327a(cVar, this.f172011c, this.f172012d, this.f172013e));
        }
    }

    public C68574f(AbstractC68307f<T> fVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, ErrorMode errorMode) {
        super(fVar);
        this.f172011c = function;
        this.f172012d = i;
        this.f172013e = errorMode;
    }

    /* renamed from: a */
    public static <T, R> AbstractC70021c<T> m265327a(AbstractC70021c<? super R> cVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, ErrorMode errorMode) {
        int i2 = C685751.f172014a[errorMode.ordinal()];
        if (i2 == 1) {
            return new C68577b(cVar, function, i, false);
        }
        if (i2 != 2) {
            return new C68578c(cVar, function, i);
        }
        return new C68577b(cVar, function, i, true);
    }
}

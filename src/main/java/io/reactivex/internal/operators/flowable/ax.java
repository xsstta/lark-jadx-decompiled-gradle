package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class ax<T, R> extends AbstractC68307f<R> {

    /* renamed from: b */
    final AbstractC70020b<? extends T>[] f171993b;

    /* renamed from: c */
    final Iterable<? extends AbstractC70020b<? extends T>> f171994c;

    /* renamed from: d */
    final Function<? super Object[], ? extends R> f171995d;

    /* renamed from: e */
    final int f171996e;

    /* renamed from: f */
    final boolean f171997f;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.ax$b */
    public static final class C68566b<T, R> extends AtomicReference<AbstractC70022d> implements AbstractC68325i<T>, AbstractC70022d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final C68565a<T, R> parent;
        final int prefetch;
        long produced;
        AbstractC68373j<T> queue;
        int sourceMode;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((AbstractC70022d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof AbstractC68370g) {
                    AbstractC68370g gVar = (AbstractC68370g) dVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = gVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = gVar;
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                dVar.request((long) this.prefetch);
            }
        }

        C68566b(C68565a<T, R> aVar, int i) {
            this.parent = aVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.ax$a */
    static final class C68565a<T, R> extends AtomicInteger implements AbstractC70022d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final AbstractC70021c<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final C68566b<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
            }
        }

        /* access modifiers changed from: package-private */
        public void cancelAll() {
            for (C68566b<T, R> bVar : this.subscribers) {
                bVar.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            int i;
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                AbstractC70021c<? super R> cVar = this.downstream;
                C68566b<T, R>[] bVarArr = this.subscribers;
                int length = bVarArr.length;
                Object[] objArr = this.current;
                int i2 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (this.cancelled) {
                            return;
                        } else {
                            if (this.delayErrors || this.errors.get() == null) {
                                boolean z3 = false;
                                for (int i3 = 0; i3 < length; i3++) {
                                    C68566b<T, R> bVar = bVarArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z4 = bVar.done;
                                            AbstractC68373j<T> jVar = bVar.queue;
                                            T poll = jVar != null ? jVar.poll() : null;
                                            if (poll == null) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (!z4 || !z2) {
                                                if (!z2) {
                                                    objArr[i3] = poll;
                                                }
                                                z3 = true;
                                            } else {
                                                cancelAll();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    cVar.onError(this.errors.terminate());
                                                    return;
                                                } else {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C68306a.m265071b(th);
                                            this.errors.addThrowable(th);
                                            if (!this.delayErrors) {
                                                cancelAll();
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                try {
                                    cVar.onNext((Object) C68362b.m265229a(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, (Object) null);
                                } catch (Throwable th2) {
                                    C68306a.m265071b(th2);
                                    cancelAll();
                                    this.errors.addThrowable(th2);
                                    cVar.onError(this.errors.terminate());
                                    return;
                                }
                            } else {
                                cancelAll();
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                    }
                    if (i == 0) {
                        if (this.cancelled) {
                            return;
                        }
                        if (this.delayErrors || this.errors.get() == null) {
                            for (int i4 = 0; i4 < length; i4++) {
                                C68566b<T, R> bVar2 = bVarArr[i4];
                                if (objArr[i4] == null) {
                                    try {
                                        boolean z5 = bVar2.done;
                                        AbstractC68373j<T> jVar2 = bVar2.queue;
                                        T poll2 = jVar2 != null ? jVar2.poll() : null;
                                        if (poll2 == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z5 && z) {
                                            cancelAll();
                                            if (((Throwable) this.errors.get()) != null) {
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            } else {
                                                cVar.onComplete();
                                                return;
                                            }
                                        } else if (!z) {
                                            objArr[i4] = poll2;
                                        }
                                    } catch (Throwable th3) {
                                        C68306a.m265071b(th3);
                                        this.errors.addThrowable(th3);
                                        if (!this.delayErrors) {
                                            cancelAll();
                                            cVar.onError(this.errors.terminate());
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (C68566b<T, R> bVar3 : bVarArr) {
                            bVar3.request(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void error(C68566b<T, R> bVar, Throwable th) {
            if (this.errors.addThrowable(th)) {
                bVar.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void subscribe(AbstractC70020b<? extends T>[] bVarArr, int i) {
            C68566b<T, R>[] bVarArr2 = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (this.delayErrors || this.errors.get() == null) {
                    bVarArr[i2].subscribe(bVarArr2[i2]);
                } else {
                    return;
                }
            }
        }

        C68565a(AbstractC70021c<? super R> cVar, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = cVar;
            this.zipper = function;
            this.delayErrors = z;
            C68566b<T, R>[] bVarArr = new C68566b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C68566b<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = bVarArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        int i;
        AbstractC70020b<? extends T>[] bVarArr = this.f171993b;
        if (bVarArr == null) {
            bVarArr = new AbstractC70020b[8];
            i = 0;
            for (AbstractC70020b<? extends T> bVar : this.f171994c) {
                if (i == bVarArr.length) {
                    AbstractC70020b<? extends T>[] bVarArr2 = new AbstractC70020b[((i >> 2) + i)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                    bVarArr = bVarArr2;
                }
                bVarArr[i] = bVar;
                i++;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            EmptySubscription.complete(cVar);
            return;
        }
        C68565a aVar = new C68565a(cVar, this.f171995d, i, this.f171996e, this.f171997f);
        cVar.onSubscribe(aVar);
        aVar.subscribe(bVarArr, i);
    }

    public ax(AbstractC70020b<? extends T>[] bVarArr, Iterable<? extends AbstractC70020b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f171993b = bVarArr;
        this.f171994c = iterable;
        this.f171995d = function;
        this.f171996e = i;
        this.f171997f = z;
    }
}

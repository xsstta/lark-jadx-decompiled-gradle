package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.ad */
public final class C68531ad<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final int f171942c;

    /* renamed from: d */
    final boolean f171943d;

    /* renamed from: e */
    final boolean f171944e;

    /* renamed from: f */
    final AbstractC68309a f171945f;

    /* renamed from: io.reactivex.internal.operators.flowable.ad$a */
    static final class C68532a<T> extends BasicIntQueueSubscription<T> implements AbstractC68325i<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final AbstractC70021c<? super T> downstream;
        Throwable error;
        final AbstractC68309a onOverflow;
        boolean outputFused;
        final AbstractC68372i<T> queue;
        final AtomicLong requested = new AtomicLong();
        AbstractC70022d upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC68372i<T> iVar = this.queue;
                AbstractC70021c<? super T> cVar = this.downstream;
                int i2 = 1;
                while (!checkTerminated(this.done, iVar.isEmpty(), cVar)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.done;
                        T poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !checkTerminated(this.done, iVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (!this.outputFused && SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC70021c<? super T> cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }

        C68532a(AbstractC70021c<? super T> cVar, int i, boolean z, boolean z2, AbstractC68309a aVar) {
            AbstractC68372i<T> iVar;
            this.downstream = cVar;
            this.onOverflow = aVar;
            this.delayError = z2;
            if (z) {
                iVar = new C68926b<>(i);
            } else {
                iVar = new SpscArrayQueue<>(i);
            }
            this.queue = iVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68532a(cVar, this.f171942c, this.f171943d, this.f171944e, this.f171945f));
    }

    public C68531ad(AbstractC68307f<T> fVar, int i, boolean z, boolean z2, AbstractC68309a aVar) {
        super(fVar);
        this.f171942c = i;
        this.f171943d = z;
        this.f171944e = z2;
        this.f171945f = aVar;
    }
}

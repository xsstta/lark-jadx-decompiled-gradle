package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.ag */
public final class C68537ag<T> extends AbstractC68522a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.ag$a */
    static final class C68538a<T> extends AtomicInteger implements AbstractC68325i<T>, AbstractC70022d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final AbstractC70021c<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        AbstractC70022d upstream;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                AbstractC70021c<? super T> cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z3, z2, cVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (checkTerminated(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C68977b.m265549b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
            }
        }

        C68538a(AbstractC70021c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC70021c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            }
        }
    }

    public C68537ag(AbstractC68307f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68538a(cVar));
    }
}

package io.reactivex.p3455c;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.c.c */
public final class C68276c<T> extends AbstractC68274a<T> {

    /* renamed from: b */
    final C68926b<T> f171569b;

    /* renamed from: c */
    final AtomicReference<Runnable> f171570c;

    /* renamed from: d */
    final boolean f171571d;

    /* renamed from: e */
    volatile boolean f171572e;

    /* renamed from: f */
    Throwable f171573f;

    /* renamed from: g */
    final AtomicReference<AbstractC70021c<? super T>> f171574g;

    /* renamed from: h */
    volatile boolean f171575h;

    /* renamed from: i */
    final AtomicBoolean f171576i;

    /* renamed from: j */
    final BasicIntQueueSubscription<T> f171577j;

    /* renamed from: k */
    final AtomicLong f171578k;

    /* renamed from: l */
    boolean f171579l;

    /* renamed from: io.reactivex.c.c$a */
    final class C68277a extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            C68276c.this.f171569b.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return C68276c.this.f171569b.isEmpty();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() {
            return C68276c.this.f171569b.poll();
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            if (!C68276c.this.f171575h) {
                C68276c.this.f171575h = true;
                C68276c.this.mo237914n();
                if (!C68276c.this.f171579l && C68276c.this.f171577j.getAndIncrement() == 0) {
                    C68276c.this.f171569b.clear();
                    C68276c.this.f171574g.lazySet(null);
                }
            }
        }

        C68277a() {
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C68276c.this.f171579l = true;
            return 2;
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(C68276c.this.f171578k, j);
                C68276c.this.mo237915o();
            }
        }
    }

    @CheckReturnValue
    /* renamed from: m */
    public static <T> C68276c<T> m265013m() {
        return new C68276c<>(m265072a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo237914n() {
        Runnable andSet = this.f171570c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (!this.f171572e && !this.f171575h) {
            this.f171572e = true;
            mo237914n();
            mo237915o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo237915o() {
        if (this.f171577j.getAndIncrement() == 0) {
            int i = 1;
            AbstractC70021c<? super T> cVar = this.f171574g.get();
            while (cVar == null) {
                i = this.f171577j.addAndGet(-i);
                if (i != 0) {
                    cVar = this.f171574g.get();
                } else {
                    return;
                }
            }
            if (this.f171579l) {
                mo237913c(cVar);
            } else {
                mo237912b((AbstractC70021c) cVar);
            }
        }
    }

    C68276c(int i) {
        this(i, null, true);
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68276c<T> m265012a(int i) {
        return new C68276c<>(i);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        C68362b.m265229a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f171572e || this.f171575h) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f171573f = th;
        this.f171572e = true;
        mo237914n();
        mo237915o();
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        C68362b.m265229a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f171572e && !this.f171575h) {
            this.f171569b.offer(t);
            mo237915o();
        }
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (this.f171572e || this.f171575h) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (this.f171576i.get() || !this.f171576i.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f171577j);
        this.f171574g.set(cVar);
        if (this.f171575h) {
            this.f171574g.lazySet(null);
        } else {
            mo237915o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237912b(AbstractC70021c<? super T> cVar) {
        int i;
        long j;
        boolean z;
        C68926b<T> bVar = this.f171569b;
        boolean z2 = !this.f171571d;
        int i2 = 1;
        while (true) {
            long j2 = this.f171578k.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i == 0) {
                    j = j3;
                    break;
                }
                boolean z3 = this.f171572e;
                T poll = bVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                j = j3;
                if (!mo237911a(z2, z3, z, cVar, bVar)) {
                    if (z) {
                        break;
                    }
                    cVar.onNext(poll);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            if (i != 0 || !mo237911a(z2, this.f171572e, bVar.isEmpty(), cVar, bVar)) {
                if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                    this.f171578k.addAndGet(-j);
                }
                i2 = this.f171577j.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo237913c(AbstractC70021c<? super T> cVar) {
        C68926b<T> bVar = this.f171569b;
        int i = 1;
        boolean z = !this.f171571d;
        while (!this.f171575h) {
            boolean z2 = this.f171572e;
            if (!z || !z2 || this.f171573f == null) {
                cVar.onNext(null);
                if (z2) {
                    this.f171574g.lazySet(null);
                    Throwable th = this.f171573f;
                    if (th != null) {
                        cVar.onError(th);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                } else {
                    i = this.f171577j.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                bVar.clear();
                this.f171574g.lazySet(null);
                cVar.onError(this.f171573f);
                return;
            }
        }
        bVar.clear();
        this.f171574g.lazySet(null);
    }

    C68276c(int i, Runnable runnable, boolean z) {
        this.f171569b = new C68926b<>(C68362b.m265225a(i, "capacityHint"));
        this.f171570c = new AtomicReference<>(runnable);
        this.f171571d = z;
        this.f171574g = new AtomicReference<>();
        this.f171576i = new AtomicBoolean();
        this.f171577j = new C68277a();
        this.f171578k = new AtomicLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237911a(boolean z, boolean z2, boolean z3, AbstractC70021c<? super T> cVar, C68926b<T> bVar) {
        if (this.f171575h) {
            bVar.clear();
            this.f171574g.lazySet(null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.f171573f != null) {
                bVar.clear();
                this.f171574g.lazySet(null);
                cVar.onError(this.f171573f);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.f171573f;
                this.f171574g.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }
}

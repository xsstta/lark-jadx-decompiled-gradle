package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.c.y */
public final class C68515y<T, R> extends AbstractC68307f<R> {

    /* renamed from: b */
    final AbstractC69015w<T> f171923b;

    /* renamed from: c */
    final Function<? super T, ? extends Iterable<? extends R>> f171924c;

    /* renamed from: io.reactivex.internal.operators.c.y$a */
    static final class C68516a<T, R> extends BasicIntQueueSubscription<R> implements AbstractC69012t<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final AbstractC70021c<? super R> downstream;
        volatile Iterator<? extends R> it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.it = null;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            if (this.it == null) {
                return true;
            }
            return false;
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public R poll() throws Exception {
            Iterator<? extends R> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            R r = (R) C68362b.m265229a(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.it = null;
            }
            return r;
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                AbstractC70021c<? super R> cVar = this.downstream;
                Iterator<? extends R> it2 = this.it;
                if (!this.outputFused || it2 == null) {
                    int i = 1;
                    while (true) {
                        if (it2 != null) {
                            long j = this.requested.get();
                            if (j == Long.MAX_VALUE) {
                                slowPath(cVar, it2);
                                return;
                            }
                            long j2 = 0;
                            while (j2 != j) {
                                if (!this.cancelled) {
                                    try {
                                        cVar.onNext((Object) C68362b.m265229a(it2.next(), "The iterator returned a null value"));
                                        if (!this.cancelled) {
                                            j2++;
                                            try {
                                                if (!it2.hasNext()) {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                C68306a.m265071b(th);
                                                cVar.onError(th);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        C68306a.m265071b(th2);
                                        cVar.onError(th2);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                C68977b.m265549b(this.requested, j2);
                            }
                        }
                        i = addAndGet(-i);
                        if (i != 0) {
                            if (it2 == null) {
                                it2 = this.it;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    cVar.onNext(null);
                    cVar.onComplete();
                }
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
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

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                Iterator<T> it2 = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it2.hasNext()) {
                    this.downstream.onComplete();
                    return;
                }
                this.it = it2;
                drain();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
            }
        }

        C68516a(AbstractC70021c<? super R> cVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        /* access modifiers changed from: package-private */
        public void slowPath(AbstractC70021c<? super R> cVar, Iterator<? extends R> it2) {
            while (!this.cancelled) {
                try {
                    cVar.onNext((Object) it2.next());
                    if (!this.cancelled) {
                        try {
                            if (!it2.hasNext()) {
                                cVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            C68306a.m265071b(th);
                            cVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        this.f171923b.subscribe(new C68516a(cVar, this.f171924c));
    }

    public C68515y(AbstractC69015w<T> wVar, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f171923b = wVar;
        this.f171924c = function;
    }
}

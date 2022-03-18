package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.Iterator;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.w */
public final class C68626w<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final Iterable<? extends T> f172087b;

    /* renamed from: io.reactivex.internal.operators.flowable.w$a */
    static abstract class AbstractC68627a<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        @Override // org.p3511d.AbstractC70022d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final void clear() {
            this.it = null;
        }

        /* access modifiers changed from: package-private */
        public abstract void fastPath();

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public final int requestFusion(int i) {
            return i & 1;
        }

        /* access modifiers changed from: package-private */
        public abstract void slowPath(long j);

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final boolean isEmpty() {
            Iterator<? extends T> it2 = this.it;
            if (it2 == null || !it2.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final T poll() {
            Iterator<? extends T> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it2.hasNext()) {
                return null;
            }
            return (T) C68362b.m265229a(this.it.next(), "Iterator.next() returned a null value");
        }

        AbstractC68627a(Iterator<? extends T> it2) {
            this.it = it2;
        }

        @Override // org.p3511d.AbstractC70022d
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && C68977b.m265548a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.w$b */
    public static final class C68628b<T> extends AbstractC68627a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final AbstractC68364a<? super T> downstream;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68626w.AbstractC68627a
        public void fastPath() {
            Iterator it = this.it;
            AbstractC68364a<? super T> aVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (Object) it.next();
                    if (!this.cancelled) {
                        if (obj == 0) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        aVar.tryOnNext(obj);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        aVar.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C68306a.m265071b(th);
                                aVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68626w.AbstractC68627a
        public void slowPath(long j) {
            Iterator it = this.it;
            AbstractC68364a<? super T> aVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object obj = (Object) it.next();
                            if (!this.cancelled) {
                                if (obj == 0) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean tryOnNext = aVar.tryOnNext(obj);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                aVar.onComplete();
                                                return;
                                            }
                                            return;
                                        } else if (tryOnNext) {
                                            j2++;
                                        }
                                    } catch (Throwable th) {
                                        C68306a.m265071b(th);
                                        aVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        C68628b(AbstractC68364a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.w$c */
    public static final class C68629c<T> extends AbstractC68627a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final AbstractC70021c<? super T> downstream;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68626w.AbstractC68627a
        public void fastPath() {
            Iterator it = this.it;
            AbstractC70021c<? super T> cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (Object) it.next();
                    if (!this.cancelled) {
                        if (obj == 0) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        cVar.onNext(obj);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        cVar.onComplete();
                                        return;
                                    }
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

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68626w.AbstractC68627a
        public void slowPath(long j) {
            Iterator it = this.it;
            AbstractC70021c<? super T> cVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object obj = (Object) it.next();
                            if (!this.cancelled) {
                                if (obj == 0) {
                                    cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                cVar.onNext(obj);
                                if (!this.cancelled) {
                                    try {
                                        if (it.hasNext()) {
                                            j2++;
                                        } else if (!this.cancelled) {
                                            cVar.onComplete();
                                            return;
                                        } else {
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
            } while (j != 0);
        }

        C68629c(AbstractC70021c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }
    }

    public C68626w(Iterable<? extends T> iterable) {
        this.f172087b = iterable;
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        try {
            m265346a(cVar, this.f172087b.iterator());
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptySubscription.error(th, cVar);
        }
    }

    /* renamed from: a */
    public static <T> void m265346a(AbstractC70021c<? super T> cVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(cVar);
            } else if (cVar instanceof AbstractC68364a) {
                cVar.onSubscribe(new C68628b((AbstractC68364a) cVar, it));
            } else {
                cVar.onSubscribe(new C68629c(cVar, it));
            }
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptySubscription.error(th, cVar);
        }
    }
}

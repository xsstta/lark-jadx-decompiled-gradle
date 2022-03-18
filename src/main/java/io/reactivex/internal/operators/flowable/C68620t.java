package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.t */
public final class C68620t<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final T[] f172082b;

    /* renamed from: io.reactivex.internal.operators.flowable.t$c */
    static abstract class AbstractC68623c<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        @Override // org.p3511d.AbstractC70022d
        public final void cancel() {
            this.cancelled = true;
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
        public final void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final boolean isEmpty() {
            if (this.index == this.array.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final T poll() {
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            return (T) C68362b.m265229a((Object) tArr[i], "array element is null");
        }

        AbstractC68623c(T[] tArr) {
            this.array = tArr;
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

    /* renamed from: io.reactivex.internal.operators.flowable.t$a */
    static final class C68621a<T> extends AbstractC68623c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final AbstractC68364a<? super T> downstream;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68620t.AbstractC68623c
        public void fastPath() {
            Object[] objArr = this.array;
            int length = objArr.length;
            AbstractC68364a<? super T> aVar = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        aVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        aVar.tryOnNext(obj);
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68620t.AbstractC68623c
        public void slowPath(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            AbstractC68364a<? super T> aVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.index = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            aVar.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.tryOnNext(obj)) {
                            j2++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        C68621a(AbstractC68364a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.downstream = aVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.t$b */
    static final class C68622b<T> extends AbstractC68623c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final AbstractC70021c<? super T> downstream;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68620t.AbstractC68623c
        public void fastPath() {
            Object[] objArr = this.array;
            int length = objArr.length;
            AbstractC70021c<? super T> cVar = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        cVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        cVar.onNext(obj);
                    }
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68620t.AbstractC68623c
        public void slowPath(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            AbstractC70021c<? super T> cVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.index = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.cancelled) {
                            cVar.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            cVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        cVar.onNext(obj);
                        j2++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        C68622b(AbstractC70021c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }
    }

    public C68620t(T[] tArr) {
        this.f172082b = tArr;
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        if (cVar instanceof AbstractC68364a) {
            cVar.onSubscribe(new C68621a((AbstractC68364a) cVar, this.f172082b));
        } else {
            cVar.onSubscribe(new C68622b(cVar, this.f172082b));
        }
    }
}

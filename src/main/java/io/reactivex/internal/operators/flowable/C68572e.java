package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.e */
public final class C68572e<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final AbstractC70020b<? extends T>[] f172009b;

    /* renamed from: c */
    final boolean f172010c;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    static final class C68573a<T> extends SubscriptionArbiter implements AbstractC68325i<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final AbstractC70021c<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final AbstractC70020b<? extends T>[] sources;
        final AtomicInteger wip = new AtomicInteger();

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                AbstractC70020b<? extends T>[] bVarArr = this.sources;
                int length = bVarArr.length;
                int i = this.index;
                while (i != length) {
                    AbstractC70020b<? extends T> bVar = bVarArr[i];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0;
                            produced(j);
                        }
                        bVar.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list2));
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            setSubscription(dVar);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        C68573a(AbstractC70020b<? extends T>[] bVarArr, boolean z, AbstractC70021c<? super T> cVar) {
            super(false);
            this.downstream = cVar;
            this.sources = bVarArr;
            this.delayError = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        C68573a aVar = new C68573a(this.f172009b, this.f172010c, cVar);
        cVar.onSubscribe(aVar);
        aVar.onComplete();
    }

    public C68572e(AbstractC70020b<? extends T>[] bVarArr, boolean z) {
        this.f172009b = bVarArr;
        this.f172010c = z;
    }
}
